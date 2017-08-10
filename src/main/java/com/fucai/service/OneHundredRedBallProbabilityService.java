package com.fucai.service;

import com.fucai.dto.OneHundredRedBallProbabilityDTO;
import com.fucai.model.OneHundredRedBallProbability;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/12
 * @description
 */
public interface OneHundredRedBallProbabilityService {

    /**
     * 获取最新100期的红球概率
     * @return
     */
    public List<OneHundredRedBallProbabilityDTO> getRedBallProbability(OneHundredRedBallProbabilityDTO oneHundredRedBallProbabilityDTO);

    /**
     * 新增最新100期的红球概率
     * @param oneHundredRedBallProbability
     */
    public void addOneHundredRedBallProbability(OneHundredRedBallProbability oneHundredRedBallProbability);

    /**
     * 更新最新100期的红球概率
     * @param oneHundredRedBallProbability
     */
    public void updateOneHundredRedBallProbability(OneHundredRedBallProbability oneHundredRedBallProbability);
}
