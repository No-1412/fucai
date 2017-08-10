package com.fucai.service;

import com.fucai.dto.RedBallProbabilityDTO;
import com.fucai.model.RedBallProbability;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/12
 * @description
 */
public interface RedBallProbabilityService {

    /**
     * 新增红球概率
     * @param redBallProbability
     */
    public void addRedBallProbability(RedBallProbability redBallProbability);

    /**
     * 更新红球概率
     * @param redBallProbability
     */
    public void updateRedBallProbability(RedBallProbability redBallProbability);

    /**
     * 获取红球概率
     * @return
     */
    public List<RedBallProbabilityDTO> getRedBallProbability(RedBallProbabilityDTO redBallProbabilityDTO);

    /**
     * 获取是否有相同的数据
     * @param redBallProbabilityDTO
     * @return
     */
    public Integer getCountRedBallProbability(RedBallProbabilityDTO redBallProbabilityDTO);

    /**
     * 获取各个红球的最大最小概率
     * @return
     */
    public RedBallProbabilityDTO getMaxMinRedProbability();
}
