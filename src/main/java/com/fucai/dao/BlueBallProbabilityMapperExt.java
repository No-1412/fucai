package com.fucai.dao;

import com.fucai.dto.BlueBallProbabilityDTO;
import com.fucai.model.BlueBallProbability;
import com.fucai.model.BlueBallProbabilityExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BlueBallProbabilityMapperExt extends BlueBallProbabilityMapper{

    /**
     * 获取所有蓝球概率
     * @return
     */
    public List<BlueBallProbabilityDTO> getBlueBallProbabilitys(BlueBallProbabilityDTO blueBallProbabilityDTO);

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