import Detail from '@/components/detail'
import MainList from '@/components/mainList'
import VueRouter from 'vue-router'

Vue.use(VueRouter)
let routes = [
    {path: '/detail',name:'detail', component: Detail},
    {path:'/home',name:'home',component:MainList},
    {path:'/',redirect: '/home'}
]
const router = new VueRouter({
    routes // (缩写) 相当于 routes: routes
  })
module.exports = router