package com.fucai.service.impl;

import com.fucai.dao.FiftyRedBallProbabilityMapperExt;
import com.fucai.dto.FiftyRedBallProbabilityDTO;
import com.fucai.model.FiftyRedBallProbability;
import com.fucai.service.FiftyRedBallProbabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/12
 * @description
 */
@Service
public class FiftyRedBallProbabilityServiceImpl implements FiftyRedBallProbabilityService {

    @Autowired
    private FiftyRedBallProbabilityMapperExt fiftyRedBallProbabilityMapperExt;

    @Override
    public List<FiftyRedBallProbabilityDTO> getRedBallProbability(FiftyRedBallProbabilityDTO fiftyRedBallProbabilityDTO) {
        return fiftyRedBallProbabilityMapperExt.getRedBallProbability(fiftyRedBallProbabilityDTO);
    }

    @Override
    public void addFiftyRedBallProbability(FiftyRedBallProbability fiftyRedBallProbability) {
        fiftyRedBallProbabilityMapperExt.insertSelective(fiftyRedBallProbability);
    }

    @Override
    public void updateFiftyRedBallProbability(FiftyRedBallProbability fiftyRedBallProbability) {
        fiftyRedBallProbabilityMapperExt.updateByPrimaryKeySelective(fiftyRedBallProbability);
    }
}
