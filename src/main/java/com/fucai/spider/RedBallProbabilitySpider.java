package com.fucai.spider;

import com.fucai.dto.*;
import com.fucai.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/11
 * @description
 */
@Component
@EnableScheduling
public class RedBallProbabilitySpider {

    @Autowired
    private BasePeriodService basePeriodService;
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
    private OddEvenProbabilityService oddEvenProbabilityService;
    @Autowired
    private SectionProbabilityService sectionProbabilityService;
    @Autowired
    private DataLocationProbabilityService dataLocationProbabilityService;

    private static Integer redProbabilityCount = 1;

    @Scheduled(cron = "${redBall.begin.time}")
    public void allPeriodProbability(){
        //获取总的期数
        Integer totalPeriodCount = basePeriodService.getCountPeriod();
        if(totalPeriodCount != null && totalPeriodCount > 0){
            //所有红球的概率
            updateRedBallProbability(totalPeriodCount);
            //最新5期的红球概率
            updateLatestFiveRedBallProbability();
            //最新30期的红球概率
            updateLatestThirtyRedBallProbability();
            //最新50期的红球概率
            updateLatestFiftyRedBallProbability();
            //最新100期的红球概率
            updateLatestOneHundredRedBallProbability();
            //更新基础表中的奇数偶数
            basePeriodService.updateOddEvenData();
            //更新奇数偶数概率
            updateOddEvenProbability(totalPeriodCount);
            //更新区间概率
            updateSectionProbability(totalPeriodCount);
            //更新位置区间概率
            updateDataLocationProbability(totalPeriodCount);
        }
    }

