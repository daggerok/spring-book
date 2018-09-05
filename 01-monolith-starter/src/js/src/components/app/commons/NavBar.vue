<template lang="html">
  <nav class="nav-bar">
    <span class="banner">App</span>
    |
    <span>Public feed</span>
    |
    <span>Personal feed</span>
  </nav>
</template>

<script>
  export default {
    name: 'nav-bar',
    mounted() {
      console.log(this.$vnode.tag, this.$root.$data.store);
    },
  }
</script>

<style lang="css">

</style>
