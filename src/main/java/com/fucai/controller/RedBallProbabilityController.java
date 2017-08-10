package com.fucai.controller;

import com.alibaba.fastjson.JSONObject;
import com.fucai.dto.RedBallProbabilityDTO;
import com.fucai.service.FiveRedBallProbabilityService;
import com.fucai.service.RedBallProbabilityService;
import com.fucai.service.SectionProbabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/27
 * @description
 */
@Controller
public class RedBallProbabilityController {

    @Autowired
    private RedBallProbabilityService redBallProbabilityService;
    @Autowired
    private FiveRedBallProbabilityService fiveRedBallProbabilityService;
    @Autowired
    private SectionProbabilityService sectionProbabilityService;

    @RequestMapping("/helloHtml")
    public void helloHtml(Map<String,Object> map){
        List<RedBallProbabilityDTO> redBallProbabilityDTO = redBallProbabilityService.getRedBallProbability(null);
        List fiveRedBallProbabilityList = fiveRedBallProbabilityService.getRedBallProbability(null);
        String fiveRedBallProbabilityStr = fiveRedBallProbabilityService.getFiveRedBallListStr();
        String sectionProbabilityStr = sectionProbabilityService.getSectionProbabilityStr();
        map.put("hello","from TemplateController.helloHtml");
        map.put("fiveRedBallProbabilityList",fiveRedBallProbabilityList);
        map.put("fiveRedBallProbabilityStr",fiveRedBallProbabilityStr);
        map.put("sectionProbabilityStr",sectionProbabilityStr);
        //return"/helloHtml";
    }

