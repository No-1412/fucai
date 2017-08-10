package com.fucai.service.impl;

import com.fucai.dao.FiftyBlueBallProbabilityMapperExt;
import com.fucai.dto.FiftyBlueBallProbabilityDTO;
import com.fucai.model.FiftyBlueBallProbability;
import com.fucai.service.FiftyBlueBallProbabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/14
 * @description
 */
@Service
public class FiftyBlueBallProbabilityServiceImpl implements FiftyBlueBallProbabilityService {

    @Autowired
    private FiftyBlueBallProbabilityMapperExt fiftyBlueBallProbabilityMapperExt;

    @Override
    public List<FiftyBlueBallProbabilityDTO> getFiftyBlueBallProbabilitys(FiftyBlueBallProbabilityDTO fiftyBlueBallProbabilityDTO) {
        return fiftyBlueBallProbabilityMapperExt.getFiftyBlueBallProbabilitys(fiftyBlueBallProbabilityDTO);
    }

    @Override
    public void addFiftyBlueBallProbability(FiftyBlueBallProbability fiftyBlueBallProbability) {
        fiftyBlueBallProbabilityMapperExt.insertSelective(fiftyBlueBallProbability);
    }

    @Override
    public void updateFiftyBlueBallProbability(FiftyBlueBallProbability fiftyBlueBallProbability) {
        fiftyBlueBallProbabilityMapperExt.updateByPrimaryKeySelective(fiftyBlueBallProbability);
    }
}
