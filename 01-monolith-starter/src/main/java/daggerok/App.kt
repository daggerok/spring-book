package daggerok

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.core.io.ClassPathResource
import org.springframework.http.MediaType.APPLICATION_JSON_UTF8
import org.springframework.http.MediaType.TEXT_HTML
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.body
import org.springframework.web.reactive.function.server.router
import reactor.core.publisher.Mono
import reactor.core.publisher.toMono

@SpringBootApplication
class App(@Value("\${classpath:/public/index.html}") val innerHTML: ClassPathResource) {
  val index: Mono<ServerResponse> by lazy {
    //permanentRedirect(URI.create("/index.html")).build()
    ok().contentType(TEXT_HTML).syncBody(innerHTML)
  }

  @Bean fun routes() = router {
    "/".nest {
      resources("/**", ClassPathResource("/public/"))
      arrayOf("/", "/404", "/error").forEach {
        GET(it) { index }
      }
      contentType(APPLICATION_JSON_UTF8)
      GET("/api/**") {
        ok().body(
            mapOf("message" to "Hello, World!").toMono()
        )
      }
    }
  }
}

fun main(args: Array<String>) {
  runApplication<App>(*args)
}
