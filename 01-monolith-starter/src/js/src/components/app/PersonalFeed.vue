<template lang="html">
  <div class="personal-feed"
       v-if="this.$root.$data.store.state.currentTab === this.$root.$data.store.state.tabs.personalFeed">
    <h2>Personal Feed</h2>
    <p>personal feed</p>
  </div>
</template>

<script>
  import Posts from './commons/Posts';
  export default {
    name: 'personal-feed',
    components: { Posts },
    mounted() {
      console.log(this.$vnode.tag, this.$root.$data.store);
    },
  }
</script>

<style lang="css">

</style>
