import request from "@/utils/request.js"
//import request  from "@/utils/request"
// 获取默认视频数据
export const getVideoInformationAPI = (videoName,startTime,endTime,type,area) => {
    return request.get('/videoInformation', {
      params: {
        videoName: videoName,
        startTime: startTime,
        endTime: endTime,
        type: type,
        area: area

      }
    })

  }