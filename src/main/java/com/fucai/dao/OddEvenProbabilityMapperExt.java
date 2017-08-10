package com.fucai.dao;

import com.fucai.dto.OddEvenProbabilityDTO;
import com.fucai.model.OddEvenProbability;
import com.fucai.model.OddEvenProbabilityExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OddEvenProbabilityMapperExt extends OddEvenProbabilityMapper{

    /**
     * 获取奇数偶数概率
     * @return
     */
    public OddEvenProbabilityDTO getOddEvenProbability();

}