package com.fucai.dao;

import com.fucai.dto.FiveRedBallProbabilityDTO;
import com.fucai.model.FiveRedBallProbability;
import com.fucai.model.FiveRedBallProbabilityExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FiveRedBallProbabilityMapperExt extends FiveRedBallProbabilityMapper{

    /**
     * 获取最新5期的概率
     * @return
     */
    public List<FiveRedBallProbabilityDTO> getRedBallProbability(FiveRedBallProbabilityDTO fiveRedBallProbabilityDTO);


}