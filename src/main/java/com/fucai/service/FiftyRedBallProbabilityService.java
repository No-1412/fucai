package com.fucai.service;

import com.fucai.dto.FiftyRedBallProbabilityDTO;
import com.fucai.model.FiftyRedBallProbability;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/12
 * @description
 */
public interface FiftyRedBallProbabilityService {

    /**
     * 获取最新50期的红球概率
     * @return
     */
    public List<FiftyRedBallProbabilityDTO> getRedBallProbability(FiftyRedBallProbabilityDTO fiftyRedBallProbabilityDTO);

    /**
     * 新增最新50期的红球概率
     * @param fiftyRedBallProbability
     */
    public void addFiftyRedBallProbability(FiftyRedBallProbability fiftyRedBallProbability);

    /**
     * 更新最新50期的红球概率
     * @param fiftyRedBallProbability
     */
    public void updateFiftyRedBallProbability(FiftyRedBallProbability fiftyRedBallProbability);
}
