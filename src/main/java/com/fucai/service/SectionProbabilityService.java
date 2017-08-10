package com.fucai.service;

import com.fucai.dto.SectionProbabilityDTO;
import com.fucai.model.SectionProbability;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/13
 * @description
 */
public interface SectionProbabilityService {

    /**
     * 获取区间概率
     * @return
     */
    public List<SectionProbabilityDTO> getSectionProbability(SectionProbabilityDTO sectionProbabilityDTO);

    /**
     * 新增区间概率
     * @param sectionProbability
     */
    public void addSectionProbability(SectionProbability sectionProbability);

    /**
     * 更新区间概率
     * @param sectionProbability
     */
    public void updateSectionProbability(SectionProbability sectionProbability);

    /**
     * 获取区间组装字符串
     * @return
     */
    public String getSectionProbabilityStr();

    public List<SectionProbabilityDTO> getPageSectionProbability(SectionProbabilityDTO sectionProbabilityDTO,Integer pageNum);
}
