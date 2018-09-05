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
    ]
  }
</script>

<style lang="css">

</style>
