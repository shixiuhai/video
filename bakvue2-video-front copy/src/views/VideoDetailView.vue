<template>
    <div>
        详情页面
        {{a}}
        <!-- <iframe  
        fdrameborer="0" scrolling="auto" src="https://vip.parwix.com:4433/player/?url=https://www.iqiyi.com/v_ik3832z0go.html?vfrm=pcw_home&vfrmblk=712211_cainizaizhui&vfrmrst=712211_cainizaizhui_image3">
            IE：你们都看我干吗，我现在也是支持的
        </iframe> -->
        <button @click="getVideoId"> 点击</button>
    </div>
</template>


<script>
    export default{
        name:"VDV",
        data(){
            return {
                a: "1"

            }
        },
        methods:{
            getVideoId(){
                this.a=this.$route.params.videoId
                console.log(this.$route.params.videoId)
            }

        }
    }
</script>