    /**
     * 所有红球的概率
     * @param totalPeriodCount
     */
    private void updateRedBallProbability(int totalPeriodCount){
        //获取1号红球出现的次数
        Integer redOneBallCount = basePeriodService.getNeedRedBallCountPeriod("01");
        //获取2号红球出现的次数
        Integer redTwoBallCount = basePeriodService.getNeedRedBallCountPeriod("02");
        //获取3号红球出现的次数
        Integer redThreeBallCount = basePeriodService.getNeedRedBallCountPeriod("03");
        //获取4号红球出现的次数
        Integer redFourBallCount = basePeriodService.getNeedRedBallCountPeriod("04");
        //获取5号红球出现的次数
        Integer redFiveBallCount = basePeriodService.getNeedRedBallCountPeriod("05");
        //获取6号红球出现的次数
        Integer redSixBallCount = basePeriodService.getNeedRedBallCountPeriod("06");
        //获取7号红球出现的次数
        Integer redSevenBallCount = basePeriodService.getNeedRedBallCountPeriod("07");
        //获取8号红球出现的次数
        Integer redEightBallCount = basePeriodService.getNeedRedBallCountPeriod("08");
        //获取9号红球出现的次数
        Integer redNineBallCount = basePeriodService.getNeedRedBallCountPeriod("09");
        //获取10号红球出现的次数
        Integer redTenBallCount = basePeriodService.getNeedRedBallCountPeriod("10");
        //获取11号红球出现的次数
        Integer redElevenBallCount = basePeriodService.getNeedRedBallCountPeriod("11");
        //获取12号红球出现的次数
        Integer redTwelveBallCount = basePeriodService.getNeedRedBallCountPeriod("12");
        //获取13号红球出现的次数
        Integer redThirteenBallCount = basePeriodService.getNeedRedBallCountPeriod("13");
        //获取14号红球出现的次数
        Integer redFourteenBallCount = basePeriodService.getNeedRedBallCountPeriod("14");
        //获取15号红球出现的次数
        Integer redFifteenBallCount = basePeriodService.getNeedRedBallCountPeriod("15");
        //获取16号红球出现的次数
        Integer redSixteenBallCount = basePeriodService.getNeedRedBallCountPeriod("16");
        //获取17号红球出现的次数
        Integer redSeventeenBallCount = basePeriodService.getNeedRedBallCountPeriod("17");
        //获取18号红球出现的次数
        Integer redEighteenBallCount = basePeriodService.getNeedRedBallCountPeriod("18");
        //获取19号红球出现的次数
        Integer redNineteenBallCount = basePeriodService.getNeedRedBallCountPeriod("19");
        //获取20号红球出现的次数
        Integer redTwentyBallCount = basePeriodService.getNeedRedBallCountPeriod("20");
        //获取21号红球出现的次数
        Integer redTwentyOneBallCount = basePeriodService.getNeedRedBallCountPeriod("21");
        //获取22号红球出现的次数
        Integer redTwentyTwoBallCount = basePeriodService.getNeedRedBallCountPeriod("22");
        //获取23号红球出现的次数
        Integer redTwentyThreeBallCount = basePeriodService.getNeedRedBallCountPeriod("23");
        //获取24号红球出现的次数
        Integer redTwentyFourBallCount = basePeriodService.getNeedRedBallCountPeriod("24");
        //获取25号红球出现的次数
        Integer redTwentyFiveBallCount = basePeriodService.getNeedRedBallCountPeriod("25");
        //获取26号红球出现的次数
        Integer redTwentySixBallCount = basePeriodService.getNeedRedBallCountPeriod("26");
        //获取27号红球出现的次数
        Integer redTwentySevenBallCount = basePeriodService.getNeedRedBallCountPeriod("27");
        //获取28号红球出现的次数
        Integer redTwentyEightBallCount = basePeriodService.getNeedRedBallCountPeriod("28");
        //获取29号红球出现的次数
        Integer redTwentyNineBallCount = basePeriodService.getNeedRedBallCountPeriod("29");
        //获取30号红球出现的次数
        Integer redThirtyBallCount = basePeriodService.getNeedRedBallCountPeriod("30");
        //获取31号红球出现的次数
        Integer redThirtyOneBallCount = basePeriodService.getNeedRedBallCountPeriod("31");
        //获取32号红球出现的次数
        Integer redThirtyTwoBallCount = basePeriodService.getNeedRedBallCountPeriod("32");
        //获取33号红球出现的次数
        Integer redThirtyThreeBallCount = basePeriodService.getNeedRedBallCountPeriod("33");
        RedBallProbabilityDTO redBallProbabilityDTO = new RedBallProbabilityDTO();
        redBallProbabilityDTO.setRedBallOne(new BigDecimal((double)redOneBallCount/totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallTwo(new BigDecimal((double)redTwoBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallThree(new BigDecimal((double)redThreeBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallFour(new BigDecimal((double)redFourBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallFive(new BigDecimal((double)redFiveBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallSix(new BigDecimal((double)redSixBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallSeven(new BigDecimal((double)redSevenBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallEight(new BigDecimal((double)redEightBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallNine(new BigDecimal((double)redNineBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallTen(new BigDecimal((double)redTenBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallEleven(new BigDecimal((double)redElevenBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallTwelve(new BigDecimal((double)redTwelveBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallThirteen(new BigDecimal((double)redThirteenBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallFourteen(new BigDecimal((double)redFourteenBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallFifteen(new BigDecimal((double)redFifteenBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallSixteen(new BigDecimal((double)redSixteenBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallSeventeen(new BigDecimal((double)redSeventeenBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallEighteen(new BigDecimal((double)redEighteenBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallNineteen(new BigDecimal((double)redNineteenBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallTwenty(new BigDecimal((double)redTwentyBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallTwentyOne(new BigDecimal((double)redTwentyOneBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallTwentyTwo(new BigDecimal((double)redTwentyTwoBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallTwentyThree(new BigDecimal((double)redTwentyThreeBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallTwentyFour(new BigDecimal((double)redTwentyFourBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallTwentyFive(new BigDecimal((double)redTwentyFiveBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallTwentySix(new BigDecimal((double)redTwentySixBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallTwentySeven(new BigDecimal((double)redTwentySevenBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallTwentyEight(new BigDecimal((double)redTwentyEightBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallTwentyNine(new BigDecimal((double)redTwentyNineBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallThirty(new BigDecimal((double)redThirtyBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallThirtyOne(new BigDecimal((double)redThirtyOneBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallThirtyTwo(new BigDecimal((double)redThirtyTwoBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setRedBallThirtyThree(new BigDecimal((double)redThirtyThreeBallCount / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
        redBallProbabilityDTO.setLastUpdateDate(new Date());
        //判断是否已经存在红球概率
        Integer ballProbabilityDTO = redBallProbabilityService.getCountRedBallProbability(redBallProbabilityDTO);
        if(ballProbabilityDTO == 0){
            redProbabilityCount = 0;
            //新增红球概率
            redBallProbabilityService.addRedBallProbability(redBallProbabilityDTO);
        }else {
            //更新红球概率
            /*redBallProbabilityDTO.setBallProbabilityId(ballProbabilityDTO.getBallProbabilityId());
            redBallProbabilityService.updateRedBallProbability(redBallProbabilityDTO);*/
            redProbabilityCount = 1;
        }
    }

    /**
     * 获取最新5期的概率
     */
    private void updateLatestFiveRedBallProbability(){
        //获取1号红球出现的次数
        Integer redOneBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("01");
        //获取2号红球出现的次数
        Integer redTwoBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("02");
        //获取3号红球出现的次数
        Integer redThreeBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("03");
        //获取4号红球出现的次数
        Integer redFourBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("04");
        //获取5号红球出现的次数
        Integer redFiveBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("05");
        //获取6号红球出现的次数
        Integer redSixBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("06");
        //获取7号红球出现的次数
        Integer redSevenBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("07");
        //获取8号红球出现的次数
        Integer redEightBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("08");
        //获取9号红球出现的次数
        Integer redNineBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("09");
        //获取10号红球出现的次数
        Integer redTenBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("10");
        //获取11号红球出现的次数
        Integer redElevenBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("11");
        //获取12号红球出现的次数
        Integer redTwelveBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("12");
        //获取13号红球出现的次数
        Integer redThirteenBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("13");
        //获取14号红球出现的次数
        Integer redFourteenBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("14");
        //获取15号红球出现的次数
        Integer redFifteenBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("15");
        //获取16号红球出现的次数
        Integer redSixteenBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("16");
        //获取17号红球出现的次数
        Integer redSeventeenBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("17");
        //获取18号红球出现的次数
        Integer redEighteenBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("18");
        //获取19号红球出现的次数
        Integer redNineteenBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("19");
        //获取20号红球出现的次数
        Integer redTwentyBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("20");
        //获取21号红球出现的次数
        Integer redTwentyOneBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("21");
        //获取22号红球出现的次数
        Integer redTwentyTwoBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("22");
        //获取23号红球出现的次数
        Integer redTwentyThreeBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("23");
        //获取24号红球出现的次数
        Integer redTwentyFourBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("24");
        //获取25号红球出现的次数
        Integer redTwentyFiveBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("25");
        //获取26号红球出现的次数
        Integer redTwentySixBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("26");
        //获取27号红球出现的次数
        Integer redTwentySevenBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("27");
        //获取28号红球出现的次数
        Integer redTwentyEightBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("28");
        //获取29号红球出现的次数
        Integer redTwentyNineBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("29");
        //获取30号红球出现的次数
        Integer redThirtyBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("30");
        //获取31号红球出现的次数
        Integer redThirtyOneBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("31");
        //获取32号红球出现的次数
        Integer redThirtyTwoBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("32");
        //获取33号红球出现的次数
        Integer redThirtyThreeBallCount = basePeriodService.getLatestFiveNeedRedBallCountPeriod("33");
        FiveRedBallProbabilityDTO fiveRedBallProbabilityDTO = new FiveRedBallProbabilityDTO();
        fiveRedBallProbabilityDTO.setRedBallOne(new BigDecimal((double)redOneBallCount/5).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallTwo(new BigDecimal((double)redTwoBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallThree(new BigDecimal((double)redThreeBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallFour(new BigDecimal((double)redFourBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallFive(new BigDecimal((double)redFiveBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallSix(new BigDecimal((double)redSixBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallSeven(new BigDecimal((double)redSevenBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallEight(new BigDecimal((double)redEightBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallNine(new BigDecimal((double)redNineBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallTen(new BigDecimal((double)redTenBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallEleven(new BigDecimal((double)redElevenBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallTwelve(new BigDecimal((double)redTwelveBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallThirteen(new BigDecimal((double)redThirteenBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallFourteen(new BigDecimal((double)redFourteenBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallFifteen(new BigDecimal((double)redFifteenBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallSixteen(new BigDecimal((double)redSixteenBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallSeventeen(new BigDecimal((double)redSeventeenBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallEighteen(new BigDecimal((double)redEighteenBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallNineteen(new BigDecimal((double)redNineteenBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallTwenty(new BigDecimal((double)redTwentyBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallTwentyOne(new BigDecimal((double)redTwentyOneBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallTwentyTwo(new BigDecimal((double)redTwentyTwoBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallTwentyThree(new BigDecimal((double)redTwentyThreeBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallTwentyFour(new BigDecimal((double)redTwentyFourBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallTwentyFive(new BigDecimal((double)redTwentyFiveBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallTwentySix(new BigDecimal((double)redTwentySixBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallTwentySeven(new BigDecimal((double)redTwentySevenBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallTwentyEight(new BigDecimal((double)redTwentyEightBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallTwentyNine(new BigDecimal((double)redTwentyNineBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallThirty(new BigDecimal((double)redThirtyBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallThirtyOne(new BigDecimal((double)redThirtyOneBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallThirtyTwo(new BigDecimal((double)redThirtyTwoBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setRedBallThirtyThree(new BigDecimal((double)redThirtyThreeBallCount / 5).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiveRedBallProbabilityDTO.setLastUpdateDate(new Date());
        //判断是否已经存在红球概率
        /*FiveRedBallProbabilityDTO ballProbabilityDTO = fiveRedBallProbabilityService.getRedBallProbability();
        if(ballProbabilityDTO == null){*/
        if(redProbabilityCount == 0){
            //新增红球概率
            fiveRedBallProbabilityService.addFiveRedBallProbability(fiveRedBallProbabilityDTO);
        }

        /*}else {
            //更新红球概率
            fiveRedBallProbabilityDTO.setBallProbabilityId(ballProbabilityDTO.getBallProbabilityId());
            fiveRedBallProbabilityService.updateFiveRedBallProbability(fiveRedBallProbabilityDTO);
        }*/
    }

    /**
     * 获取最新30期的概率
     */
    private void updateLatestThirtyRedBallProbability(){
        //获取1号红球出现的次数
        Integer redOneBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("01");
        //获取2号红球出现的次数
        Integer redTwoBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("02");
        //获取3号红球出现的次数
        Integer redThreeBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("03");
        //获取4号红球出现的次数
        Integer redFourBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("04");
        //获取5号红球出现的次数
        Integer redFiveBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("05");
        //获取6号红球出现的次数
        Integer redSixBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("06");
        //获取7号红球出现的次数
        Integer redSevenBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("07");
        //获取8号红球出现的次数
        Integer redEightBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("08");
        //获取9号红球出现的次数
        Integer redNineBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("09");
        //获取10号红球出现的次数
        Integer redTenBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("10");
        //获取11号红球出现的次数
        Integer redElevenBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("11");
        //获取12号红球出现的次数
        Integer redTwelveBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("12");
        //获取13号红球出现的次数
        Integer redThirteenBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("13");
        //获取14号红球出现的次数
        Integer redFourteenBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("14");
        //获取15号红球出现的次数
        Integer redFifteenBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("15");
        //获取16号红球出现的次数
        Integer redSixteenBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("16");
        //获取17号红球出现的次数
        Integer redSeventeenBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("17");
        //获取18号红球出现的次数
        Integer redEighteenBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("18");
        //获取19号红球出现的次数
        Integer redNineteenBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("19");
        //获取20号红球出现的次数
        Integer redTwentyBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("20");
        //获取21号红球出现的次数
        Integer redTwentyOneBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("21");
        //获取22号红球出现的次数
        Integer redTwentyTwoBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("22");
        //获取23号红球出现的次数
        Integer redTwentyThreeBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("23");
        //获取24号红球出现的次数
        Integer redTwentyFourBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("24");
        //获取25号红球出现的次数
        Integer redTwentyFiveBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("25");
        //获取26号红球出现的次数
        Integer redTwentySixBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("26");
        //获取27号红球出现的次数
        Integer redTwentySevenBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("27");
        //获取28号红球出现的次数
        Integer redTwentyEightBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("28");
        //获取29号红球出现的次数
        Integer redTwentyNineBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("29");
        //获取30号红球出现的次数
        Integer redThirtyBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("30");
        //获取31号红球出现的次数
        Integer redThirtyOneBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("31");
        //获取32号红球出现的次数
        Integer redThirtyTwoBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("32");
        //获取33号红球出现的次数
        Integer redThirtyThreeBallCount = basePeriodService.getLatestThirtyNeedRedBallCountPeriod("33");

        ThirtyRedBallProbabilityDTO thirtyRedBallProbabilityDTO = new ThirtyRedBallProbabilityDTO();
        thirtyRedBallProbabilityDTO.setRedBallOne(new BigDecimal((double)redOneBallCount/30).setScale(4,BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallTwo(new BigDecimal((double)redTwoBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallThree(new BigDecimal((double)redThreeBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallFour(new BigDecimal((double)redFourBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallFive(new BigDecimal((double)redFiveBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallSix(new BigDecimal((double)redSixBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallSeven(new BigDecimal((double)redSevenBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallEight(new BigDecimal((double)redEightBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallNine(new BigDecimal((double)redNineBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallTen(new BigDecimal((double)redTenBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallEleven(new BigDecimal((double)redElevenBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallTwelve(new BigDecimal((double)redTwelveBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallThirteen(new BigDecimal((double)redThirteenBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallFourteen(new BigDecimal((double)redFourteenBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallFifteen(new BigDecimal((double)redFifteenBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallSixteen(new BigDecimal((double)redSixteenBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallSeventeen(new BigDecimal((double)redSeventeenBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallEighteen(new BigDecimal((double)redEighteenBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallNineteen(new BigDecimal((double)redNineteenBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallTwenty(new BigDecimal((double)redTwentyBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallTwentyOne(new BigDecimal((double)redTwentyOneBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallTwentyTwo(new BigDecimal((double)redTwentyTwoBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallTwentyThree(new BigDecimal((double)redTwentyThreeBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallTwentyFour(new BigDecimal((double)redTwentyFourBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallTwentyFive(new BigDecimal((double)redTwentyFiveBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallTwentySix(new BigDecimal((double)redTwentySixBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallTwentySeven(new BigDecimal((double)redTwentySevenBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallTwentyEight(new BigDecimal((double)redTwentyEightBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallTwentyNine(new BigDecimal((double)redTwentyNineBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallThirty(new BigDecimal((double)redThirtyBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallThirtyOne(new BigDecimal((double)redThirtyOneBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallThirtyTwo(new BigDecimal((double)redThirtyTwoBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setRedBallThirtyThree(new BigDecimal((double)redThirtyThreeBallCount / 30).setScale(4, BigDecimal.ROUND_HALF_UP));
        thirtyRedBallProbabilityDTO.setLastUpdateDate(new Date());
        //判断是否已经存在红球概率
        /*ThirtyRedBallProbabilityDTO ballProbabilityDTO = thirtyRedBallProbabilityService.getRedBallProbability();
        if(ballProbabilityDTO == null){*/
        if(redProbabilityCount == 0){
            //新增红球概率
            thirtyRedBallProbabilityService.addThirtyRedBallProbability(thirtyRedBallProbabilityDTO);
        }
        /*}else {
            //更新红球概率
            thirtyRedBallProbabilityDTO.setBallProbabilityId(ballProbabilityDTO.getBallProbabilityId());
            thirtyRedBallProbabilityService.updateThirtyRedBallProbability(thirtyRedBallProbabilityDTO);
        }*/
    }

    /**
     * 获取最新50期的概率
     */
    private void updateLatestFiftyRedBallProbability(){
        //获取1号红球出现的次数
        Integer redOneBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("01");
        //获取2号红球出现的次数
        Integer redTwoBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("02");
        //获取3号红球出现的次数
        Integer redThreeBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("03");
        //获取4号红球出现的次数
        Integer redFourBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("04");
        //获取5号红球出现的次数
        Integer redFiveBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("05");
        //获取6号红球出现的次数
        Integer redSixBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("06");
        //获取7号红球出现的次数
        Integer redSevenBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("07");
        //获取8号红球出现的次数
        Integer redEightBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("08");
        //获取9号红球出现的次数
        Integer redNineBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("09");
        //获取10号红球出现的次数
        Integer redTenBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("10");
        //获取11号红球出现的次数
        Integer redElevenBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("11");
        //获取12号红球出现的次数
        Integer redTwelveBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("12");
        //获取13号红球出现的次数
        Integer redThirteenBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("13");
        //获取14号红球出现的次数
        Integer redFourteenBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("14");
        //获取15号红球出现的次数
        Integer redFifteenBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("15");
        //获取16号红球出现的次数
        Integer redSixteenBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("16");
        //获取17号红球出现的次数
        Integer redSeventeenBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("17");
        //获取18号红球出现的次数
        Integer redEighteenBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("18");
        //获取19号红球出现的次数
        Integer redNineteenBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("19");
        //获取20号红球出现的次数
        Integer redTwentyBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("20");
        //获取21号红球出现的次数
        Integer redTwentyOneBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("21");
        //获取22号红球出现的次数
        Integer redTwentyTwoBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("22");
        //获取23号红球出现的次数
        Integer redTwentyThreeBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("23");
        //获取24号红球出现的次数
        Integer redTwentyFourBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("24");
        //获取25号红球出现的次数
        Integer redTwentyFiveBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("25");
        //获取26号红球出现的次数
        Integer redTwentySixBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("26");
        //获取27号红球出现的次数
        Integer redTwentySevenBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("27");
        //获取28号红球出现的次数
        Integer redTwentyEightBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("28");
        //获取29号红球出现的次数
        Integer redTwentyNineBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("29");
        //获取30号红球出现的次数
        Integer redThirtyBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("30");
        //获取31号红球出现的次数
        Integer redThirtyOneBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("31");
        //获取32号红球出现的次数
        Integer redThirtyTwoBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("32");
        //获取33号红球出现的次数
        Integer redThirtyThreeBallCount = basePeriodService.getLatestFiftyNeedRedBallCountPeriod("33");

        FiftyRedBallProbabilityDTO fiftyRedBallProbabilityDTO = new FiftyRedBallProbabilityDTO();
        fiftyRedBallProbabilityDTO.setRedBallOne(new BigDecimal((double)redOneBallCount / 50).setScale(4,BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallTwo(new BigDecimal((double)redTwoBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallThree(new BigDecimal((double)redThreeBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallFour(new BigDecimal((double)redFourBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallFive(new BigDecimal((double)redFiveBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallSix(new BigDecimal((double)redSixBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallSeven(new BigDecimal((double)redSevenBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallEight(new BigDecimal((double)redEightBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallNine(new BigDecimal((double)redNineBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallTen(new BigDecimal((double)redTenBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallEleven(new BigDecimal((double)redElevenBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallTwelve(new BigDecimal((double)redTwelveBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallThirteen(new BigDecimal((double)redThirteenBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallFourteen(new BigDecimal((double)redFourteenBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallFifteen(new BigDecimal((double)redFifteenBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallSixteen(new BigDecimal((double)redSixteenBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallSeventeen(new BigDecimal((double)redSeventeenBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallEighteen(new BigDecimal((double)redEighteenBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallNineteen(new BigDecimal((double)redNineteenBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallTwenty(new BigDecimal((double)redTwentyBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallTwentyOne(new BigDecimal((double)redTwentyOneBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallTwentyTwo(new BigDecimal((double)redTwentyTwoBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallTwentyThree(new BigDecimal((double)redTwentyThreeBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallTwentyFour(new BigDecimal((double)redTwentyFourBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallTwentyFive(new BigDecimal((double)redTwentyFiveBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallTwentySix(new BigDecimal((double)redTwentySixBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallTwentySeven(new BigDecimal((double)redTwentySevenBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallTwentyEight(new BigDecimal((double)redTwentyEightBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallTwentyNine(new BigDecimal((double)redTwentyNineBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallThirty(new BigDecimal((double)redThirtyBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallThirtyOne(new BigDecimal((double)redThirtyOneBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallThirtyTwo(new BigDecimal((double)redThirtyTwoBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setRedBallThirtyThree(new BigDecimal((double)redThirtyThreeBallCount / 50).setScale(4, BigDecimal.ROUND_HALF_UP));
        fiftyRedBallProbabilityDTO.setLastUpdateDate(new Date());
        //判断是否已经存在红球概率
        /*FiftyRedBallProbabilityDTO ballProbabilityDTO = fiftyRedBallProbabilityService.getRedBallProbability();
        if(ballProbabilityDTO == null){*/
        if(redProbabilityCount == 0){
            //新增红球概率
            fiftyRedBallProbabilityService.addFiftyRedBallProbability(fiftyRedBallProbabilityDTO);
        }
        /*}else {
            //更新红球概率
            fiftyRedBallProbabilityDTO.setBallProbabilityId(ballProbabilityDTO.getBallProbabilityId());
            fiftyRedBallProbabilityService.updateFiftyRedBallProbability(fiftyRedBallProbabilityDTO);
        }*/
    }

    /**
     * 获取最新100期的概率
     */
    private void updateLatestOneHundredRedBallProbability(){
        //获取1号红球出现的次数
        Integer redOneBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("01");
        //获取2号红球出现的次数
        Integer redTwoBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("02");
        //获取3号红球出现的次数
        Integer redThreeBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("03");
        //获取4号红球出现的次数
        Integer redFourBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("04");
        //获取5号红球出现的次数
        Integer redFiveBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("05");
        //获取6号红球出现的次数
        Integer redSixBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("06");
        //获取7号红球出现的次数
        Integer redSevenBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("07");
        //获取8号红球出现的次数
        Integer redEightBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("08");
        //获取9号红球出现的次数
        Integer redNineBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("09");
        //获取10号红球出现的次数
        Integer redTenBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("10");
        //获取11号红球出现的次数
        Integer redElevenBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("11");
        //获取12号红球出现的次数
        Integer redTwelveBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("12");
        //获取13号红球出现的次数
        Integer redThirteenBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("13");
        //获取14号红球出现的次数
        Integer redFourteenBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("14");
        //获取15号红球出现的次数
        Integer redFifteenBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("15");
        //获取16号红球出现的次数
        Integer redSixteenBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("16");
        //获取17号红球出现的次数
        Integer redSeventeenBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("17");
        //获取18号红球出现的次数
        Integer redEighteenBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("18");
        //获取19号红球出现的次数
        Integer redNineteenBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("19");
        //获取20号红球出现的次数
        Integer redTwentyBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("20");
        //获取21号红球出现的次数
        Integer redTwentyOneBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("21");
        //获取22号红球出现的次数
        Integer redTwentyTwoBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("22");
        //获取23号红球出现的次数
        Integer redTwentyThreeBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("23");
        //获取24号红球出现的次数
        Integer redTwentyFourBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("24");
        //获取25号红球出现的次数
        Integer redTwentyFiveBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("25");
        //获取26号红球出现的次数
        Integer redTwentySixBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("26");
        //获取27号红球出现的次数
        Integer redTwentySevenBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("27");
        //获取28号红球出现的次数
        Integer redTwentyEightBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("28");
        //获取29号红球出现的次数
        Integer redTwentyNineBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("29");
        //获取30号红球出现的次数
        Integer redThirtyBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("30");
        //获取31号红球出现的次数
        Integer redThirtyOneBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("31");
        //获取32号红球出现的次数
        Integer redThirtyTwoBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("32");
        //获取33号红球出现的次数
        Integer redThirtyThreeBallCount = basePeriodService.getLatestOneHundredNeedRedBallCountPeriod("33");

        OneHundredRedBallProbabilityDTO oneHundredRedBallProbabilityDTO = new OneHundredRedBallProbabilityDTO();
        oneHundredRedBallProbabilityDTO.setRedBallOne(new BigDecimal((double)redOneBallCount / 100).setScale(4,BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallTwo(new BigDecimal((double)redTwoBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallThree(new BigDecimal((double)redThreeBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallFour(new BigDecimal((double)redFourBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallFive(new BigDecimal((double)redFiveBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallSix(new BigDecimal((double)redSixBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallSeven(new BigDecimal((double)redSevenBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallEight(new BigDecimal((double)redEightBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallNine(new BigDecimal((double)redNineBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallTen(new BigDecimal((double)redTenBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallEleven(new BigDecimal((double)redElevenBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallTwelve(new BigDecimal((double)redTwelveBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallThirteen(new BigDecimal((double)redThirteenBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallFourteen(new BigDecimal((double)redFourteenBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallFifteen(new BigDecimal((double)redFifteenBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallSixteen(new BigDecimal((double)redSixteenBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallSeventeen(new BigDecimal((double)redSeventeenBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallEighteen(new BigDecimal((double)redEighteenBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallNineteen(new BigDecimal((double)redNineteenBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallTwenty(new BigDecimal((double)redTwentyBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallTwentyOne(new BigDecimal((double)redTwentyOneBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallTwentyTwo(new BigDecimal((double)redTwentyTwoBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallTwentyThree(new BigDecimal((double)redTwentyThreeBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallTwentyFour(new BigDecimal((double)redTwentyFourBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallTwentyFive(new BigDecimal((double)redTwentyFiveBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallTwentySix(new BigDecimal((double)redTwentySixBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallTwentySeven(new BigDecimal((double)redTwentySevenBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallTwentyEight(new BigDecimal((double)redTwentyEightBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallTwentyNine(new BigDecimal((double)redTwentyNineBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallThirty(new BigDecimal((double)redThirtyBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallThirtyOne(new BigDecimal((double)redThirtyOneBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallThirtyTwo(new BigDecimal((double)redThirtyTwoBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setRedBallThirtyThree(new BigDecimal((double)redThirtyThreeBallCount / 100).setScale(4, BigDecimal.ROUND_HALF_UP));
        oneHundredRedBallProbabilityDTO.setLastUpdateDate(new Date());
        //判断是否已经存在红球概率
        /*OneHundredRedBallProbabilityDTO ballProbabilityDTO = oneHundredRedBallProbabilityService.getRedBallProbability();
        if(ballProbabilityDTO == null){*/
        if(redProbabilityCount == 0){
            //新增红球概率
            oneHundredRedBallProbabilityService.addOneHundredRedBallProbability(oneHundredRedBallProbabilityDTO);
        }
        /*}else {
            //更新红球概率
            oneHundredRedBallProbabilityDTO.setBallProbabilityId(ballProbabilityDTO.getBallProbabilityId());
            oneHundredRedBallProbabilityService.updateOneHundredRedBallProbability(oneHundredRedBallProbabilityDTO);
        }*/
    }

    /**
     * 更新奇数偶数概率
     * @param totalPeriodCount
     */
    private void updateOddEvenProbability(int totalPeriodCount){
        //奇数数量
        Integer oddEvenData = basePeriodService.getOddEvenData();
        OddEvenProbabilityDTO oddEvenProbabilityDTO = new OddEvenProbabilityDTO();
        oddEvenProbabilityDTO.setOddProbability(new BigDecimal((double)oddEvenData/totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
        oddEvenProbabilityDTO.setEvenProbability(new BigDecimal(1).subtract(oddEvenProbabilityDTO.getOddProbability()));
        oddEvenProbabilityDTO.setLastUpdateDate(new Date());
        //判断是否已经存在数据
        /*OddEvenProbabilityDTO probabilityDTO = oddEvenProbabilityService.getOddEvenProbability();
        if(probabilityDTO == null){*/
        if(redProbabilityCount == 0){
            oddEvenProbabilityService.addOddEvenProbability(oddEvenProbabilityDTO);
        }
        /*}else {
            oddEvenProbabilityDTO.setOddEvenId(probabilityDTO.getOddEvenId());
            oddEvenProbabilityService.updateOddEvenProbability(oddEvenProbabilityDTO);
        }*/
    }

    /**
     * 更新区间概率
     * @param totalPeriodCount
     */
    private void updateSectionProbability(int totalPeriodCount){
        //获取1-11之间的红球出现次数
        Integer firstSection = basePeriodService.getBetweenOneAndElevenRedInt();
        //获取12-22之间的红球出现次数
        Integer secondSection = basePeriodService.getBetweenTwelveAndTwentyTwoRedInt();
        //获取23-33之间的红球出现次数
        Integer thirdSection = basePeriodService.getBetweenTwentyThreeAndThirtyThree();
        SectionProbabilityDTO sectionProbabilityDTO = new SectionProbabilityDTO();
        sectionProbabilityDTO.setFirstSectionProbability(new BigDecimal((double)firstSection/totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
        sectionProbabilityDTO.setSecondSectionProbability(new BigDecimal((double)secondSection/totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
        sectionProbabilityDTO.setThirdSectionProbability(new BigDecimal((double)thirdSection/totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
        sectionProbabilityDTO.setLastUpdateDate(new Date());
        if(redProbabilityCount == 0){
            sectionProbabilityService.addSectionProbability(sectionProbabilityDTO);
        }
    }

    private void updateDataLocationProbability(int totalPeriodCount){
        BasePeriodDTO basePeriodDTO = new BasePeriodDTO();
        //获取位置1出现的红球次数
        basePeriodDTO.setLocation(1);
        List<BasePeriodDTO> locationOneList = basePeriodService.getLocationAppearTime(basePeriodDTO);
        for(BasePeriodDTO periodDTO : locationOneList){
            DataLocationProbabilityDTO dataLocationProbabilityDTO = new DataLocationProbabilityDTO();
            dataLocationProbabilityDTO.setAppearData(periodDTO.getRedOneBall());
            //判断当前的红球号码是否存在
            dataLocationProbabilityDTO = dataLocationProbabilityService.getDataLocationProbability(dataLocationProbabilityDTO);
            //如果为空则新增
            if(dataLocationProbabilityDTO == null){
                dataLocationProbabilityDTO = new DataLocationProbabilityDTO();
                dataLocationProbabilityDTO.setAppearData(periodDTO.getRedOneBall());
                dataLocationProbabilityDTO.setLocationOneProbability(new BigDecimal((double) periodDTO.getRedBallCount() / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
                dataLocationProbabilityDTO.setLastUpdateData(new Date());
                dataLocationProbabilityService.addDataLocationProbability(dataLocationProbabilityDTO);
            }else {
                dataLocationProbabilityDTO.setAppearData(periodDTO.getRedOneBall());
                dataLocationProbabilityDTO.setLocationOneProbability(new BigDecimal((double) periodDTO.getRedBallCount() / totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
                dataLocationProbabilityDTO.setLastUpdateData(new Date());
                dataLocationProbabilityService.updateDataLocationProbability(dataLocationProbabilityDTO);
            }
        }

        //获取位置2出现的红球次数
        basePeriodDTO.setLocation(2);
        List<BasePeriodDTO> locationTwoList = basePeriodService.getLocationAppearTime(basePeriodDTO);
        for(BasePeriodDTO periodDTO : locationTwoList){
            DataLocationProbabilityDTO dataLocationProbabilityDTO = new DataLocationProbabilityDTO();
            dataLocationProbabilityDTO.setAppearData(periodDTO.getRedTwoBall());
            //判断当前的红球号码是否存在
            dataLocationProbabilityDTO = dataLocationProbabilityService.getDataLocationProbability(dataLocationProbabilityDTO);
            //如果为空则新增
            if(dataLocationProbabilityDTO == null){
                dataLocationProbabilityDTO = new DataLocationProbabilityDTO();
                dataLocationProbabilityDTO.setAppearData(periodDTO.getRedTwoBall());
                dataLocationProbabilityDTO.setLocationTwoProbability(new BigDecimal((double) periodDTO.getRedBallCount() / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
                dataLocationProbabilityDTO.setLastUpdateData(new Date());
                dataLocationProbabilityService.addDataLocationProbability(dataLocationProbabilityDTO);
            }else {
                dataLocationProbabilityDTO.setAppearData(periodDTO.getRedTwoBall());
                dataLocationProbabilityDTO.setLocationTwoProbability(new BigDecimal((double) periodDTO.getRedBallCount() / totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
                dataLocationProbabilityDTO.setLastUpdateData(new Date());
                dataLocationProbabilityService.updateDataLocationProbability(dataLocationProbabilityDTO);
            }
        }

        //获取位置3出现的红球次数
        basePeriodDTO.setLocation(3);
        List<BasePeriodDTO> locationThreeList = basePeriodService.getLocationAppearTime(basePeriodDTO);
        for(BasePeriodDTO periodDTO : locationThreeList){
            DataLocationProbabilityDTO dataLocationProbabilityDTO = new DataLocationProbabilityDTO();
            dataLocationProbabilityDTO.setAppearData(periodDTO.getRedThreeBall());
            //判断当前的红球号码是否存在
            dataLocationProbabilityDTO = dataLocationProbabilityService.getDataLocationProbability(dataLocationProbabilityDTO);
            //如果为空则新增
            if(dataLocationProbabilityDTO == null){
                dataLocationProbabilityDTO = new DataLocationProbabilityDTO();
                dataLocationProbabilityDTO.setAppearData(periodDTO.getRedThreeBall());
                dataLocationProbabilityDTO.setLocationThreeProbability(new BigDecimal((double) periodDTO.getRedBallCount() / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
                dataLocationProbabilityDTO.setLastUpdateData(new Date());
                dataLocationProbabilityService.addDataLocationProbability(dataLocationProbabilityDTO);
            }else {
                dataLocationProbabilityDTO.setAppearData(periodDTO.getRedThreeBall());
                dataLocationProbabilityDTO.setLocationThreeProbability(new BigDecimal((double) periodDTO.getRedBallCount() / totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
                dataLocationProbabilityDTO.setLastUpdateData(new Date());
                dataLocationProbabilityService.updateDataLocationProbability(dataLocationProbabilityDTO);
            }
        }

        //获取位置4出现的红球次数
        basePeriodDTO.setLocation(4);
        List<BasePeriodDTO> locationFourList = basePeriodService.getLocationAppearTime(basePeriodDTO);
        for(BasePeriodDTO periodDTO : locationFourList){
            DataLocationProbabilityDTO dataLocationProbabilityDTO = new DataLocationProbabilityDTO();
            dataLocationProbabilityDTO.setAppearData(periodDTO.getRedFourBall());
            //判断当前的红球号码是否存在
            dataLocationProbabilityDTO = dataLocationProbabilityService.getDataLocationProbability(dataLocationProbabilityDTO);
            //如果为空则新增
            if(dataLocationProbabilityDTO == null){
                dataLocationProbabilityDTO = new DataLocationProbabilityDTO();
                dataLocationProbabilityDTO.setAppearData(periodDTO.getRedFourBall());
                dataLocationProbabilityDTO.setLocationFourProbability(new BigDecimal((double) periodDTO.getRedBallCount() / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
                dataLocationProbabilityDTO.setLastUpdateData(new Date());
                dataLocationProbabilityService.addDataLocationProbability(dataLocationProbabilityDTO);
            }else {
                dataLocationProbabilityDTO.setAppearData(periodDTO.getRedFourBall());
                dataLocationProbabilityDTO.setLocationFourProbability(new BigDecimal((double) periodDTO.getRedBallCount() / totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
                dataLocationProbabilityDTO.setLastUpdateData(new Date());
                dataLocationProbabilityService.updateDataLocationProbability(dataLocationProbabilityDTO);
            }
        }

        //获取位置5出现的红球次数
        basePeriodDTO.setLocation(5);
        List<BasePeriodDTO> locationFiveList = basePeriodService.getLocationAppearTime(basePeriodDTO);
        for(BasePeriodDTO periodDTO : locationFiveList){
            DataLocationProbabilityDTO dataLocationProbabilityDTO = new DataLocationProbabilityDTO();
            dataLocationProbabilityDTO.setAppearData(periodDTO.getRedFiveBall());
            //判断当前的红球号码是否存在
            dataLocationProbabilityDTO = dataLocationProbabilityService.getDataLocationProbability(dataLocationProbabilityDTO);
            //如果为空则新增
            if(dataLocationProbabilityDTO == null){
                dataLocationProbabilityDTO = new DataLocationProbabilityDTO();
                dataLocationProbabilityDTO.setAppearData(periodDTO.getRedFiveBall());
                dataLocationProbabilityDTO.setLocationFiveProbability(new BigDecimal((double) periodDTO.getRedBallCount() / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
                dataLocationProbabilityDTO.setLastUpdateData(new Date());
                dataLocationProbabilityService.addDataLocationProbability(dataLocationProbabilityDTO);
            }else {
                dataLocationProbabilityDTO.setAppearData(periodDTO.getRedFiveBall());
                dataLocationProbabilityDTO.setLocationFiveProbability(new BigDecimal((double) periodDTO.getRedBallCount() / totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
                dataLocationProbabilityDTO.setLastUpdateData(new Date());
                dataLocationProbabilityService.updateDataLocationProbability(dataLocationProbabilityDTO);
            }
        }

        //获取位置6出现的红球次数
        basePeriodDTO.setLocation(6);
        List<BasePeriodDTO> locationSixList = basePeriodService.getLocationAppearTime(basePeriodDTO);
        for(BasePeriodDTO periodDTO : locationSixList){
            DataLocationProbabilityDTO dataLocationProbabilityDTO = new DataLocationProbabilityDTO();
            dataLocationProbabilityDTO.setAppearData(periodDTO.getRedSixBall());
            //判断当前的红球号码是否存在
            dataLocationProbabilityDTO = dataLocationProbabilityService.getDataLocationProbability(dataLocationProbabilityDTO);
            //如果为空则新增
            if(dataLocationProbabilityDTO == null){
                dataLocationProbabilityDTO = new DataLocationProbabilityDTO();
                dataLocationProbabilityDTO.setAppearData(periodDTO.getRedSixBall());
                dataLocationProbabilityDTO.setLocationSixProbability(new BigDecimal((double) periodDTO.getRedBallCount() / totalPeriodCount).setScale(4, BigDecimal.ROUND_HALF_UP));
                dataLocationProbabilityDTO.setLastUpdateData(new Date());
                dataLocationProbabilityService.addDataLocationProbability(dataLocationProbabilityDTO);
            }else {
                dataLocationProbabilityDTO.setAppearData(periodDTO.getRedSixBall());
                dataLocationProbabilityDTO.setLocationSixProbability(new BigDecimal((double) periodDTO.getRedBallCount() / totalPeriodCount).setScale(4,BigDecimal.ROUND_HALF_UP));
                dataLocationProbabilityDTO.setLastUpdateData(new Date());
                dataLocationProbabilityService.updateDataLocationProbability(dataLocationProbabilityDTO);
            }
        }
    }
}
