package com.fucai.service.impl;

import com.fucai.dao.OneHundredRedBallProbabilityMapperExt;
import com.fucai.dto.OneHundredRedBallProbabilityDTO;
import com.fucai.model.OneHundredRedBallProbability;
import com.fucai.service.OneHundredRedBallProbabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/12
 * @description
 */
@Service
public class OneHundredRedBallProbabilityServiceImpl implements OneHundredRedBallProbabilityService {

    @Autowired
    private OneHundredRedBallProbabilityMapperExt oneHundredRedBallProbabilityMapperExt;

    @Override
    public List<OneHundredRedBallProbabilityDTO> getRedBallProbability(OneHundredRedBallProbabilityDTO oneHundredRedBallProbabilityDTO) {
        return oneHundredRedBallProbabilityMapperExt.getRedBallProbability(oneHundredRedBallProbabilityDTO);
    }

    @Override
    public void addOneHundredRedBallProbability(OneHundredRedBallProbability oneHundredRedBallProbability) {
        oneHundredRedBallProbabilityMapperExt.insertSelective(oneHundredRedBallProbability);
    }

    @Override
    public void updateOneHundredRedBallProbability(OneHundredRedBallProbability oneHundredRedBallProbability) {
        oneHundredRedBallProbabilityMapperExt.updateByPrimaryKeySelective(oneHundredRedBallProbability);
    }
}
