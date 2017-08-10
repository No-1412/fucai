package com.fucai.dao;

import com.fucai.dto.OneHundredBlueBallProbabilityDTO;
import com.fucai.model.OneHundredBlueBallProbability;
import com.fucai.model.OneHundredBlueBallProbabilityExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OneHundredBlueBallProbabilityMapperExt extends OneHundredBlueBallProbabilityMapper{

    /**
     * 获取最新100期的蓝球概率
     * @return
     */
    public List<OneHundredBlueBallProbabilityDTO> getOneHundredBlueBallProbabilitys(OneHundredBlueBallProbabilityDTO oneHundredBlueBallProbabilityDTO);
}