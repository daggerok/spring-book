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
    mounted() {
      console.log(this.$vnode.tag, this.props.posts);
    },
  }
</script>

<style lang="css">

</style>
