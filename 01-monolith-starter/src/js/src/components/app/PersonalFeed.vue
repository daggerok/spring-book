<template lang="html">
  <div class="personal-feed"
       v-if="currentTab === tabs.PERSONAL_FEED">
    <h2>Personal Feed</h2>
    <p>personal feed</p>
  </div>
</template>

<script>
  import Posts from './commons/Posts';
  export default {
    name: 'personal-feed',
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
