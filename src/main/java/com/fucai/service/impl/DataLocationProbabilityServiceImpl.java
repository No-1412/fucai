package com.fucai.service.impl;

import com.fucai.dao.DataLocationProbabilityMapperExt;
import com.fucai.dto.DataLocationProbabilityDTO;
import com.fucai.model.DataLocationProbability;
import com.fucai.service.DataLocationProbabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/13
 * @description
 */
@Service
public class DataLocationProbabilityServiceImpl implements DataLocationProbabilityService {

    @Autowired
    private DataLocationProbabilityMapperExt dataLocationProbabilityMapperExt;

    @Override
    public List<DataLocationProbabilityDTO> getDataLocationProbabilitys() {
        return dataLocationProbabilityMapperExt.getDataLocationProbabilitys();
    }

    @Override
    public DataLocationProbabilityDTO getDataLocationProbability(DataLocationProbabilityDTO dataLocationProbabilityDTO) {
        return dataLocationProbabilityMapperExt.getDataLocationProbability(dataLocationProbabilityDTO);
    }

    @Override
    public void updateDataLocationProbability(DataLocationProbabilityDTO dataLocationProbabilityDTO) {
        dataLocationProbabilityMapperExt.updateDataLocationProbability(dataLocationProbabilityDTO);
    }

    @Override
    public void addDataLocationProbability(DataLocationProbability dataLocationProbability) {
        dataLocationProbabilityMapperExt.insertSelective(dataLocationProbability);
    }
}
