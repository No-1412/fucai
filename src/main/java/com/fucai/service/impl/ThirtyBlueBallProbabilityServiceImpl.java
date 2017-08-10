package com.fucai.service.impl;

import com.fucai.dao.ThirtyBlueBallProbabilityMapperExt;
import com.fucai.dto.ThirtyBlueBallProbabilityDTO;
import com.fucai.model.ThirtyBlueBallProbability;
import com.fucai.service.ThirtyBlueBallProbabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/14
 * @description
 */
@Service
public class ThirtyBlueBallProbabilityServiceImpl implements ThirtyBlueBallProbabilityService {

    @Autowired
    private ThirtyBlueBallProbabilityMapperExt thirtyBlueBallProbabilityMapperExt;

    @Override
    public List<ThirtyBlueBallProbabilityDTO> getThirtyBlueBallProbabilitys(ThirtyBlueBallProbabilityDTO thirtyBlueBallProbabilityDTO) {
        return thirtyBlueBallProbabilityMapperExt.getThirtyBlueBallProbabilitys(thirtyBlueBallProbabilityDTO);
    }

    @Override
    public void addThirtyBlueBallProbability(ThirtyBlueBallProbability thirtyBlueBallProbability) {
        thirtyBlueBallProbabilityMapperExt.insertSelective(thirtyBlueBallProbability);
    }

    @Override
    public void updateThirtyBlueBallProbability(ThirtyBlueBallProbability thirtyBlueBallProbability) {
        thirtyBlueBallProbabilityMapperExt.updateByPrimaryKeySelective(thirtyBlueBallProbability);
    }
}
