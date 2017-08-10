package com.fucai.dao;

import com.fucai.dto.DataLocationProbabilityDTO;
import com.fucai.model.DataLocationProbability;
import com.fucai.model.DataLocationProbabilityExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DataLocationProbabilityMapperExt extends DataLocationProbabilityMapper{

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
}