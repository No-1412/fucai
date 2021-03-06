package com.fucai.dao;

import com.fucai.dto.BasePeriodDTO;
import com.fucai.model.BasePeriod;
import com.fucai.model.BasePeriodExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface BasePeriodMapperExt extends BasePeriodMapper{

    /**
     * 批量新增每期数据
     * @param basePeriodList
     */
    public void batchAddBasePeriod(List basePeriodList);

    /**
     * 获取所有的期号信息
     * @param basePeriodDTO
     * @return
     */
    public List<BasePeriodDTO> getAllBasePeriods(BasePeriodDTO basePeriodDTO);

    /**
     * 获取期号信息
     * @param basePeriodDTO
     * @return
     */
    public BasePeriodDTO getBasePeriod(BasePeriodDTO basePeriodDTO);

    /**
     * 所有的期数总数
     * @return
     */
    public Integer getCountPeriod();

    /**
     * 获取相应红球的出现次数
     * @param redBall
     * @return
     */
    public Integer getNeedRedBallCountPeriod(String redBall);

    /**
     * 清除数据
     */
    public void truncateBasePeriod();

    /**
     * 获取最新的5期
     * @return
     */
    public List<BasePeriodDTO> getLatestFiveBasePeriods();

    /**
     * 获取最新30期
     * @return
     */
    public List<BasePeriodDTO> getLatestThirtyBasePeriods();

    /**
     * 获取最新50期
     * @return
     */
    public List<BasePeriodDTO> getLatestFiftyBasePeriods();

    /**
     * 获取最新100期
     * @return
     */
    public List<BasePeriodDTO> getLatestOneHundredBasePeriods();

    /**
     * 获取最新5期的相应红球出现次数
     * @param redBall
     * @return
     */
    public Integer getLatestFiveNeedRedBallCountPeriod(String redBall);

    /**
     * 获取最新30期的相应红球出现次数
     * @param redBall
     * @return
     */
    public Integer getLatestThirtyNeedRedBallCountPeriod(String redBall);

    /**
     * 获取最新50期的相应红球出现次数
     * @param redBall
     * @return
     */
    public Integer getLatestFiftyNeedRedBallCountPeriod(String redBall);

    /**
     * 获取最新100期的相应红球出现次数
     * @param redBall
     * @return
     */
    public Integer getLatestOneHundredNeedRedBallCountPeriod(String redBall);

    /**
     * 获取奇数偶数集合
     * @return
     */
    public Integer getOddEvenData();

    /**
     * 更新奇数偶数
     */
    public void updateOddEvenData();

    /**
     * 获取1-11的红球出现次数
     * @return
     */
    public Integer getBetweenOneAndElevenRedInt();

    /**
     * 获取12-22红球出现次数
     * @return
     */
    public Integer getBetweenTwelveAndTwentyTwoRedInt();

    /**
     * 获取23-33红球出现次数
     * @return
     */
    public Integer getBetweenTwentyThreeAndThirtyThree();

    /**
     * 获取红球在相应位置出现的次数
     * @param basePeriodDTO
     * @return
     */
    public List<BasePeriodDTO> getLocationAppearTime(BasePeriodDTO basePeriodDTO);

    /**
     * 获取相应蓝球出现的次数
     * @param blueBall
     * @return
     */
    public Integer getNeedBlueBallCountPeriod(String blueBall);

    /**
     * 获取最新5期的相应蓝球出现次数
     * @param blueBall
     * @return
     */
    public Integer getLatestFiveNeedBlueBallCountPeriod(String blueBall);

    /**
     * 获取最新30期的相应蓝球出现次数
     * @param blueBall
     * @return
     */
    public Integer getLatestThirtyNeedBlueBallCountPeriod(String blueBall);

    /**
     * 获取最新50期的相应蓝球出现次数
     * @param blueBall
     * @return
     */
    public Integer getLatestFiftyNeedBlueBallCountPeriod(String blueBall);

    /**
     * 获取最新100期的相应蓝球出现次数
     * @param blueBall
     * @return
     */
    public Integer getLatestOneHundredNeedBlueBallCountPeriod(String blueBall);
}