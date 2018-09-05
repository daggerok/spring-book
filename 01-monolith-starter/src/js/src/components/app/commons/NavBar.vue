<template lang="html">
  <nav class="nav-bar">
    <span class="banner">App</span>
    |
    <span @click="store.mutate.setCurrentTab(tabs.PUBLIC_FEED)">Public feed</span>
    |
    <span @click="store.mutate.setCurrentTab(tabs.PERSONAL_FEED)">Personal feed</span>
  </nav>
</template>

<script>
  export default {
    name: 'nav-bar',
    mounted() {
      this.store = this.$root.$data.store;
    },
    data: () => ({
      store: {}, // lazy
    }),
    computed: {
      tabs() {
        return this.store.state.tabs;
      },
      currentTab() {
        return this.store.state.currentTab;
      },
    },
  }
</script>

<style lang="css">

</style>
