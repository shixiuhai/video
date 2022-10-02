package video.com.video.controller;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;

import video.com.video.common.utils.R;
import lombok.extern.slf4j.Slf4j;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import video.com.video.entity.VideoInformation;
import video.com.video.service.VideoInformationService;

import java.util.HashMap;
import java.util.List;
@Slf4j
@RestController
@RequestMapping("/videoInformation")
public class VideoInformationControllercopy {
    @Autowired
    private VideoInformationService videoInformationService;
    @PostMapping("/")
    // 返回类型是一个R类型
    public R getInformation(){
        Page pageInfo = new Page(1,1);
        List<VideoInformation> videoList=videoInformationService.getResult();
        // videoList.forEach(t->{
        //     log.info(String.format("%s %s %s", t.getId(),t.getVideoName(),t.getArea()));
        // });
        // for each
        for(VideoInformation item:videoList){
            log.error(item.getId());
        }
        return R.ok();
        // forEach
        // videoList.forEach(t->{
        //     log.info("-------");
        //     log.error(t.getId());
        //     log.info("-------");
        // });
        // return R.ok();
        // List<Integer> typeList = IndustryType.selectType();
        // typeList.forEach(t->{
        //     long count = list.stream().filter(p -> p.getIndustry().equals(t)).count();
        //     map.put(IndustryType.getMessage(t),count);
        // });
        // map.put(IndustryType.newBusiness.massage,(long)newCompanyBasicService.count());
        // return map;
        // HashMap<String,Object> obj = new HashMap<String,Object>();
        // obj.put("r", videoList);
        // // log.info(videoList);
        // log.info("---");
        // System.out.println(obj);
        // // return R.ok().put("result",videoList);
        // // return R.ok(obj);
        // LambdaQueryWrapper<VideoInformation> queryWrapper=new LambdaQueryWrapper<VideoInformation>();
        // queryWrapper.eq(VideoInformation::getId,1);
        // VideoInformation videoInformation = videoInformationService.getOne(queryWrapper);
        // log.error(videoInformation.getVideoName());
        // return R.ok();
        // // 传递给分页查询器
        // videoInformationService.page(pageInfo,queryWrapper);
            
        // return R.ok().put(pageInfo);
    }

}