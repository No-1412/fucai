package com.fucai.controller;

import com.fucai.dto.SectionProbabilityDTO;
import com.fucai.response.MultiDataResponse;
import com.fucai.service.SectionProbabilityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/5/2
 * @description
 */
@Controller
public class SectionProbabilityController {

    private static final Logger logger = LoggerFactory.getLogger(SectionProbabilityController.class);

    @Autowired
    private SectionProbabilityService sectionProbabilityService;

    @RequestMapping(value = "/getPageSectionProbability",method = RequestMethod.GET)
    @ResponseBody
    public MultiDataResponse getPageSectionProbability(@RequestParam("pageNum")Integer pageNum){
        MultiDataResponse multiDataResponse = new MultiDataResponse();
        multiDataResponse.setCode(200);
        try {
            SectionProbabilityDTO sectionProbabilityDTO = new SectionProbabilityDTO();
            List<SectionProbabilityDTO> sectionProbabilityDTOList = sectionProbabilityService.getPageSectionProbability(sectionProbabilityDTO, pageNum);
            multiDataResponse.setData(sectionProbabilityDTOList);
            multiDataResponse.setMsg("获取区间信息成功");
        }catch (Exception e){
            logger.error("获取区间信息失败:" + e);
            multiDataResponse.setCode(500);
            multiDataResponse.setMsg("服务器错误");
            e.printStackTrace();
        }
        return multiDataResponse;
    }
}
