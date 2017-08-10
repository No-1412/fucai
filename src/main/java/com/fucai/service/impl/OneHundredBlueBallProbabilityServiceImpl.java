package com.fucai.service.impl;

import com.fucai.dao.OneHundredBlueBallProbabilityMapperExt;
import com.fucai.dto.OneHundredBlueBallProbabilityDTO;
import com.fucai.model.OneHundredBlueBallProbability;
import com.fucai.service.OneHundredBlueBallProbabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/14
 * @description
 */
@Service
public class OneHundredBlueBallProbabilityServiceImpl implements OneHundredBlueBallProbabilityService {

    @Autowired
    private OneHundredBlueBallProbabilityMapperExt oneHundredBlueBallProbabilityMapperExt;

    @Override
    public List<OneHundredBlueBallProbabilityDTO> getOneHundredBlueBallProbabilitys(OneHundredBlueBallProbabilityDTO oneHundredBlueBallProbabilityDTO) {
        return oneHundredBlueBallProbabilityMapperExt.getOneHundredBlueBallProbabilitys(oneHundredBlueBallProbabilityDTO);
    }

    @Override
    public void addOneHundredBlueBallProbability(OneHundredBlueBallProbability oneHundredBlueBallProbability) {
        oneHundredBlueBallProbabilityMapperExt.insertSelective(oneHundredBlueBallProbability);
    }

    @Override
    public void updateOneHundredBlueBallProbability(OneHundredBlueBallProbability oneHundredBlueBallProbability) {
        oneHundredBlueBallProbabilityMapperExt.updateByPrimaryKeySelective(oneHundredBlueBallProbability);
    }
}
