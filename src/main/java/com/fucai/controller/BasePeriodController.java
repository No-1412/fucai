package com.fucai.controller;

import com.fucai.dto.*;
import com.fucai.response.MultiDataResponse;
import com.fucai.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/11
 * @description
 */
@Controller
public class BasePeriodController {

    private static final Logger logger = LoggerFactory.getLogger(BasePeriodController.class);

    @Autowired
    private BasePeriodService basePeriodService;
    @Autowired
    private OddEvenProbabilityService oddEvenProbabilityService;
    @Autowired
    private SectionProbabilityService sectionProbabilityService;
    @Autowired
    private RedBallProbabilityService redBallProbabilityService;
    @Autowired
    private FiveRedBallProbabilityService fiveRedBallProbabilityService;
    @Autowired
    private ThirtyRedBallProbabilityService thirtyRedBallProbabilityService;
    @Autowired
    private FiftyRedBallProbabilityService fiftyRedBallProbabilityService;
    @Autowired
    private OneHundredRedBallProbabilityService oneHundredRedBallProbabilityService;
    @Autowired
    private BlueBallProbabilityService blueBallProbabilityService;
    @Autowired
    private FiveBlueBallProbabilityService fiveBlueBallProbabilityService;
    @Autowired
    private ThirtyBlueBallProbabilityService thirtyBlueBallProbabilityService;
    @Autowired
    private FiftyBlueBallProbabilityService fiftyBlueBallProbabilityService;
    @Autowired
    private OneHundredBlueBallProbabilityService oneHundredBlueBallProbabilityService;


    @Value("${pageSize}")
    private Integer pageSize;
    @Value("${sectionProbability_pageSize}")
    private Integer sectionProbabilityPageSize;
    @Value("${redBallProbability_pageSize}")
    private Integer redBallProbabilityPageSize;
    @Value("${fiveRedBallProbability_pageSize}")
    private Integer fiveRedBallProbabilityPageSize;
    @Value("${thirtyRedBallProbability_pageSize}")
    private Integer thirtyRedBallProbabilityPageSize;
    @Value("${fiftyRedBallProbability_pageSize}")
    private Integer fiftyRedBallProbabilityPageSize;
    @Value("${oneHundredRedBallProbability_pageSize}")
    private Integer oneHundredRedBallProbabilityPageSize;

    @Value("${blueBallProbability_pageSize}")
    private Integer blueBallProbabilityPageSize;
    @Value("${fiveBlueBallProbability_pageSize}")
    private Integer fiveBlueBallProbabilityPageSize;
    @Value("${thirtyBlueBallProbability_pageSize}")
    private Integer thirtyBlueBallProbabilityPageSize;
    @Value("${fiftyBlueBallProbability_pageSize}")
    private Integer fiftyBlueBallProbabilityPageSize;
    @Value("${oneHundredBlueBallProbability_pageSize}")
    private Integer oneHundredBlueBallProbabilityPageSize;

    @RequestMapping(value = "/getAllBasePeriods",method = RequestMethod.GET)
    @ResponseBody
    public MultiDataResponse getAllBasePeriods(@RequestParam("pageNum")Integer pageNum){
        MultiDataResponse multiDataResponse = new MultiDataResponse();
        multiDataResponse.setCode(200);
        try {
            BasePeriodDTO basePeriodDTO = new BasePeriodDTO();
            List<BasePeriodDTO> basePeriodDTOList = basePeriodService.getPageBasePeriodDTO(basePeriodDTO, pageNum);
            multiDataResponse.setData(basePeriodDTOList);
            multiDataResponse.setMsg("获取所有期数信息成功");
        }catch (Exception e){
            logger.error("获取所有期数信息失败:" + e);
            multiDataResponse.setCode(500);
            multiDataResponse.setMsg("服务器错误");
            e.printStackTrace();
        }
        return multiDataResponse;
    }

