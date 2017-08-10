package com.fucai.dao;

import com.fucai.dto.SectionProbabilityDTO;
import com.fucai.model.SectionProbability;
import com.fucai.model.SectionProbabilityExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SectionProbabilityMapperExt extends SectionProbabilityMapper{

    /**
     * 获取区间概率
     * @return
     */
    public List<SectionProbabilityDTO> getSectionProbability(SectionProbabilityDTO sectionProbabilityDTO);
}