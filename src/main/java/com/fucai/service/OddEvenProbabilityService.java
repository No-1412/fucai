package com.fucai.service;

import com.fucai.dto.OddEvenProbabilityDTO;
import com.fucai.model.OddEvenProbability;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/13
 * @description
 */
public interface OddEvenProbabilityService {

    /**
     * 获取奇数偶数概率
     * @return
     */
    public OddEvenProbabilityDTO getOddEvenProbability();

    /**
     * 新增奇数偶数概率
     * @param oddEvenProbability
     */
    public void addOddEvenProbability(OddEvenProbability oddEvenProbability);

    /**
     * 更新奇数偶数概率
     * @param oddEvenProbability
     */
    public void updateOddEvenProbability(OddEvenProbability oddEvenProbability);
}
