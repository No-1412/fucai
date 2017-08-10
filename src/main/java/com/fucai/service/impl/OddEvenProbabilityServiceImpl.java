package com.fucai.service.impl;

import com.fucai.dao.OddEvenProbabilityMapperExt;
import com.fucai.dto.OddEvenProbabilityDTO;
import com.fucai.model.OddEvenProbability;
import com.fucai.service.OddEvenProbabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/13
 * @description
 */
@Service
public class OddEvenProbabilityServiceImpl implements OddEvenProbabilityService {

    @Autowired
    private OddEvenProbabilityMapperExt oddEvenProbabilityMapperExt;

    @Override
    public OddEvenProbabilityDTO getOddEvenProbability() {
        return oddEvenProbabilityMapperExt.getOddEvenProbability();
    }

    @Override
    public void addOddEvenProbability(OddEvenProbability oddEvenProbability) {
        oddEvenProbabilityMapperExt.insertSelective(oddEvenProbability);
    }

    @Override
    public void updateOddEvenProbability(OddEvenProbability oddEvenProbability) {
        oddEvenProbabilityMapperExt.updateByPrimaryKeySelective(oddEvenProbability);
    }
}
