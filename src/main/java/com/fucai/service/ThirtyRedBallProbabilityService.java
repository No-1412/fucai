package com.fucai.service;

import com.fucai.dto.ThirtyRedBallProbabilityDTO;
import com.fucai.model.ThirtyRedBallProbability;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/12
 * @description
 */
public interface ThirtyRedBallProbabilityService {

    /**
     * 获取最新30期的概率
     * @return
     */
    public List<ThirtyRedBallProbabilityDTO> getRedBallProbability(ThirtyRedBallProbabilityDTO thirtyRedBallProbabilityDTO);

    /**
     * 新增最新30期的概率
     * @param thirtyRedBallProbability
     */
    public void addThirtyRedBallProbability(ThirtyRedBallProbability thirtyRedBallProbability);

    /**
     * 更新最新30期的概率
     * @param thirtyRedBallProbability
     */
    public void updateThirtyRedBallProbability(ThirtyRedBallProbability thirtyRedBallProbability);
}
