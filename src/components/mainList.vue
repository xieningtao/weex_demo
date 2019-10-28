<template>
  <div class="wrap">
  
   <wxc-minibar    title="标题AAAAAAAAAAAAAAA"
                   background-color="#009ff0"
                   text-color="#ffffff"
                   right-text="更多"
                   left-button=""
                   @wxcMinibarRightButtonClicked="rightButtonClick"></wxc-minibar>
                  
    <list>
      <cell class='item-container' v-for="item in lists" @click="itemClick(item)">
        <div class='divider'/>
          <div class='text-container'>
          <text class='item'>{{item}}</text>
        </div>
      </cell>
    </list>
  </div>
</template>

<script>
import { WxcMinibar } from 'weex-ui';
// eslint-disable-next-line
import HelloWorld from '@/components/HelloWorld'
const modal = weex.requireModule('modal');
var navigator = weex.requireModule('navigator')
// const toast = message => {
//   modal.toast({
//     message,
//     duration: 1,
//   });
// };
export default {
  /* eslint-disable */
  // eslint-disable-next-line
  name: 'App',
  components: {
    HelloWorld,WxcMinibar
  },
  data () {
    return {
      logo: 'https://gw.alicdn.com/tfs/TB1yopEdgoQMeJjy1XaXXcSsFXa-640-302.png',
      lists:['11111111111','22222222222','3333333333','4444444444444','55555555555555','666666666666666']
    }
  },
  created () {
    console.log('mainList oncreated')
    for(var i =0;i<40;i++) {
      this.lists.push("itemV123####"+i)
    }
    // this.$router.push('home')
  },
  methods:{
    rightButtonClick(){
        console.log('rightButtonClick')
    },
    log:function(event){
      console.log('clickme')
    },
    itemClick(item){
      debugger
      console.log("item: "+item)
      this.$router.push('detail')
      // navigator.push({url:'http://10.224.121.20:8081/dist/components/detail.js'})
    }
  }
}
</script>


<style>

 .wrapper {
    /* justify-content: center;
    align-items: center; */
    flex:1
  }
    .text-container{
     padding:20px;
     /* background-color:#662233; */
     /* width:100vw; */
   }
  .item{
    /* height:80px; */
    
    text-align:center;
    /* flex:1; */
  }
  .item-container{
    flex-direction:column;
    /* height:140px; */
    /* width:100vw; */
    background-color:#22ffff;
    /* flex:1; */
    /* display:flex; */
    /* flex-direction:row; */
    align-items:center;
    justify-content:center;
  }
  .divider{
    background-color:gray;
    height:2px;
    position:absolute;
    left:0;
    right:0;
    top:0;
    /* width:500px; */
    /* flex-grow:3; */
  }
  .titleBar{
    width:750px;
    height:120px;
    align-items: flex-start;
  }
</style>