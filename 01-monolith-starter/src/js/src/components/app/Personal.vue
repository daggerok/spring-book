<template lang="html">
  <div class="personal">
    <NavBar/>
    <Posts/>
  </div>
</template>

<script>
  import NavBar from './commons/NavBar';
  import Posts from './commons/Posts';
  export default {
    name: 'personal',
    components: { Posts, NavBar },
  }
</script>

<style lang="css">

</style>
