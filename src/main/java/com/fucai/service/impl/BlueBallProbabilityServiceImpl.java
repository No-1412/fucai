package com.fucai.service.impl;

import com.fucai.dao.BlueBallProbabilityMapperExt;
import com.fucai.dto.BlueBallProbabilityDTO;
import com.fucai.model.BlueBallProbability;
import com.fucai.service.BlueBallProbabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/14
 * @description
 */
@Service
public class BlueBallProbabilityServiceImpl implements BlueBallProbabilityService {

    @Autowired
    private BlueBallProbabilityMapperExt blueBallProbabilityMapperExt;

    @Override
    public List<BlueBallProbabilityDTO> getBlueBallProbabilitys(BlueBallProbabilityDTO blueBallProbabilityDTO) {
        return blueBallProbabilityMapperExt.getBlueBallProbabilitys(blueBallProbabilityDTO);
    }

    @Override
    public void addBlueBallProbability(BlueBallProbability blueBallProbability) {
        blueBallProbabilityMapperExt.insertSelective(blueBallProbability);
    }

    @Override
    public void updateBlueBallProbability(BlueBallProbability blueBallProbability) {
        blueBallProbabilityMapperExt.updateByPrimaryKeySelective(blueBallProbability);
    }

    @Override
    public Integer getCountBlueBallProbability(BlueBallProbabilityDTO blueBallProbabilityDTO) {
        return blueBallProbabilityMapperExt.getCountBlueBallProbability(blueBallProbabilityDTO);
    }

    @Override
    public BlueBallProbabilityDTO getMinMaxBlueBallProbability() {
        return blueBallProbabilityMapperExt.getMinMaxBlueBallProbability();
    }
}
