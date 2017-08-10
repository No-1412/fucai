package com.fucai.service.impl;

import com.fucai.dao.BasePeriodMapperExt;
import com.fucai.dto.BasePeriodDTO;
import com.fucai.model.BasePeriod;
import com.fucai.service.BasePeriodService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/11
 * @description
 */
@Service
public class BasePeriodServiceImpl implements BasePeriodService {

    @Autowired
    private BasePeriodMapperExt basePeriodMapperExt;
    @Value("${pageSize}")
    private Integer pageSize;


    @Override
    public void batchAddBasePeriod(List basePeriodList) {
        basePeriodMapperExt.batchAddBasePeriod(basePeriodList);
    }

    @Override
    public void addBasePeriod(BasePeriodDTO basePeriodDTO) {
        basePeriodMapperExt.insertSelective(basePeriodDTO);
    }

    @Override
    public List<BasePeriodDTO> getAllBasePeriods(BasePeriodDTO basePeriodDTO) {
        return basePeriodMapperExt.getAllBasePeriods(basePeriodDTO);
    }

    @Override
    public Integer getCountPeriod() {
        return basePeriodMapperExt.getCountPeriod();
    }

    @Override
    public Integer getNeedRedBallCountPeriod(String redBall) {
        return basePeriodMapperExt.getNeedRedBallCountPeriod(redBall);
    }

    @Override
    public void truncateBasePeriod() {
        basePeriodMapperExt.truncateBasePeriod();
    }

    @Override
    public List<BasePeriodDTO> getLatestFiveBasePeriods() {
        return basePeriodMapperExt.getLatestFiveBasePeriods();
    }

    @Override
    public List<BasePeriodDTO> getLatestThirtyBasePeriods() {
        return basePeriodMapperExt.getLatestThirtyBasePeriods();
    }

    @Override
    public List<BasePeriodDTO> getLatestFiftyBasePeriods() {
        return basePeriodMapperExt.getLatestFiftyBasePeriods();
    }

    @Override
    public List<BasePeriodDTO> getLatestOneHundredBasePeriods() {
        return basePeriodMapperExt.getLatestOneHundredBasePeriods();
    }

    @Override
    public Integer getLatestFiveNeedRedBallCountPeriod(String redBall) {
        return basePeriodMapperExt.getLatestFiveNeedRedBallCountPeriod(redBall);
    }

    @Override
    public Integer getLatestThirtyNeedRedBallCountPeriod(String redBall) {
        return basePeriodMapperExt.getLatestThirtyNeedRedBallCountPeriod(redBall);
    }

    @Override
    public Integer getLatestFiftyNeedRedBallCountPeriod(String redBall) {
        return basePeriodMapperExt.getLatestFiftyNeedRedBallCountPeriod(redBall);
    }

    @Override
    public Integer getLatestOneHundredNeedRedBallCountPeriod(String redBall) {
        return basePeriodMapperExt.getLatestOneHundredNeedRedBallCountPeriod(redBall);
    }

    @Override
    public Integer getOddEvenData() {
        return basePeriodMapperExt.getOddEvenData();
    }

    @Override
    public void updateOddEvenData() {
        basePeriodMapperExt.updateOddEvenData();
    }

    @Override
    public Integer getBetweenOneAndElevenRedInt() {
        return basePeriodMapperExt.getBetweenOneAndElevenRedInt();
    }

    @Override
    public Integer getBetweenTwelveAndTwentyTwoRedInt() {
        return basePeriodMapperExt.getBetweenTwelveAndTwentyTwoRedInt();
    }

    @Override
    public Integer getBetweenTwentyThreeAndThirtyThree() {
        return basePeriodMapperExt.getBetweenTwentyThreeAndThirtyThree();
    }

    @Override
    public List<BasePeriodDTO> getLocationAppearTime(BasePeriodDTO basePeriodDTO) {
        return basePeriodMapperExt.getLocationAppearTime(basePeriodDTO);
    }

    @Override
    public Integer getNeedBlueBallCountPeriod(String blueBall) {
        return basePeriodMapperExt.getNeedBlueBallCountPeriod(blueBall);
    }

    @Override
    public Integer getLatestFiveNeedBlueBallCountPeriod(String blueBall) {
        return basePeriodMapperExt.getLatestFiveNeedBlueBallCountPeriod(blueBall);
    }

    @Override
    public Integer getLatestThirtyNeedBlueBallCountPeriod(String blueBall) {
        return basePeriodMapperExt.getLatestThirtyNeedBlueBallCountPeriod(blueBall);
    }

    @Override
    public Integer getLatestFiftyNeedBlueBallCountPeriod(String blueBall) {
        return basePeriodMapperExt.getLatestFiftyNeedBlueBallCountPeriod(blueBall);
    }

    @Override
    public Integer getLatestOneHundredNeedBlueBallCountPeriod(String blueBall) {
        return basePeriodMapperExt.getLatestOneHundredNeedBlueBallCountPeriod(blueBall);
    }

    @Override
    public List<BasePeriodDTO> getPageBasePeriodDTO(BasePeriodDTO basePeriodDTO, Integer pageNum) {
        if(pageNum == null || pageNum == 0){
            pageNum = 1;
        }
        PageHelper.startPage(pageNum,pageSize);
        List<BasePeriodDTO> basePeriodDTOList = basePeriodMapperExt.getAllBasePeriods(basePeriodDTO);
        return basePeriodDTOList;
    }


    @Override
    public void process(ResultItems resultItems, Task task) {
        List<BasePeriodDTO> basePeriodDTOList = (List<BasePeriodDTO>)resultItems.getAll().get("basePeriodDTOList");
        //判断第一个期号是否已经在数据库中
        BasePeriodDTO periodDTO = new BasePeriodDTO();
        periodDTO.setPeriodNumber(basePeriodDTOList.get(0).getPeriodNumber());
        periodDTO = basePeriodMapperExt.getBasePeriod(periodDTO);
        //如果已经存在第一个期号则不做操作
        if(periodDTO != null){
            return;
        }
        List<BasePeriodDTO> existBasePeriodDTOList = getAllBasePeriods(null);
        if(existBasePeriodDTOList != null && existBasePeriodDTOList.size() > 0){
            //因为不是放在服务器上执行的，有时候可能是几期才执行一次程序
            List<BasePeriodDTO> basePeriodDTOs = new ArrayList<BasePeriodDTO>();
            for(int i = 0;i < basePeriodDTOList.size();i++){
                BasePeriodDTO basePeriodDTO = basePeriodDTOList.get(i);
                //判断当前的第一个期号是否大于已经存在的期号
                if(basePeriodDTO.getPeriodNumber().compareTo(existBasePeriodDTOList.get(0).getPeriodNumber()) > 0){
                    basePeriodDTOs.add(basePeriodDTO);
                }
            }
            //批量新增
            if(basePeriodDTOs != null && basePeriodDTOs.size() > 0) {
                batchAddBasePeriod(basePeriodDTOs);
            }
            //如果当前的获取数据第一个期号小于已经存在的期号
            if(basePeriodDTOList.get(0).getPeriodNumber().compareTo(existBasePeriodDTOList.get(0).getPeriodNumber()) < 0){
                batchAddBasePeriod(basePeriodDTOList);
            }
        }else {
            batchAddBasePeriod(basePeriodDTOList);
        }
    }
}
