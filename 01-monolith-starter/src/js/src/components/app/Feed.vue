<template lang="html">
  <div class="feed">
    <NavBar/>
    <Posts/>
  </div>
</template>

<script>
  import NavBar from './commons/NavBar';
  import Posts from './commons/Posts';
  export default {
    name: 'feed',
    components: { Posts, NavBar },
  }
</script>

<style lang="css">

</style>
