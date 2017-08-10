package com.fucai.service;

import com.fucai.dto.OneHundredBlueBallProbabilityDTO;
import com.fucai.model.OneHundredBlueBallProbability;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/14
 * @description
 */
public interface OneHundredBlueBallProbabilityService {

    /**
     * 获取最新100期的蓝球概率
     * @return
     */
    public List<OneHundredBlueBallProbabilityDTO> getOneHundredBlueBallProbabilitys(OneHundredBlueBallProbabilityDTO oneHundredBlueBallProbabilityDTO);

    /**
     * 新增最新100期的蓝球概率
     * @param oneHundredBlueBallProbability
     */
    public void addOneHundredBlueBallProbability(OneHundredBlueBallProbability oneHundredBlueBallProbability);

    /**
     * 更新最新100期的蓝球概率
     * @param oneHundredBlueBallProbability
     */
    public void updateOneHundredBlueBallProbability(OneHundredBlueBallProbability oneHundredBlueBallProbability);
}
