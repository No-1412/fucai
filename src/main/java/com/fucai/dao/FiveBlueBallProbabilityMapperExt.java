package com.fucai.dao;

import com.fucai.dto.FiveBlueBallProbabilityDTO;
import com.fucai.model.FiveBlueBallProbability;
import com.fucai.model.FiveBlueBallProbabilityExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FiveBlueBallProbabilityMapperExt extends FiveBlueBallProbabilityMapper{

    /**
     * 获取最新5期的概率
     * @return
     */
    public List<FiveBlueBallProbabilityDTO> getFiveBlueBallProbabilitys(FiveBlueBallProbabilityDTO fiveBlueBallProbabilityDTO);


}