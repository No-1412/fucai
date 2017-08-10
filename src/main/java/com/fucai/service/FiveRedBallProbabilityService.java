package com.fucai.service;

import com.fucai.dto.FiveRedBallProbabilityDTO;
import com.fucai.model.FiveRedBallProbability;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/12
 * @description
 */
public interface FiveRedBallProbabilityService {

    /**
     * 获取最新5期的概率
     * @return
     */
    public List<FiveRedBallProbabilityDTO> getRedBallProbability(FiveRedBallProbabilityDTO fiveRedBallProbabilityDTO);

    /**
     * 新增最新5期的概率
     * @param fiveRedBallProbability
     */
    public void addFiveRedBallProbability(FiveRedBallProbability fiveRedBallProbability);

    /**
     * 更新最新5期的概率
     * @param fiveRedBallProbability
     */
    public void updateFiveRedBallProbability(FiveRedBallProbability fiveRedBallProbability);

    /**
     * 获取组合为字符串的最新5期数据
     * @return
     */
    public String getFiveRedBallListStr();
}
