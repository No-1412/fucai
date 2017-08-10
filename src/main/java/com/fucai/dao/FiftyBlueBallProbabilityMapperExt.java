package com.fucai.dao;

import com.fucai.dto.FiftyBlueBallProbabilityDTO;
import com.fucai.model.FiftyBlueBallProbability;
import com.fucai.model.FiftyBlueBallProbabilityExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FiftyBlueBallProbabilityMapperExt extends FiftyBlueBallProbabilityMapper{

    /**
     * 获取最新50期蓝球概率
     * @return
     */
    public List<FiftyBlueBallProbabilityDTO> getFiftyBlueBallProbabilitys(FiftyBlueBallProbabilityDTO fiftyBlueBallProbabilityDTO);
}