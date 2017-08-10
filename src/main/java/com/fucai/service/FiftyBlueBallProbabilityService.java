package com.fucai.service;

import com.fucai.dto.FiftyBlueBallProbabilityDTO;
import com.fucai.model.FiftyBlueBallProbability;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/14
 * @description
 */
public interface FiftyBlueBallProbabilityService {

    /**
     * 获取最新50期蓝球概率
     * @return
     */
    public List<FiftyBlueBallProbabilityDTO> getFiftyBlueBallProbabilitys(FiftyBlueBallProbabilityDTO fiftyBlueBallProbabilityDTO);

    /**
     * 新增最新50期蓝球概率
     * @param fiftyBlueBallProbability
     */
    public void addFiftyBlueBallProbability(FiftyBlueBallProbability fiftyBlueBallProbability);

    /**
     * 更新最新50期蓝球概率
     * @param fiftyBlueBallProbability
     */
    public void updateFiftyBlueBallProbability(FiftyBlueBallProbability fiftyBlueBallProbability);
}
