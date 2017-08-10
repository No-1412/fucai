package com.fucai.service;

import com.fucai.dto.DataLocationProbabilityDTO;
import com.fucai.model.DataLocationProbability;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/13
 * @description
 */
public interface DataLocationProbabilityService {

    /**
     *获取所有位置概率
     * @return
     */
    public List<DataLocationProbabilityDTO> getDataLocationProbabilitys();

    /**
     * 获取位置概率
     * @param dataLocationProbabilityDTO
     * @return
     */
    public DataLocationProbabilityDTO getDataLocationProbability(DataLocationProbabilityDTO dataLocationProbabilityDTO);

    /**
     * 更新位置概率
     * @param dataLocationProbabilityDTO
     */
    public void updateDataLocationProbability(DataLocationProbabilityDTO dataLocationProbabilityDTO);

    /**
     * 新增位置概率
     * @param dataLocationProbability
     */
    public void addDataLocationProbability(DataLocationProbability dataLocationProbability);
}