    @RequestMapping("/basePeriod")
    public void helloHtml(Map<String,Object> map){
        map.put("hello", "from TemplateController.helloHtml");
        BasePeriodDTO basePeriodDTO = new BasePeriodDTO();
        List<BasePeriodDTO> basePeriodDTOList = basePeriodService.getPageBasePeriodDTO(basePeriodDTO, 1);
        map.put("basePeriodDTOList",basePeriodDTOList);
        int zeroInt = basePeriodService.getAllBasePeriods(null).size()%pageSize;
        //判断是否有余数
        if(zeroInt > 0){
            zeroInt = basePeriodService.getAllBasePeriods(null).size()/pageSize;
            zeroInt+=1;
        }
        map.put("basePeriodDTOCount",zeroInt);
        //获取奇偶概率
        OddEvenProbabilityDTO oddEvenProbabilityDTO = oddEvenProbabilityService.getOddEvenProbability();
        map.put("oddProbability",oddEvenProbabilityDTO.getOddProbability());
        map.put("evenProbability",oddEvenProbabilityDTO.getEvenProbability());
        //获取区间概率信息
        map.put("sectionProbabilityDTOList",getSectionProbabilityList());
        //获取红球概率
        map.put("redBallProbabilityList",getRedBallProbabilityList());
        //获取最新5期红球的概率
        map.put("fiveRedBallProbabilityList",getFiveRedBallProbabilityList());
        //获取最新30期的红球概率
        map.put("thirtyRedBallProbabilityList",getThirtyRedBallProbabilityList());
        //获取最新50期的红球概率
        map.put("fiftyRedBallProbabilityList",getFiftyRedBallProbabilityList());
        //获取最新100期的红球概率
        map.put("oneHundredRedBallProbabilityList",getOneHundredRedBallProbabilityList());
        //获取蓝球概率
        map.put("blueBallProbabilityDTOList",getBlueBallProbabilityDTOList());
        //获取最新5期的蓝球概率
        map.put("fiveBlueBallProbabilityDTOList",getFiveBlueBallProbabilityDTOList());
        //获取最新30期蓝球概率
        map.put("thirtyBlueBallProbabilityDTOList",getThirtyBlueBallProbabilityDTOList());
        //获取最新50期蓝球概率
        map.put("fiftyBlueBallProbabilityDTOList",getFiftyBlueBallProbabilityDTOList());
        //获取最新100期蓝球概率
        map.put("oneHundredBlueBallProbabilityDTOList",getOneHundredBlueBallProbabilityDTOList());
        //return"/basePeriod";
    }

    private int minValue(int remainderInt,int zeroInt){
        int minValue = 0;
        if(remainderInt > 0){
            //判断总数是否大于分页条数
            if(zeroInt > 1){
                minValue = (zeroInt -1) * sectionProbabilityPageSize + remainderInt;
            }else{
                minValue = 0;
            }
        }else {
            if(zeroInt > 1){
                minValue = (zeroInt -1) * sectionProbabilityPageSize;
            }else {
                minValue = 0;
            }
        }
        return minValue;
    }
    /**
     * 获取区间概率
     * @return
     */
    private List<SectionProbabilityDTO> getSectionProbabilityList(){
        List<SectionProbabilityDTO> sectionProbabilityDTOList = sectionProbabilityService.getSectionProbability(null);
        int sectionZeroInt = sectionProbabilityDTOList.size() % sectionProbabilityPageSize;
        int sectionInt = sectionProbabilityDTOList.size() / sectionProbabilityPageSize;
        int minValue = 0;
        int maxValue = sectionProbabilityDTOList.size();
        //判断是否有余数
        minValue = minValue(sectionZeroInt,sectionInt);
        //获取最新10期的区间概率
        SectionProbabilityDTO sectionProbabilityDTO = new SectionProbabilityDTO();
        sectionProbabilityDTO.setFromBase(1);
        sectionProbabilityDTO.setMinValue(minValue);
        sectionProbabilityDTO.setMaxValue(maxValue);
        sectionProbabilityDTOList = sectionProbabilityService.getSectionProbability(sectionProbabilityDTO);
        return sectionProbabilityDTOList;
    }

    /**
     * 获取红球概率
     * @return
     */
    private List<RedBallProbabilityDTO> getRedBallProbabilityList(){
        List<RedBallProbabilityDTO> redBallProbabilityDTOList = redBallProbabilityService.getRedBallProbability(null);
        int redBallZeroInt = redBallProbabilityDTOList.size() % redBallProbabilityPageSize;
        int redInt = redBallProbabilityDTOList.size() / redBallProbabilityPageSize;
        int minValue = 0;
        int maxValue = redBallProbabilityDTOList.size();
        //判断是否有余数
        minValue = minValue(redBallZeroInt,redInt);
        //获取最新10期的区间概率
        RedBallProbabilityDTO redBallProbabilityDTO = new RedBallProbabilityDTO();
        redBallProbabilityDTO.setFromBase(1);
        redBallProbabilityDTO.setMinValue(minValue);
        redBallProbabilityDTO.setMaxValue(maxValue);
        redBallProbabilityDTOList = redBallProbabilityService.getRedBallProbability(redBallProbabilityDTO);
        return redBallProbabilityDTOList;
    }

