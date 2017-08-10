package com.fucai.service.impl;

import com.fucai.dao.SectionProbabilityMapperExt;
import com.fucai.dto.SectionProbabilityDTO;
import com.fucai.model.SectionProbability;
import com.fucai.service.SectionProbabilityService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/13
 * @description
 */
@Service
public class SectionProbabilityServiceImpl implements SectionProbabilityService {

    @Autowired
    private SectionProbabilityMapperExt sectionProbabilityMapperExt;

    @Value("${sectionProbability_pageSize}")
    private Integer pageSize;

    @Override
    public List<SectionProbabilityDTO> getSectionProbability(SectionProbabilityDTO sectionProbabilityDTO) {
        return sectionProbabilityMapperExt.getSectionProbability(sectionProbabilityDTO);
    }

    @Override
    public void addSectionProbability(SectionProbability sectionProbability) {
        sectionProbabilityMapperExt.insertSelective(sectionProbability);
    }

    @Override
    public void updateSectionProbability(SectionProbability sectionProbability) {
        sectionProbabilityMapperExt.updateByPrimaryKeySelective(sectionProbability);
    }

    @Override
    public String getSectionProbabilityStr() {
        String sectionProbabilityStr = "";
        StringBuffer firstSectionBuffer = new StringBuffer();
        StringBuffer secondSectionBuffer = new StringBuffer();
        StringBuffer thirdSectionBuffer = new StringBuffer();
        List<SectionProbabilityDTO> sectionProbabilityDTOList = getSectionProbability(null);
        for (SectionProbabilityDTO sectionProbabilityDTO : sectionProbabilityDTOList){
            if(firstSectionBuffer.length() > 0){
                firstSectionBuffer.append(",");
            }
            firstSectionBuffer.append("{");
            firstSectionBuffer.append("x:");
            firstSectionBuffer.append(sectionProbabilityDTO.getFirstSectionProbability());
            firstSectionBuffer.append(",");
            firstSectionBuffer.append("y:");
            firstSectionBuffer.append(sectionProbabilityDTO.getFirstSectionProbability());
            firstSectionBuffer.append("}");
            if(secondSectionBuffer.length() > 0){
                secondSectionBuffer.append(",");
            }
            secondSectionBuffer.append("{");
            secondSectionBuffer.append("x:");
            secondSectionBuffer.append(sectionProbabilityDTO.getSecondSectionProbability());
            secondSectionBuffer.append(",");
            secondSectionBuffer.append("y:");
            secondSectionBuffer.append(sectionProbabilityDTO.getSecondSectionProbability());
            secondSectionBuffer.append("}");
            if(thirdSectionBuffer.length() > 0){
                thirdSectionBuffer.append(",");
            }
            thirdSectionBuffer.append("{");
            thirdSectionBuffer.append("x:");
            thirdSectionBuffer.append(sectionProbabilityDTO.getThirdSectionProbability());
            thirdSectionBuffer.append(",");
            thirdSectionBuffer.append("y:");
            thirdSectionBuffer.append(sectionProbabilityDTO.getThirdSectionProbability());
            thirdSectionBuffer.append("}");
        }
        sectionProbabilityStr = "[[" + firstSectionBuffer.toString() + "],[" + secondSectionBuffer.toString() + "],[" +thirdSectionBuffer.toString() + "]]";
        return sectionProbabilityStr;
    }

    @Override
    public List<SectionProbabilityDTO> getPageSectionProbability(SectionProbabilityDTO sectionProbabilityDTO, Integer pageNum) {
        if(pageNum == null || pageNum == 0){
            pageNum = 1;
        }
        PageHelper.startPage(pageNum,pageSize);
        List<SectionProbabilityDTO> sectionProbabilityDTOList = sectionProbabilityMapperExt.getSectionProbability(sectionProbabilityDTO);
        return sectionProbabilityDTOList;
    }
}
