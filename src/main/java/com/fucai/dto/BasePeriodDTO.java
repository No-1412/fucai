package com.fucai.dto;

import com.fucai.model.BasePeriod;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/11
 * @description
 */
public class BasePeriodDTO extends BasePeriod {
    //红球位置
    private Integer location;
    //红球号码
    private Integer redBallCount;

    private Integer pageNum;
    private Integer pageSize;

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public Integer getRedBallCount() {
        return redBallCount;
    }

    public void setRedBallCount(Integer redBallCount) {
        this.redBallCount = redBallCount;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
