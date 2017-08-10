package com.fucai.service;

import com.fucai.dto.ThirtyBlueBallProbabilityDTO;
import com.fucai.model.ThirtyBlueBallProbability;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/14
 * @description
 */
public interface ThirtyBlueBallProbabilityService {

    /**
     * 获取最新30期的蓝球概率
     * @return
     */
    public List<ThirtyBlueBallProbabilityDTO> getThirtyBlueBallProbabilitys(ThirtyBlueBallProbabilityDTO thirtyBlueBallProbabilityDTO);

    /**
     * 新增最新30期的蓝球概率
     * @param thirtyBlueBallProbability
     */
    public void addThirtyBlueBallProbability(ThirtyBlueBallProbability thirtyBlueBallProbability);

    /**
     * 更新最新30期蓝球的概率
     * @param thirtyBlueBallProbability
     */
    public void updateThirtyBlueBallProbability(ThirtyBlueBallProbability thirtyBlueBallProbability);
}
