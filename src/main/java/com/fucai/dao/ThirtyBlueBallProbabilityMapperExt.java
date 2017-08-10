package com.fucai.dao;

import com.fucai.dto.ThirtyBlueBallProbabilityDTO;
import com.fucai.model.ThirtyBlueBallProbability;
import com.fucai.model.ThirtyBlueBallProbabilityExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ThirtyBlueBallProbabilityMapperExt extends ThirtyBlueBallProbabilityMapper{

    /**
     * 获取最新30期的蓝球概率
     * @return
     */
    public List<ThirtyBlueBallProbabilityDTO> getThirtyBlueBallProbabilitys(ThirtyBlueBallProbabilityDTO thirtyBlueBallProbabilityDTO);
}