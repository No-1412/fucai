package com.fucai.spider;

import com.fucai.dto.*;
import com.fucai.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/14
 * @description
 */
@Component
@EnableScheduling
public class BlueBallProbabilitySpider {

    @Autowired
    private BasePeriodService basePeriodService;
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

    private static Integer blueProbabilityCount = 1;

    @Scheduled(cron = "${blueBall.begin.time}")
    public void blueProbability(){
        //获取总的期数
        Integer totalPeriodCount = basePeriodService.getCountPeriod();
        if(totalPeriodCount != null && totalPeriodCount > 0){
            //更新蓝球所有的概率
            updateBlueBallProbability(totalPeriodCount);
            //更新最新5期的蓝球概率
            updateFiveBlueBallProbability();
            //更新最新30期蓝球的概率
            updateThirtyBlueBallProbability();
            //更新最新50期蓝球的概率
            updateFiftyBlueBallProbability();
            //更新最新100期蓝球的概率
            updateOneHundredBlueBallProbability();
        }
    }

    /**
     * 所有蓝球概率
     * @param totalPeriodCount
     */
    private void updateBlueBallProbability(Integer totalPeriodCount){
        //获取1号蓝球出现的次数
        Integer blueBallOne = basePeriodService.getNeedBlueBallCountPeriod("01");
        //获取2号蓝球出现的次数
        Integer blueBallTwo = basePeriodService.getNeedBlueBallCountPeriod("02");
        //获取3号蓝球出现的次数
        Integer blueBallThree = basePeriodService.getNeedBlueBallCountPeriod("03");
        //获取4号蓝球出现的次数
        Integer blueBallFour = basePeriodService.getNeedBlueBallCountPeriod("04");
        //获取5号蓝球出现的次数
        Integer blueBallFive = basePeriodService.getNeedBlueBallCountPeriod("05");
        //获取6号蓝球出现的次数
        Integer blueBallSix = basePeriodService.getNeedBlueBallCountPeriod("06");
        //获取7号蓝球出现的次数
        Integer blueBallSeven = basePeriodService.getNeedBlueBallCountPeriod("07");
        //获取8号蓝球出现的次数
        Integer blueBallEight = basePeriodService.getNeedBlueBallCountPeriod("08");
        //获取9号蓝球出现的次数
        Integer blueBallNine = basePeriodService.getNeedBlueBallCountPeriod("09");
        //获取10号蓝球出现的次数
        Integer blueBallTen = basePeriodService.getNeedBlueBallCountPeriod("10");
        //获取11号蓝球出现的次数
        Integer blueBallEleven = basePeriodService.getNeedBlueBallCountPeriod("11");
        //获取12号蓝球出现的次数
        Integer blueBallTwelve = basePeriodService.getNeedBlueBallCountPeriod("12");
        //获取13号蓝球出现的次数
        Integer blueBallThirteen = basePeriodService.getNeedBlueBallCountPeriod("13");
        //获取14号蓝球出现的次数
        Integer blueBallFourteen = basePeriodService.getNeedBlueBallCountPeriod("14");
        //获取15号蓝球出现的次数
        Integer blueBallFifteen = basePeriodService.getNeedBlueBallCountPeriod("15");
        //获取16号蓝球出现的次数
        Integer blueBallSixteen = basePeriodService.getNeedBlueBallCountPeriod("16");

        BlueBallProbabilityDTO blueBallProbabilityDTO = new BlueBallProbabilityDTO();
        blueBallProbabilityDTO.setBlueBallOne(new BigDecimal((double)blueBallOne/totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
        blueBallProbabilityDTO.setBlueBallTwo(new BigDecimal((double)blueBallTwo/totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
        blueBallProbabilityDTO.setBlueBallThree(new BigDecimal((double)blueBallThree/totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
        blueBallProbabilityDTO.setBlueBallFour(new BigDecimal((double)blueBallFour/totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
        blueBallProbabilityDTO.setBlueBallFive(new BigDecimal((double)blueBallFive/totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
        blueBallProbabilityDTO.setBlueBallSix(new BigDecimal((double)blueBallSix/totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
        blueBallProbabilityDTO.setBlueBallSeven(new BigDecimal((double)blueBallSeven/totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
        blueBallProbabilityDTO.setBlueBallEight(new BigDecimal((double)blueBallEight/totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
        blueBallProbabilityDTO.setBlueBallNine(new BigDecimal((double)blueBallNine/totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
        blueBallProbabilityDTO.setBlueBallTen(new BigDecimal((double)blueBallTen/totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
        blueBallProbabilityDTO.setBlueBallEleven(new BigDecimal((double)blueBallEleven/totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
        blueBallProbabilityDTO.setBlueBallTwelve(new BigDecimal((double)blueBallTwelve/totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
        blueBallProbabilityDTO.setBlueBallThirteen(new BigDecimal((double)blueBallThirteen/totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
        blueBallProbabilityDTO.setBlueBallFourteen(new BigDecimal((double)blueBallFourteen/totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
        blueBallProbabilityDTO.setBlueBallFifteen(new BigDecimal((double)blueBallFifteen/totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
        blueBallProbabilityDTO.setBlueBallSixteen(new BigDecimal((double)blueBallSixteen/totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
        blueBallProbabilityDTO.setLastUpdateDate(new Date());

        Integer ballProbabilityDTO = blueBallProbabilityService.getCountBlueBallProbability(blueBallProbabilityDTO);
        if(ballProbabilityDTO == 0){
            blueProbabilityCount = 0;
            blueBallProbabilityService.addBlueBallProbability(blueBallProbabilityDTO);
        }else{
            blueProbabilityCount = 1;
        }
    }

    /**
     * 更新最新5期的蓝球概率
     */
    private void updateFiveBlueBallProbability(){
        //获取1号蓝球出现的次数
        Integer blueBallOne = basePeriodService.getLatestFiveNeedBlueBallCountPeriod("01");
        //获取2号蓝球出现的次数
        Integer blueBallTwo = basePeriodService.getLatestFiveNeedBlueBallCountPeriod("02");
        //获取3号蓝球出现的次数
        Integer blueBallThree = basePeriodService.getLatestFiveNeedBlueBallCountPeriod("03");
        //获取4号蓝球出现的次数
        Integer blueBallFour = basePeriodService.getLatestFiveNeedBlueBallCountPeriod("04");
        //获取5号蓝球出现的次数
        Integer blueBallFive = basePeriodService.getLatestFiveNeedBlueBallCountPeriod("05");
        //获取6号蓝球出现的次数
        Integer blueBallSix = basePeriodService.getLatestFiveNeedBlueBallCountPeriod("06");
        //获取7号蓝球出现的次数
        Integer blueBallSeven = basePeriodService.getLatestFiveNeedBlueBallCountPeriod("07");
        //获取8号蓝球出现的次数
        Integer blueBallEight = basePeriodService.getLatestFiveNeedBlueBallCountPeriod("08");
        //获取9号蓝球出现的次数
        Integer blueBallNine = basePeriodService.getLatestFiveNeedBlueBallCountPeriod("09");
        //获取10号蓝球出现的次数
        Integer blueBallTen = basePeriodService.getLatestFiveNeedBlueBallCountPeriod("10");
        //获取11号蓝球出现的次数
        Integer blueBallEleven = basePeriodService.getLatestFiveNeedBlueBallCountPeriod("11");
        //获取12号蓝球出现的次数
        Integer blueBallTwelve = basePeriodService.getLatestFiveNeedBlueBallCountPeriod("12");
        //获取13号蓝球出现的次数
        Integer blueBallThirteen = basePeriodService.getLatestFiveNeedBlueBallCountPeriod("13");
        //获取14号蓝球出现的次数
        Integer blueBallFourteen = basePeriodService.getLatestFiveNeedBlueBallCountPeriod("14");
        //获取15号蓝球出现的次数
        Integer blueBallFifteen = basePeriodService.getLatestFiveNeedBlueBallCountPeriod("15");
        //获取16号蓝球出现的次数
        Integer blueBallSixteen = basePeriodService.getLatestFiveNeedBlueBallCountPeriod("16");

        FiveBlueBallProbabilityDTO fiveBlueBallProbabilityDTO = new FiveBlueBallProbabilityDTO();
        fiveBlueBallProbabilityDTO.setBlueBallOne(new BigDecimal((double)blueBallOne/5).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiveBlueBallProbabilityDTO.setBlueBallTwo(new BigDecimal((double)blueBallTwo/5).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiveBlueBallProbabilityDTO.setBlueBallThree(new BigDecimal((double)blueBallThree/5).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiveBlueBallProbabilityDTO.setBlueBallFour(new BigDecimal((double)blueBallFour/5).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiveBlueBallProbabilityDTO.setBlueBallFive(new BigDecimal((double)blueBallFive/5).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiveBlueBallProbabilityDTO.setBlueBallSix(new BigDecimal((double)blueBallSix/5).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiveBlueBallProbabilityDTO.setBlueBallSeven(new BigDecimal((double)blueBallSeven/5).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiveBlueBallProbabilityDTO.setBlueBallEight(new BigDecimal((double)blueBallEight/5).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiveBlueBallProbabilityDTO.setBlueBallNine(new BigDecimal((double)blueBallNine/5).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiveBlueBallProbabilityDTO.setBlueBallTen(new BigDecimal((double)blueBallTen/5).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiveBlueBallProbabilityDTO.setBlueBallEleven(new BigDecimal((double)blueBallEleven/5).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiveBlueBallProbabilityDTO.setBlueBallTwelve(new BigDecimal((double)blueBallTwelve/5).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiveBlueBallProbabilityDTO.setBlueBallThirteen(new BigDecimal((double)blueBallThirteen/5).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiveBlueBallProbabilityDTO.setBlueBallFourteen(new BigDecimal((double)blueBallFourteen/5).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiveBlueBallProbabilityDTO.setBlueBallFifteen(new BigDecimal((double)blueBallFifteen/5).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiveBlueBallProbabilityDTO.setBlueBallSixteen(new BigDecimal((double)blueBallSixteen/5).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiveBlueBallProbabilityDTO.setLastUpdateDate(new Date());
        if(blueProbabilityCount == 0){
            fiveBlueBallProbabilityService.addFiveBlueBallProbability(fiveBlueBallProbabilityDTO);
        }
    }

    /**
     * 更新最新30期的蓝球概率
     */
    private void updateThirtyBlueBallProbability(){
        //获取1号蓝球出现的次数
        Integer blueBallOne = basePeriodService.getLatestThirtyNeedBlueBallCountPeriod("01");
        //获取2号蓝球出现的次数
        Integer blueBallTwo = basePeriodService.getLatestThirtyNeedBlueBallCountPeriod("02");
        //获取3号蓝球出现的次数
        Integer blueBallThree = basePeriodService.getLatestThirtyNeedBlueBallCountPeriod("03");
        //获取4号蓝球出现的次数
        Integer blueBallFour = basePeriodService.getLatestThirtyNeedBlueBallCountPeriod("04");
        //获取5号蓝球出现的次数
        Integer blueBallFive = basePeriodService.getLatestThirtyNeedBlueBallCountPeriod("05");
        //获取6号蓝球出现的次数
        Integer blueBallSix = basePeriodService.getLatestThirtyNeedBlueBallCountPeriod("06");
        //获取7号蓝球出现的次数
        Integer blueBallSeven = basePeriodService.getLatestThirtyNeedBlueBallCountPeriod("07");
        //获取8号蓝球出现的次数
        Integer blueBallEight = basePeriodService.getLatestThirtyNeedBlueBallCountPeriod("08");
        //获取9号蓝球出现的次数
        Integer blueBallNine = basePeriodService.getLatestThirtyNeedBlueBallCountPeriod("09");
        //获取10号蓝球出现的次数
        Integer blueBallTen = basePeriodService.getLatestThirtyNeedBlueBallCountPeriod("10");
        //获取11号蓝球出现的次数
        Integer blueBallEleven = basePeriodService.getLatestThirtyNeedBlueBallCountPeriod("11");
        //获取12号蓝球出现的次数
        Integer blueBallTwelve = basePeriodService.getLatestThirtyNeedBlueBallCountPeriod("12");
        //获取13号蓝球出现的次数
        Integer blueBallThirteen = basePeriodService.getLatestThirtyNeedBlueBallCountPeriod("13");
        //获取14号蓝球出现的次数
        Integer blueBallFourteen = basePeriodService.getLatestThirtyNeedBlueBallCountPeriod("14");
        //获取15号蓝球出现的次数
        Integer blueBallFifteen = basePeriodService.getLatestThirtyNeedBlueBallCountPeriod("15");
        //获取16号蓝球出现的次数
        Integer blueBallSixteen = basePeriodService.getLatestThirtyNeedBlueBallCountPeriod("16");

        ThirtyBlueBallProbabilityDTO thirtyBlueBallProbabilityDTO = new ThirtyBlueBallProbabilityDTO();
        thirtyBlueBallProbabilityDTO.setBlueBallOne(new BigDecimal((double)blueBallOne/30).setScale(4,BigDecimal.ROUND_HALF_UP));
        thirtyBlueBallProbabilityDTO.setBlueBallTwo(new BigDecimal((double)blueBallTwo/30).setScale(4,BigDecimal.ROUND_HALF_UP));
        thirtyBlueBallProbabilityDTO.setBlueBallThree(new BigDecimal((double)blueBallThree/30).setScale(4,BigDecimal.ROUND_HALF_UP));
        thirtyBlueBallProbabilityDTO.setBlueBallFour(new BigDecimal((double)blueBallFour/30).setScale(4,BigDecimal.ROUND_HALF_UP));
        thirtyBlueBallProbabilityDTO.setBlueBallFive(new BigDecimal((double)blueBallFive/30).setScale(4,BigDecimal.ROUND_HALF_UP));
        thirtyBlueBallProbabilityDTO.setBlueBallSix(new BigDecimal((double)blueBallSix/30).setScale(4,BigDecimal.ROUND_HALF_UP));
        thirtyBlueBallProbabilityDTO.setBlueBallSeven(new BigDecimal((double)blueBallSeven/30).setScale(4,BigDecimal.ROUND_HALF_UP));
        thirtyBlueBallProbabilityDTO.setBlueBallEight(new BigDecimal((double)blueBallEight/30).setScale(4,BigDecimal.ROUND_HALF_UP));
        thirtyBlueBallProbabilityDTO.setBlueBallNine(new BigDecimal((double)blueBallNine/30).setScale(4,BigDecimal.ROUND_HALF_UP));
        thirtyBlueBallProbabilityDTO.setBlueBallTen(new BigDecimal((double)blueBallTen/30).setScale(4,BigDecimal.ROUND_HALF_UP));
        thirtyBlueBallProbabilityDTO.setBlueBallEleven(new BigDecimal((double)blueBallEleven/30).setScale(4,BigDecimal.ROUND_HALF_UP));
        thirtyBlueBallProbabilityDTO.setBlueBallTwelve(new BigDecimal((double)blueBallTwelve/30).setScale(4,BigDecimal.ROUND_HALF_UP));
        thirtyBlueBallProbabilityDTO.setBlueBallThirteen(new BigDecimal((double)blueBallThirteen/30).setScale(4,BigDecimal.ROUND_HALF_UP));
        thirtyBlueBallProbabilityDTO.setBlueBallFourteen(new BigDecimal((double)blueBallFourteen/30).setScale(4,BigDecimal.ROUND_HALF_UP));
        thirtyBlueBallProbabilityDTO.setBlueBallFifteen(new BigDecimal((double)blueBallFifteen/30).setScale(4,BigDecimal.ROUND_HALF_UP));
        thirtyBlueBallProbabilityDTO.setBlueBallSixteen(new BigDecimal((double)blueBallSixteen/30).setScale(4,BigDecimal.ROUND_HALF_UP));
        thirtyBlueBallProbabilityDTO.setLastUpdateDate(new Date());
        if(blueProbabilityCount == 0){
            thirtyBlueBallProbabilityService.addThirtyBlueBallProbability(thirtyBlueBallProbabilityDTO);
        }
    }

    /**
     * 更新最新50期的蓝球概率
     */
    private void updateFiftyBlueBallProbability(){
        //获取1号蓝球出现的次数
        Integer blueBallOne = basePeriodService.getLatestFiftyNeedBlueBallCountPeriod("01");
        //获取2号蓝球出现的次数
        Integer blueBallTwo = basePeriodService.getLatestFiftyNeedBlueBallCountPeriod("02");
        //获取3号蓝球出现的次数
        Integer blueBallThree = basePeriodService.getLatestFiftyNeedBlueBallCountPeriod("03");
        //获取4号蓝球出现的次数
        Integer blueBallFour = basePeriodService.getLatestFiftyNeedBlueBallCountPeriod("04");
        //获取5号蓝球出现的次数
        Integer blueBallFive = basePeriodService.getLatestFiftyNeedBlueBallCountPeriod("05");
        //获取6号蓝球出现的次数
        Integer blueBallSix = basePeriodService.getLatestFiftyNeedBlueBallCountPeriod("06");
        //获取7号蓝球出现的次数
        Integer blueBallSeven = basePeriodService.getLatestFiftyNeedBlueBallCountPeriod("07");
        //获取8号蓝球出现的次数
        Integer blueBallEight = basePeriodService.getLatestFiftyNeedBlueBallCountPeriod("08");
        //获取9号蓝球出现的次数
        Integer blueBallNine = basePeriodService.getLatestFiftyNeedBlueBallCountPeriod("09");
        //获取10号蓝球出现的次数
        Integer blueBallTen = basePeriodService.getLatestFiftyNeedBlueBallCountPeriod("10");
        //获取11号蓝球出现的次数
        Integer blueBallEleven = basePeriodService.getLatestFiftyNeedBlueBallCountPeriod("11");
        //获取12号蓝球出现的次数
        Integer blueBallTwelve = basePeriodService.getLatestFiftyNeedBlueBallCountPeriod("12");
        //获取13号蓝球出现的次数
        Integer blueBallThirteen = basePeriodService.getLatestFiftyNeedBlueBallCountPeriod("13");
        //获取14号蓝球出现的次数
        Integer blueBallFourteen = basePeriodService.getLatestFiftyNeedBlueBallCountPeriod("14");
        //获取15号蓝球出现的次数
        Integer blueBallFifteen = basePeriodService.getLatestFiftyNeedBlueBallCountPeriod("15");
        //获取16号蓝球出现的次数
        Integer blueBallSixteen = basePeriodService.getLatestFiftyNeedBlueBallCountPeriod("16");

        FiftyBlueBallProbabilityDTO fiftyBlueBallProbabilityDTO = new FiftyBlueBallProbabilityDTO();
        fiftyBlueBallProbabilityDTO.setBlueBallOne(new BigDecimal((double)blueBallOne/50).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiftyBlueBallProbabilityDTO.setBlueBallTwo(new BigDecimal((double)blueBallTwo/50).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiftyBlueBallProbabilityDTO.setBlueBallThree(new BigDecimal((double)blueBallThree/50).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiftyBlueBallProbabilityDTO.setBlueBallFour(new BigDecimal((double)blueBallFour/50).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiftyBlueBallProbabilityDTO.setBlueBallFive(new BigDecimal((double)blueBallFive/50).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiftyBlueBallProbabilityDTO.setBlueBallSix(new BigDecimal((double)blueBallSix/50).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiftyBlueBallProbabilityDTO.setBlueBallSeven(new BigDecimal((double)blueBallSeven/50).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiftyBlueBallProbabilityDTO.setBlueBallEight(new BigDecimal((double)blueBallEight/50).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiftyBlueBallProbabilityDTO.setBlueBallNine(new BigDecimal((double)blueBallNine/50).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiftyBlueBallProbabilityDTO.setBlueBallTen(new BigDecimal((double)blueBallTen/50).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiftyBlueBallProbabilityDTO.setBlueBallEleven(new BigDecimal((double)blueBallEleven/50).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiftyBlueBallProbabilityDTO.setBlueBallTwelve(new BigDecimal((double)blueBallTwelve/50).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiftyBlueBallProbabilityDTO.setBlueBallThirteen(new BigDecimal((double)blueBallThirteen/50).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiftyBlueBallProbabilityDTO.setBlueBallFourteen(new BigDecimal((double)blueBallFourteen/50).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiftyBlueBallProbabilityDTO.setBlueBallFifteen(new BigDecimal((double)blueBallFifteen/50).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiftyBlueBallProbabilityDTO.setBlueBallSixteen(new BigDecimal((double)blueBallSixteen/50).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiftyBlueBallProbabilityDTO.setLastUpdateDate(new Date());
        if(blueProbabilityCount == 0){
            fiftyBlueBallProbabilityService.addFiftyBlueBallProbability(fiftyBlueBallProbabilityDTO);
        }
    }

    /**
     * 更新最新100期的蓝球概率
     */
    private void updateOneHundredBlueBallProbability(){
        //获取1号蓝球出现的次数
        Integer blueBallOne = basePeriodService.getLatestOneHundredNeedBlueBallCountPeriod("01");
        //获取2号蓝球出现的次数
        Integer blueBallTwo = basePeriodService.getLatestOneHundredNeedBlueBallCountPeriod("02");
        //获取3号蓝球出现的次数
        Integer blueBallThree = basePeriodService.getLatestOneHundredNeedBlueBallCountPeriod("03");
        //获取4号蓝球出现的次数
        Integer blueBallFour = basePeriodService.getLatestOneHundredNeedBlueBallCountPeriod("04");
        //获取5号蓝球出现的次数
        Integer blueBallFive = basePeriodService.getLatestOneHundredNeedBlueBallCountPeriod("05");
        //获取6号蓝球出现的次数
        Integer blueBallSix = basePeriodService.getLatestOneHundredNeedBlueBallCountPeriod("06");
        //获取7号蓝球出现的次数
        Integer blueBallSeven = basePeriodService.getLatestOneHundredNeedBlueBallCountPeriod("07");
        //获取8号蓝球出现的次数
        Integer blueBallEight = basePeriodService.getLatestOneHundredNeedBlueBallCountPeriod("08");
        //获取9号蓝球出现的次数
        Integer blueBallNine = basePeriodService.getLatestOneHundredNeedBlueBallCountPeriod("09");
        //获取10号蓝球出现的次数
        Integer blueBallTen = basePeriodService.getLatestOneHundredNeedBlueBallCountPeriod("10");
        //获取11号蓝球出现的次数
        Integer blueBallEleven = basePeriodService.getLatestOneHundredNeedBlueBallCountPeriod("11");
        //获取12号蓝球出现的次数
        Integer blueBallTwelve = basePeriodService.getLatestOneHundredNeedBlueBallCountPeriod("12");
        //获取13号蓝球出现的次数
        Integer blueBallThirteen = basePeriodService.getLatestOneHundredNeedBlueBallCountPeriod("13");
        //获取14号蓝球出现的次数
        Integer blueBallFourteen = basePeriodService.getLatestOneHundredNeedBlueBallCountPeriod("14");
        //获取15号蓝球出现的次数
        Integer blueBallFifteen = basePeriodService.getLatestOneHundredNeedBlueBallCountPeriod("15");
        //获取16号蓝球出现的次数
        Integer blueBallSixteen = basePeriodService.getLatestOneHundredNeedBlueBallCountPeriod("16");

        OneHundredBlueBallProbabilityDTO oneHundredBlueBallProbabilityDTO = new OneHundredBlueBallProbabilityDTO();
        oneHundredBlueBallProbabilityDTO.setBlueBallOne(new BigDecimal((double)blueBallOne/100).setScale(4,BigDecimal.ROUND_HALF_UP));
        oneHundredBlueBallProbabilityDTO.setBlueBallTwo(new BigDecimal((double)blueBallTwo/100).setScale(4,BigDecimal.ROUND_HALF_UP));
        oneHundredBlueBallProbabilityDTO.setBlueBallThree(new BigDecimal((double)blueBallThree/100).setScale(4,BigDecimal.ROUND_HALF_UP));
        oneHundredBlueBallProbabilityDTO.setBlueBallFour(new BigDecimal((double)blueBallFour/100).setScale(4,BigDecimal.ROUND_HALF_UP));
        oneHundredBlueBallProbabilityDTO.setBlueBallFive(new BigDecimal((double)blueBallFive/100).setScale(4,BigDecimal.ROUND_HALF_UP));
        oneHundredBlueBallProbabilityDTO.setBlueBallSix(new BigDecimal((double)blueBallSix/100).setScale(4,BigDecimal.ROUND_HALF_UP));
        oneHundredBlueBallProbabilityDTO.setBlueBallSeven(new BigDecimal((double)blueBallSeven/100).setScale(4,BigDecimal.ROUND_HALF_UP));
        oneHundredBlueBallProbabilityDTO.setBlueBallEight(new BigDecimal((double)blueBallEight/100).setScale(4,BigDecimal.ROUND_HALF_UP));
        oneHundredBlueBallProbabilityDTO.setBlueBallNine(new BigDecimal((double)blueBallNine/100).setScale(4,BigDecimal.ROUND_HALF_UP));
        oneHundredBlueBallProbabilityDTO.setBlueBallTen(new BigDecimal((double)blueBallTen/100).setScale(4,BigDecimal.ROUND_HALF_UP));
        oneHundredBlueBallProbabilityDTO.setBlueBallEleven(new BigDecimal((double)blueBallEleven/100).setScale(4,BigDecimal.ROUND_HALF_UP));
        oneHundredBlueBallProbabilityDTO.setBlueBallTwelve(new BigDecimal((double)blueBallTwelve/100).setScale(4,BigDecimal.ROUND_HALF_UP));
        oneHundredBlueBallProbabilityDTO.setBlueBallThirteen(new BigDecimal((double)blueBallThirteen/100).setScale(4,BigDecimal.ROUND_HALF_UP));
        oneHundredBlueBallProbabilityDTO.setBlueBallFourteen(new BigDecimal((double)blueBallFourteen/100).setScale(4,BigDecimal.ROUND_HALF_UP));
        oneHundredBlueBallProbabilityDTO.setBlueBallFifteen(new BigDecimal((double)blueBallFifteen/100).setScale(4,BigDecimal.ROUND_HALF_UP));
        oneHundredBlueBallProbabilityDTO.setBlueBallSixteen(new BigDecimal((double)blueBallSixteen/100).setScale(4,BigDecimal.ROUND_HALF_UP));
        oneHundredBlueBallProbabilityDTO.setLastUpdateDate(new Date());
        if(blueProbabilityCount == 0){
            oneHundredBlueBallProbabilityService.addOneHundredBlueBallProbability(oneHundredBlueBallProbabilityDTO);
        }
    }
}