    /**
     * 获取最新5期红球概率
     * @return
     */
    private List<FiveRedBallProbabilityDTO> getFiveRedBallProbabilityList(){
        List<FiveRedBallProbabilityDTO> fiveRedBallProbabilityDTOList = fiveRedBallProbabilityService.getRedBallProbability(null);
        int redBallZeroInt = fiveRedBallProbabilityDTOList.size() % fiveRedBallProbabilityPageSize;
        int redInt = fiveRedBallProbabilityDTOList.size() / fiveRedBallProbabilityPageSize;
        int minValue = 0;
        int maxValue = fiveRedBallProbabilityDTOList.size();
        //判断是否有余数
        minValue = minValue(redBallZeroInt,redInt);
        //获取最新10期的区间概率
        FiveRedBallProbabilityDTO fiveRedBallProbabilityDTO = new FiveRedBallProbabilityDTO();
        fiveRedBallProbabilityDTO.setFromBase(1);
        fiveRedBallProbabilityDTO.setMinValue(minValue);
        fiveRedBallProbabilityDTO.setMaxValue(maxValue);
        fiveRedBallProbabilityDTOList = fiveRedBallProbabilityService.getRedBallProbability(fiveRedBallProbabilityDTO);
        return fiveRedBallProbabilityDTOList;
    }

    /**
     * 获取最新30期红球概率
     * @return
     */
    private List<ThirtyRedBallProbabilityDTO> getThirtyRedBallProbabilityList(){
        List<ThirtyRedBallProbabilityDTO> thirtyRedBallProbabilityDTOList = thirtyRedBallProbabilityService.getRedBallProbability(null);
        int redBallZeroInt = thirtyRedBallProbabilityDTOList.size() % thirtyRedBallProbabilityPageSize;
        int redInt = thirtyRedBallProbabilityDTOList.size() / thirtyRedBallProbabilityPageSize;
        int minValue = 0;
        int maxValue = thirtyRedBallProbabilityDTOList.size();
        //判断是否有余数
        minValue = minValue(redBallZeroInt,redInt);
        //获取最新10期的区间概率
        ThirtyRedBallProbabilityDTO thirtyRedBallProbabilityDTO = new ThirtyRedBallProbabilityDTO();
        thirtyRedBallProbabilityDTO.setFromBase(1);
        thirtyRedBallProbabilityDTO.setMinValue(minValue);
        thirtyRedBallProbabilityDTO.setMaxValue(maxValue);
        thirtyRedBallProbabilityDTOList = thirtyRedBallProbabilityService.getRedBallProbability(thirtyRedBallProbabilityDTO);
        return thirtyRedBallProbabilityDTOList;
    }

    /**
     * 获取最新50期红球概率
     * @return
     */
    private List<FiftyRedBallProbabilityDTO> getFiftyRedBallProbabilityList(){
        List<FiftyRedBallProbabilityDTO> fiftyRedBallProbabilityDTOList = fiftyRedBallProbabilityService.getRedBallProbability(null);
        int redBallZeroInt = fiftyRedBallProbabilityDTOList.size() % fiftyRedBallProbabilityPageSize;
        int redInt = fiftyRedBallProbabilityDTOList.size() / fiftyRedBallProbabilityPageSize;
        int minValue = 0;
        int maxValue = fiftyRedBallProbabilityDTOList.size();
        //判断是否有余数
        minValue = minValue(redBallZeroInt,redInt);
        //获取最新10期的区间概率
        FiftyRedBallProbabilityDTO fiftyRedBallProbabilityDTO = new FiftyRedBallProbabilityDTO();
        fiftyRedBallProbabilityDTO.setFromBase(1);
        fiftyRedBallProbabilityDTO.setMinValue(minValue);
        fiftyRedBallProbabilityDTO.setMaxValue(maxValue);
        fiftyRedBallProbabilityDTOList = fiftyRedBallProbabilityService.getRedBallProbability(fiftyRedBallProbabilityDTO);
        return fiftyRedBallProbabilityDTOList;
    }