    @RequestMapping("/redBallProbabilityBrokenLine")
    public void redBallProbabilityBrokenLine(Map<String,Object> map){
        //获取概率的最大最小值
        RedBallProbabilityDTO maxMinRedBallProbabilityDTO = redBallProbabilityService.getMaxMinRedProbability();
        map.put("maxMinRedBallProbabilityDTO", JSONObject.toJSON(maxMinRedBallProbabilityDTO));
        List redBallOne = new ArrayList();
        List redBallTwo = new ArrayList();
        List redBallThree = new ArrayList();
        List redBallFour = new ArrayList();
        List redBallFive = new ArrayList();
        List redBallSix = new ArrayList();
        List redBallSeven = new ArrayList();
        List redBallEight = new ArrayList();
        List redBallNine = new ArrayList();
        List redBallTen = new ArrayList();
        List redBallEleven = new ArrayList();
        List redBallTwelve = new ArrayList();
        List redBallThirteen = new ArrayList();
        List redBallFourteen = new ArrayList();
        List redBallFifteen = new ArrayList();
        List redBallSixteen = new ArrayList();
        List redBallSeventeen = new ArrayList();
        List redBallEighteen = new ArrayList();
        List redBallNineteen = new ArrayList();
        List redBallTwenty = new ArrayList();
        List redBallTwentyOne = new ArrayList();
        List redBallTwentyTwo = new ArrayList();
        List redBallTwentyThree = new ArrayList();
        List redBallTwentyFour = new ArrayList();
        List redBallTwentyFive = new ArrayList();
        List redBallTwentySix = new ArrayList();
        List redBallTwentySeven = new ArrayList();
        List redBallTwentyEight = new ArrayList();
        List redBallTwentyNine = new ArrayList();
        List redBallThirty = new ArrayList();
        List redBallThirtyOne = new ArrayList();
        List redBallThirtyTwo = new ArrayList();
        List redBallThirtyThree = new ArrayList();
        List<RedBallProbabilityDTO> redBallProbabilityDTOList = redBallProbabilityService.getRedBallProbability(null);
        for(RedBallProbabilityDTO redBallProbabilityDTO : redBallProbabilityDTOList){
            redBallOne.add(redBallProbabilityDTO.getRedBallOne());
            redBallTwo.add(redBallProbabilityDTO.getRedBallTwo());
            redBallThree.add(redBallProbabilityDTO.getRedBallThree());
            redBallFour.add(redBallProbabilityDTO.getRedBallFour());
            redBallFive.add(redBallProbabilityDTO.getRedBallFive());
            redBallSix.add(redBallProbabilityDTO.getRedBallSix());
            redBallSeven.add(redBallProbabilityDTO.getRedBallSeven());
            redBallEight.add(redBallProbabilityDTO.getRedBallEight());
            redBallNine.add(redBallProbabilityDTO.getRedBallNine());
            redBallTen.add(redBallProbabilityDTO.getRedBallTen());
            redBallEleven.add(redBallProbabilityDTO.getRedBallEleven());
            redBallTwelve.add(redBallProbabilityDTO.getRedBallTwelve());
            redBallThirteen.add(redBallProbabilityDTO.getRedBallThirteen());
            redBallFourteen.add(redBallProbabilityDTO.getRedBallFourteen());
            redBallFifteen.add(redBallProbabilityDTO.getRedBallFifteen());
            redBallSixteen.add(redBallProbabilityDTO.getRedBallSixteen());
            redBallSeventeen.add(redBallProbabilityDTO.getRedBallSeventeen());
            redBallEighteen.add(redBallProbabilityDTO.getRedBallEighteen());
            redBallNineteen.add(redBallProbabilityDTO.getRedBallNineteen());
            redBallTwenty.add(redBallProbabilityDTO.getRedBallTwenty());
            redBallTwentyOne.add(redBallProbabilityDTO.getRedBallTwentyOne());
            redBallTwentyTwo.add(redBallProbabilityDTO.getRedBallTwentyTwo());
            redBallTwentyThree.add(redBallProbabilityDTO.getRedBallTwentyThree());
            redBallTwentyFour.add(redBallProbabilityDTO.getRedBallTwentyFour());
            redBallTwentyFive.add(redBallProbabilityDTO.getRedBallTwentyFive());
            redBallTwentySix.add(redBallProbabilityDTO.getRedBallTwentySix());
            redBallTwentySeven.add(redBallProbabilityDTO.getRedBallTwentySeven());
            redBallTwentyEight.add(redBallProbabilityDTO.getRedBallTwentyEight());
            redBallTwentyNine.add(redBallProbabilityDTO.getRedBallTwentyNine());
            redBallThirty.add(redBallProbabilityDTO.getRedBallThirty());
            redBallThirtyOne.add(redBallProbabilityDTO.getRedBallThirtyOne());
            redBallThirtyTwo.add(redBallProbabilityDTO.getRedBallThirtyTwo());
            redBallThirtyThree.add(redBallProbabilityDTO.getRedBallThirtyThree());
        }
        map.put("redBallOne",redBallOne);
        map.put("redBallTwo",redBallTwo);
        map.put("redBallThree",redBallThree);
        map.put("redBallFour",redBallFour);
        map.put("redBallFive",redBallFive);
        map.put("redBallSix",redBallSix);
        map.put("redBallSeven",redBallSeven);
        map.put("redBallEight",redBallEight);
        map.put("redBallNine",redBallNine);
        map.put("redBallTen",redBallTen);
        map.put("redBallEleven",redBallEleven);
        map.put("redBallTwelve",redBallTwelve);
        map.put("redBallThirteen",redBallThirteen);
        map.put("redBallFourteen",redBallFourteen);
        map.put("redBallFifteen",redBallFifteen);
        map.put("redBallSixteen",redBallSixteen);
        map.put("redBallSeventeen",redBallSeventeen);
        map.put("redBallEighteen",redBallEighteen);
        map.put("redBallNineteen",redBallNineteen);
        map.put("redBallTwenty",redBallTwenty);
        map.put("redBallTwentyOne",redBallTwentyOne);
        map.put("redBallTwentyTwo",redBallTwentyTwo);
        map.put("redBallTwentyThree",redBallTwentyThree);
        map.put("redBallTwentyFour",redBallTwentyFour);
        map.put("redBallTwentyFive",redBallTwentyFive);
        map.put("redBallTwentySix",redBallTwentySix);
        map.put("redBallTwentySeven",redBallTwentySeven);
        map.put("redBallTwentyEight",redBallTwentyEight);
        map.put("redBallTwentyNine",redBallTwentyNine);
        map.put("redBallThirty",redBallThirty);
        map.put("redBallThirtyOne",redBallThirtyOne);
        map.put("redBallThirtyTwo",redBallThirtyTwo);
        map.put("redBallThirtyThree",redBallThirtyThree);
    }

}
