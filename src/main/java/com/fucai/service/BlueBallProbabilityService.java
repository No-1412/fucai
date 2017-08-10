package com.fucai.service;

import com.fucai.dto.BlueBallProbabilityDTO;
import com.fucai.model.BlueBallProbability;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/14
 * @description
 */
public interface BlueBallProbabilityService {

    /**
     * 获取所有蓝球概率
     * @return
     */
    public List<BlueBallProbabilityDTO> getBlueBallProbabilitys(BlueBallProbabilityDTO blueBallProbabilityDTO);

    /**
     * 新增蓝球出现概率
     * @param blueBallProbability
     */
    public void addBlueBallProbability(BlueBallProbability blueBallProbability);

    /**
     * 更新蓝球出现概率
     * @param blueBallProbability
     */
    public void updateBlueBallProbability(BlueBallProbability blueBallProbability);

    /**
     * 获取是否已经存在数据
     * @return
     */
    public Integer getCountBlueBallProbability(BlueBallProbabilityDTO blueBallProbabilityDTO);

    /**
     * 获取最小最大的值
     * @return
     */
    public BlueBallProbabilityDTO getMinMaxBlueBallProbability();
}
