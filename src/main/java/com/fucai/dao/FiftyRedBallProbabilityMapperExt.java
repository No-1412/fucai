package com.fucai.dao;

import com.fucai.dto.FiftyRedBallProbabilityDTO;
import com.fucai.model.FiftyRedBallProbability;
import com.fucai.model.FiftyRedBallProbabilityExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FiftyRedBallProbabilityMapperExt extends FiftyRedBallProbabilityMapper{

    /**
     * 获取最新50期的红球概率
     * @return
     */
    public List<FiftyRedBallProbabilityDTO> getRedBallProbability(FiftyRedBallProbabilityDTO fiftyRedBallProbabilityDTO);

}