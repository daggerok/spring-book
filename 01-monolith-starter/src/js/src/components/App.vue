<template lang="html">
  <div class="app">
    <h1>App</h1>
    <Feed/>
    <Personal/>
  </div>
</template>

<script>
  import Feed from './app/Feed';
  import Personal from './app/Personal';
  export default {
    name: 'app',
    components: {
      Feed,
      Personal,
    },
  }
</script>

<style lang="css">

</style>
