package com.fucai.service;

import com.fucai.dto.FiveBlueBallProbabilityDTO;
import com.fucai.model.FiveBlueBallProbability;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/14
 * @description
 */
public interface FiveBlueBallProbabilityService {
    /**
     * 获取最新5期的概率
     * @return
     */
    public List<FiveBlueBallProbabilityDTO> getFiveBlueBallProbabilitys(FiveBlueBallProbabilityDTO fiveBlueBallProbabilityDTO);

    /**
     * 新增最新5期的概率
     * @param fiveBlueBallProbability
     */
    public void addFiveBlueBallProbability(FiveBlueBallProbability fiveBlueBallProbability);

    /**
     * 更新最新5期的概率
     * @param fiveBlueBallProbability
     */
    public void updateFiveBlueBallProbability(FiveBlueBallProbability fiveBlueBallProbability);


}
