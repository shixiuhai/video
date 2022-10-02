<template>
  <div class="home-container">
    <!-- 头部区域 -->
    <!-- 使用search组件 -->
    <!-- <Search :a="msg" ></Search> -->
    <!-- 子组件传值给父组件 -->
    <!-- <Search @aaa="getValue"></Search> -->
    <Search v-show="true"></Search>
    
    
    <!-- <h1>{{value}}</h1> -->
    <!-- 展示电影信息页面 -->
    <VideoList></VideoList>

    
  </div>
</template>

<script>
// 导入   homeApi.js 里面的 getVideoInformationAPI 方法
// import {getVideoInformationAPI} from '@/api/homeAPI.js'
// 导入 search 组件
import Search from '@/components/SearchView.vue'
// 导入电影展示组件
import VideoList from '@/components/VideoListView.vue'
export default {
  // 定义组件名称
  name: 'HomeView',
  data(){
        return {
          msg:"你好",
          // value:""
            
        }
  },
  // 写默认执行方法
  created(){
    // this.defaultGetInforamtion()
  },
  // 写方法
  methods:{
    // 默认调用接口获取网页信息
    // async defaultGetInforamtion(){
    //   const{data:res}=await getVideoInformationAPI("11","","","","美国")
    //   console.log(res)
    // },
    // 从子组件search 获取内容
    // getValue(val){
    //   this.value=val
    //   console.log("接收到了子组件数据")
    // }

  },
  // 加载子组件
  components: {
    Search: Search,
    VideoList: VideoList,
}

}
</script>

<style lang="less" scoped>
// 组件外层容器的样式
.home-container {
  padding-top: 46px;
  padding-bottom: 50px;
}
// logo 样式
.logo {
  height: 80%;
}
</style>
