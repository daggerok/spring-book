<template lang="html">
  <div class="post">
    {{ post.body }}
  </div>
</template>

<script>
  export default {
    name: 'post',
    props: [
      'post',
    ],
    mounted() {
      //console.log(this.$vnode.tag, this.props.post);
    },
  }
</script>

<style lang="css">

</style>
