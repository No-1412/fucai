package com.fucai.dao;

import com.fucai.dto.OneHundredRedBallProbabilityDTO;
import com.fucai.model.OneHundredRedBallProbability;
import com.fucai.model.OneHundredRedBallProbabilityExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OneHundredRedBallProbabilityMapperExt extends OneHundredRedBallProbabilityMapper{

    /**
     * 获取最新100期的红球概率
     * @return
     */
    public List<OneHundredRedBallProbabilityDTO> getRedBallProbability(OneHundredRedBallProbabilityDTO oneHundredRedBallProbabilityDTO);
}