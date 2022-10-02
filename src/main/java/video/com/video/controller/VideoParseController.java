package video.com.video.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import video.com.video.common.utils.R;
import video.com.video.entity.VideoParse;
import video.com.video.service.VideoParseService;
// 导入日志大于
@Slf4j
@RestController
@RequestMapping("/videoParse")
public class VideoParseController {
    // 注入接口
    @Autowired
    private  VideoParseService videoParseService;
    // 增加
    @PostMapping("")
    public R addParse(@RequestBody  VideoParse videoParse){
        // 增加
        videoParseService.save(videoParse);
        return R.ok();
    }

    // 删除
    @DeleteMapping("")
    public R deleteParse(@RequestParam(required = false,defaultValue = "") int id){
        videoParseService.removeById(id);
        return R.ok();
    }

    // 修改
    public R updateParse(@RequestBody VideoParse videoParse){
        videoParseService.updateById(videoParse);
        return R.ok();
    }

    // 查询
    @GetMapping("")
    public R selectParse(){
        // 多个链接对象
        List<VideoParse> videoParseList =videoParseService.list();
        return R.ok().put(videoParseList);
    }
    
}
