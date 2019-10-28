<template>
  <div class="wrap">
 <div class="titleBar">
   <wxc-minibar    title="标题AAAAAAAAAAAAAAA"
                   background-color="#009ff0"
                   text-color="#ffffff"
                   right-text="更多"
                  :use-default-return="false"
                   @wxcMinibarLeftButtonClicked="leftButtonClick"
                   @wxcMinibarRightButtonClicked="rightButtonClick"></wxc-minibar>
                   </div>
  <text >Now, let's use Vue.js to build your Weex app.ssssssssssssssssssssssss</text>
  </div>
</template>

<script>
import { WxcMinibar } from 'weex-ui';
export default {
  components: {
    WxcMinibar 
  },
    methods:{
      leftButtonClick () {
        console.log('minibarLeftButtonClick')
        this.$router.go(-1)
      },
      rightButtonClick () {
       console.log('minibarRightButtonClick')
      },
    }
}
</script>