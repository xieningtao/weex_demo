import Vue from 'vue';
import weex from 'weex-vue-render';
import router from '@/webrouter'
import App from '@/my_index'
weex.init(Vue)


new Vue(Vue.util.extend({ el: '#root', router}, App));

// App.el = '#root'
// App.router =  router
// new Vue(App)
// router.push('home')
