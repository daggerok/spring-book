<template lang="html">
  <div class="public-feed"
       v-if="currentTab === tabs.PUBLIC_FEED">
    <h2>Public Feed</h2>
    <p>public feed</p>
  </div>
</template>

<script>
  import Posts from './commons/Posts';
  export default {
    name: 'public-feed',
    components: { Posts },
    data: () => ({
      store: {},
    }),
    mounted() {
      this.store = this.$root.$data.store;
    },
    computed: {
      state() {
        return this.store.state || {};
      },
      tabs() {
        return this.state.tabs || {};
      },
      currentTab() {
        return this.state.currentTab || {};
      },
    },
  }
</script>

<style lang="css">

</style>
