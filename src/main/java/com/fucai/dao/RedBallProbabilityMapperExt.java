package com.fucai.dao;

import com.fucai.dto.RedBallProbabilityDTO;
import com.fucai.model.RedBallProbability;
import com.fucai.model.RedBallProbabilityExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RedBallProbabilityMapperExt extends RedBallProbabilityMapper{

    /**
     * 获取红球概率
     * @return
     */
    public List<RedBallProbabilityDTO> getRedBallProbability(RedBallProbabilityDTO redBallProbabilityDTO);

    /**
     * 获取是否有相同的数据
     * @param redBallProbabilityDTO
     * @return
     */
    public Integer getCountRedBallProbability(RedBallProbabilityDTO redBallProbabilityDTO);

    /**
     * 获取各个红球的最大最小概率
     * @return
     */
    public RedBallProbabilityDTO getMaxMinRedProbability();
}