package com.fucai.dto;

import com.fucai.model.ThirtyBlueBallProbability;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ThirtyBlueBallProbabilityDTO extends ThirtyBlueBallProbability {
    //是否来自基础路径查询
    private Integer fromBase;
    //区间限制最小值
    private Integer minValue;
    //区间限制最大值
    private Integer maxValue;

    public Integer getFromBase() {
        return fromBase;
    }

    public void setFromBase(Integer fromBase) {
        this.fromBase = fromBase;
    }

    public Integer getMinValue() {
        return minValue;
    }

    public void setMinValue(Integer minValue) {
        this.minValue = minValue;
    }

    public Integer getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }
}