package com.fucai.service.impl;

import com.fucai.dao.ThirtyRedBallProbabilityMapperExt;
import com.fucai.dto.ThirtyRedBallProbabilityDTO;
import com.fucai.model.ThirtyRedBallProbability;
import com.fucai.service.ThirtyRedBallProbabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/12
 * @description
 */
@Service
public class ThirtyRedBallProbabilityServiceImpl implements ThirtyRedBallProbabilityService {

    @Autowired
    private ThirtyRedBallProbabilityMapperExt thirtyRedBallProbabilityMapperExt;

    @Override
    public List<ThirtyRedBallProbabilityDTO> getRedBallProbability(ThirtyRedBallProbabilityDTO thirtyRedBallProbabilityDTO) {
        return thirtyRedBallProbabilityMapperExt.getRedBallProbability(thirtyRedBallProbabilityDTO);
    }

    @Override
    public void addThirtyRedBallProbability(ThirtyRedBallProbability thirtyRedBallProbability) {
        thirtyRedBallProbabilityMapperExt.insertSelective(thirtyRedBallProbability);
    }

    @Override
    public void updateThirtyRedBallProbability(ThirtyRedBallProbability thirtyRedBallProbability) {
        thirtyRedBallProbabilityMapperExt.updateByPrimaryKeySelective(thirtyRedBallProbability);
    }
}
