package com.fucai.service.impl;

import com.fucai.dao.RedBallProbabilityMapperExt;
import com.fucai.dto.RedBallProbabilityDTO;
import com.fucai.model.RedBallProbability;
import com.fucai.service.RedBallProbabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/12
 * @description
 */
@Service
public class RedBallProbabilityServiceImpl implements RedBallProbabilityService {

    @Autowired
    private RedBallProbabilityMapperExt redBallProbabilityMapperExt;

    @Override
    public void addRedBallProbability(RedBallProbability redBallProbability) {
        redBallProbabilityMapperExt.insertSelective(redBallProbability);
    }

    @Override
    public void updateRedBallProbability(RedBallProbability redBallProbability) {
        redBallProbabilityMapperExt.updateByPrimaryKeySelective(redBallProbability);
    }

    @Override
    public List<RedBallProbabilityDTO> getRedBallProbability(RedBallProbabilityDTO redBallProbabilityDTO) {
        return redBallProbabilityMapperExt.getRedBallProbability(redBallProbabilityDTO);
    }

    @Override
    public Integer getCountRedBallProbability(RedBallProbabilityDTO redBallProbabilityDTO) {
        return redBallProbabilityMapperExt.getCountRedBallProbability(redBallProbabilityDTO);
    }

    @Override
    public RedBallProbabilityDTO getMaxMinRedProbability() {
        return redBallProbabilityMapperExt.getMaxMinRedProbability();
    }
}
