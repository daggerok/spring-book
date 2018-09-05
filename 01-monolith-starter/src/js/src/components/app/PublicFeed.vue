<template lang="html">
  <div class="public-feed"
       v-if="this.$root.$data.store.state.currentTab === this.$root.$data.store.state.tabs.publicFeed">
    <h2>Public Feed</h2>
    <p>public feed</p>
  </div>
</template>

<script>
  import Posts from './commons/Posts';
  export default {
    name: 'public-feed',
    components: { Posts },
    mounted() {
      console.log(this.$vnode.tag, this.$root.$data.store);
    },
  }
</script>

<style lang="css">

</style>
