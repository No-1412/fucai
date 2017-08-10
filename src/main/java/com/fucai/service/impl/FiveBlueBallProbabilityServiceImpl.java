package com.fucai.service.impl;

import com.fucai.dao.FiveBlueBallProbabilityMapperExt;
import com.fucai.dto.FiveBlueBallProbabilityDTO;
import com.fucai.model.FiveBlueBallProbability;
import com.fucai.service.FiveBlueBallProbabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/14
 * @description
 */
@Service
public class FiveBlueBallProbabilityServiceImpl implements FiveBlueBallProbabilityService {

    @Autowired
    private FiveBlueBallProbabilityMapperExt fiveBlueBallProbabilityMapperExt;

    @Override
    public List<FiveBlueBallProbabilityDTO> getFiveBlueBallProbabilitys(FiveBlueBallProbabilityDTO fiveBlueBallProbabilityDTO) {
        return fiveBlueBallProbabilityMapperExt.getFiveBlueBallProbabilitys(fiveBlueBallProbabilityDTO);
    }

    @Override
    public void addFiveBlueBallProbability(FiveBlueBallProbability fiveBlueBallProbability) {
        fiveBlueBallProbabilityMapperExt.insertSelective(fiveBlueBallProbability);
    }

    @Override
    public void updateFiveBlueBallProbability(FiveBlueBallProbability fiveBlueBallProbability) {
        fiveBlueBallProbabilityMapperExt.updateByPrimaryKeySelective(fiveBlueBallProbability);
    }

}