    /**
     * 获取最新100期红球概率
     * @return
     */
    private List<OneHundredRedBallProbabilityDTO> getOneHundredRedBallProbabilityList(){
        List<OneHundredRedBallProbabilityDTO> oneHundredRedBallProbabilityDTOList = oneHundredRedBallProbabilityService.getRedBallProbability(null);
        int redBallZeroInt = oneHundredRedBallProbabilityDTOList.size() % oneHundredRedBallProbabilityPageSize;
        int redInt = oneHundredRedBallProbabilityDTOList.size() / oneHundredRedBallProbabilityPageSize;
        int minValue = 0;
        int maxValue = oneHundredRedBallProbabilityDTOList.size();
        //判断是否有余数
        minValue = minValue(redBallZeroInt,redInt);
        //获取最新10期的区间概率
        OneHundredRedBallProbabilityDTO oneHundredRedBallProbabilityDTO = new OneHundredRedBallProbabilityDTO();
        oneHundredRedBallProbabilityDTO.setFromBase(1);
        oneHundredRedBallProbabilityDTO.setMinValue(minValue);
        oneHundredRedBallProbabilityDTO.setMaxValue(maxValue);
        oneHundredRedBallProbabilityDTOList = oneHundredRedBallProbabilityService.getRedBallProbability(oneHundredRedBallProbabilityDTO);
        return oneHundredRedBallProbabilityDTOList;
    }

    /**
     * 获取蓝球概率
     * @return
     */
    private List<BlueBallProbabilityDTO> getBlueBallProbabilityDTOList(){
        List<BlueBallProbabilityDTO> blueBallProbabilityDTOList = blueBallProbabilityService.getBlueBallProbabilitys(null);
        int redBallZeroInt = blueBallProbabilityDTOList.size() % blueBallProbabilityPageSize;
        int redInt = blueBallProbabilityDTOList.size() / blueBallProbabilityPageSize;
        int minValue = 0;
        int maxValue = blueBallProbabilityDTOList.size();
        //判断是否有余数
        minValue = minValue(redBallZeroInt,redInt);
        //获取最新10期的区间概率
        BlueBallProbabilityDTO blueBallProbabilityDTO = new BlueBallProbabilityDTO();
        blueBallProbabilityDTO.setFromBase(1);
        blueBallProbabilityDTO.setMinValue(minValue);
        blueBallProbabilityDTO.setMaxValue(maxValue);
        blueBallProbabilityDTOList = blueBallProbabilityService.getBlueBallProbabilitys(blueBallProbabilityDTO);
        return blueBallProbabilityDTOList;
    }

    /**
     * 获取最新5期蓝球概率
     * @return
     */
    private List<FiveBlueBallProbabilityDTO> getFiveBlueBallProbabilityDTOList(){
        List<FiveBlueBallProbabilityDTO> fiveBlueBallProbabilityDTOList = fiveBlueBallProbabilityService.getFiveBlueBallProbabilitys(null);
        int redBallZeroInt = fiveBlueBallProbabilityDTOList.size() % fiveBlueBallProbabilityPageSize;
        int redInt = fiveBlueBallProbabilityDTOList.size() / fiveBlueBallProbabilityPageSize;
        int minValue = 0;
        int maxValue = fiveBlueBallProbabilityDTOList.size();
        //判断是否有余数
        minValue = minValue(redBallZeroInt,redInt);
        //获取最新10期的区间概率
        FiveBlueBallProbabilityDTO fiveBlueBallProbabilityDTO = new FiveBlueBallProbabilityDTO();
        fiveBlueBallProbabilityDTO.setFromBase(1);
        fiveBlueBallProbabilityDTO.setMinValue(minValue);
        fiveBlueBallProbabilityDTO.setMaxValue(maxValue);
        fiveBlueBallProbabilityDTOList = fiveBlueBallProbabilityService.getFiveBlueBallProbabilitys(fiveBlueBallProbabilityDTO);
        return fiveBlueBallProbabilityDTOList;
    }

