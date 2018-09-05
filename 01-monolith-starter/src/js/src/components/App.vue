<template lang="html">
  <div class="app">
    <NavBar/>
    <PublicFeed/>
    <PersonalFeed/>
  </div>
</template>

<script>
  import PublicFeed from './app/PublicFeed';
  import PersonalFeed from './app/PersonalFeed';
  import NavBar from './app/commons/NavBar';
  export default {
    name: 'app',
    components: {
      NavBar,
      PublicFeed,
      PersonalFeed,
    },
  }
</script>

<style lang="css">

</style>
