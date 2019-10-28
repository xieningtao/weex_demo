<template>
  <div class="wrapper">
     <router-view></router-view>
  </div>
</template>

<script>
export default {

created () {
    console.log('oncreated')
    // for(var i =0;i<40;i++) {
    //   this.lists.push("item#######"+i)
    // }
    this.$router.push('home')
  },
}
</script>
<style scoped>
  .wrapper {
    /* justify-content: center;
    align-items: center; */
    flex:1
  }
  .logo {
    width: 424px;
    height: 200px;
  }
  .greeting {
    text-align: center;
    margin-top: 70px;
    font-size: 50px;
    color: #41B883;
    
  }
  .message {
    margin: 30px;
    font-size: 32px;
    color: #727272;
  }

  .button{
    width: 120px;
    height: 80px;
    background-color: aqua;
  }

 
</style>
