package com.fucai.controller;

import com.alibaba.fastjson.JSONObject;
import com.fucai.dto.BlueBallProbabilityDTO;
import com.fucai.service.BlueBallProbabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author liaoyubo
 * @version 1.0 2017/5/5
 * @description
 */
@Controller
public class BlueBallProbabilityController {

    @Autowired
    private BlueBallProbabilityService blueBallProbabilityService;

    @RequestMapping("/blueBallProbabilityBrokenLine")
    public void blueBallProbabilityBrokenLine(Map<String,Object> map){
        //获取最小最大蓝球概率
        BlueBallProbabilityDTO minMaxBlueBallProbabilityDTO = blueBallProbabilityService.getMinMaxBlueBallProbability();
        map.put("minMaxBlueBallProbabilityDTO", JSONObject.toJSON(minMaxBlueBallProbabilityDTO));
        List blueBallOne = new ArrayList();
        List blueBallTwo = new ArrayList();
        List blueBallThree = new ArrayList();
        List blueBallFour = new ArrayList();
        List blueBallFive = new ArrayList();
        List blueBallSix = new ArrayList();
        List blueBallSeven = new ArrayList();
        List blueBallEight = new ArrayList();
        List blueBallNine = new ArrayList();
        List blueBallTen = new ArrayList();
        List blueBallEleven = new ArrayList();
        List blueBallTwelve = new ArrayList();
        List blueBallThirteen = new ArrayList();
        List blueBallFourteen = new ArrayList();
        List blueBallFifteen = new ArrayList();
        List blueBallSixteen = new ArrayList();
        List<BlueBallProbabilityDTO> blueBallProbabilityDTOList = blueBallProbabilityService.getBlueBallProbabilitys(null);
        for (BlueBallProbabilityDTO blueBallProbabilityDTO: blueBallProbabilityDTOList){
            blueBallOne.add(blueBallProbabilityDTO.getBlueBallOne());
            blueBallTwo.add(blueBallProbabilityDTO.getBlueBallTwo());
            blueBallThree.add(blueBallProbabilityDTO.getBlueBallThree());
            blueBallFour.add(blueBallProbabilityDTO.getBlueBallFour());
            blueBallFive.add(blueBallProbabilityDTO.getBlueBallFive());
            blueBallSix.add(blueBallProbabilityDTO.getBlueBallSix());
            blueBallSeven.add(blueBallProbabilityDTO.getBlueBallSeven());
            blueBallEight.add(blueBallProbabilityDTO.getBlueBallEight());
            blueBallNine.add(blueBallProbabilityDTO.getBlueBallNine());
            blueBallTen.add(blueBallProbabilityDTO.getBlueBallTen());
            blueBallEleven.add(blueBallProbabilityDTO.getBlueBallEleven());
            blueBallTwelve.add(blueBallProbabilityDTO.getBlueBallTwelve());
            blueBallThirteen.add(blueBallProbabilityDTO.getBlueBallThirteen());
            blueBallFourteen.add(blueBallProbabilityDTO.getBlueBallFourteen());
            blueBallFifteen.add(blueBallProbabilityDTO.getBlueBallFifteen());
            blueBallSixteen.add(blueBallProbabilityDTO.getBlueBallSixteen());
        }
        map.put("blueBallOne",blueBallOne);
        map.put("blueBallTwo",blueBallTwo);
        map.put("blueBallThree",blueBallThree);
        map.put("blueBallFour",blueBallFour);
        map.put("blueBallFive",blueBallFive);
        map.put("blueBallSix",blueBallSix);
        map.put("blueBallSeven",blueBallSeven);
        map.put("blueBallEight",blueBallEight);
        map.put("blueBallNine",blueBallNine);
        map.put("blueBallTen",blueBallTen);
        map.put("blueBallEleven",blueBallEleven);
        map.put("blueBallTwelve",blueBallTwelve);
        map.put("blueBallThirteen",blueBallThirteen);
        map.put("blueBallFourteen",blueBallFourteen);
        map.put("blueBallFifteen",blueBallFifteen);
        map.put("blueBallSixteen",blueBallSixteen);
    }
}
