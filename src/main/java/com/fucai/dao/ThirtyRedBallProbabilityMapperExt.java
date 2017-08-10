package com.fucai.dao;

import com.fucai.dto.ThirtyRedBallProbabilityDTO;
import com.fucai.model.ThirtyRedBallProbability;
import com.fucai.model.ThirtyRedBallProbabilityExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ThirtyRedBallProbabilityMapperExt extends ThirtyRedBallProbabilityMapper{

    /**
     * 获取最新30期的概率
     * @return
     */
    public List<ThirtyRedBallProbabilityDTO> getRedBallProbability(ThirtyRedBallProbabilityDTO thirtyRedBallProbabilityDTO);
}