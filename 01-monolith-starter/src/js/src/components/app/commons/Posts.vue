<template lang="html">
  <div class="posts">
    <div v-for="post in posts">
      <Post :post="post"/>
    </div>
  </div>
</template>

<script>
  import Post from './Post';
  export default {
    name: 'posts',
    components: { Post },
    data: () => ({
      posts: [
        { body: 'ololo', },
        { body: 'trololo', },
      ],
    }),
  }
</script>

<style lang="css">

</style>