    /**
     * 获取最新30期蓝球概率
     * @return
     */
    private List<ThirtyBlueBallProbabilityDTO> getThirtyBlueBallProbabilityDTOList(){
        List<ThirtyBlueBallProbabilityDTO> thirtyBlueBallProbabilityDTOList = thirtyBlueBallProbabilityService.getThirtyBlueBallProbabilitys(null);
        int redBallZeroInt = thirtyBlueBallProbabilityDTOList.size() % thirtyBlueBallProbabilityPageSize;
        int redInt = thirtyBlueBallProbabilityDTOList.size() / thirtyBlueBallProbabilityPageSize;
        int minValue = 0;
        int maxValue = thirtyBlueBallProbabilityDTOList.size();
        //判断是否有余数
        minValue = minValue(redBallZeroInt,redInt);
        //获取最新10期的区间概率
        ThirtyBlueBallProbabilityDTO thirtyBlueBallProbabilityDTO = new ThirtyBlueBallProbabilityDTO();
        thirtyBlueBallProbabilityDTO.setFromBase(1);
        thirtyBlueBallProbabilityDTO.setMinValue(minValue);
        thirtyBlueBallProbabilityDTO.setMaxValue(maxValue);
        thirtyBlueBallProbabilityDTOList = thirtyBlueBallProbabilityService.getThirtyBlueBallProbabilitys(thirtyBlueBallProbabilityDTO);
        return thirtyBlueBallProbabilityDTOList;
    }

    /**
     * 获取最新50期蓝球概率
     * @return
     */
    private List<FiftyBlueBallProbabilityDTO> getFiftyBlueBallProbabilityDTOList(){
        List<FiftyBlueBallProbabilityDTO> fiftyBlueBallProbabilityDTOList = fiftyBlueBallProbabilityService.getFiftyBlueBallProbabilitys(null);
        int redBallZeroInt = fiftyBlueBallProbabilityDTOList.size() % fiftyBlueBallProbabilityPageSize;
        int redInt = fiftyBlueBallProbabilityDTOList.size() / fiftyBlueBallProbabilityPageSize;
        int minValue = 0;
        int maxValue = fiftyBlueBallProbabilityDTOList.size();
        //判断是否有余数
        minValue = minValue(redBallZeroInt,redInt);
        //获取最新10期的区间概率
        FiftyBlueBallProbabilityDTO fiftyBlueBallProbabilityDTO = new FiftyBlueBallProbabilityDTO();
        fiftyBlueBallProbabilityDTO.setFromBase(1);
        fiftyBlueBallProbabilityDTO.setMinValue(minValue);
        fiftyBlueBallProbabilityDTO.setMaxValue(maxValue);
        fiftyBlueBallProbabilityDTOList = fiftyBlueBallProbabilityService.getFiftyBlueBallProbabilitys(fiftyBlueBallProbabilityDTO);
        return fiftyBlueBallProbabilityDTOList;
    }

    /**
     * 获取最新100期蓝球概率
     * @return
     */
    private List<OneHundredBlueBallProbabilityDTO> getOneHundredBlueBallProbabilityDTOList(){
        List<OneHundredBlueBallProbabilityDTO> oneHundredBlueBallProbabilityDTOList = oneHundredBlueBallProbabilityService.getOneHundredBlueBallProbabilitys(null);
        int redBallZeroInt = oneHundredBlueBallProbabilityDTOList.size() % oneHundredBlueBallProbabilityPageSize;
        int redInt = oneHundredBlueBallProbabilityDTOList.size() / oneHundredBlueBallProbabilityPageSize;
        int minValue = 0;
        int maxValue = oneHundredBlueBallProbabilityDTOList.size();
        //判断是否有余数
        minValue = minValue(redBallZeroInt,redInt);
        //获取最新10期的区间概率
        OneHundredBlueBallProbabilityDTO oneHundredBlueBallProbabilityDTO = new OneHundredBlueBallProbabilityDTO();
        oneHundredBlueBallProbabilityDTO.setFromBase(1);
        oneHundredBlueBallProbabilityDTO.setMinValue(minValue);
        oneHundredBlueBallProbabilityDTO.setMaxValue(maxValue);
        oneHundredBlueBallProbabilityDTOList = oneHundredBlueBallProbabilityService.getOneHundredBlueBallProbabilitys(oneHundredBlueBallProbabilityDTO);
        return oneHundredBlueBallProbabilityDTOList;
    }
}
