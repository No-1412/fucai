package com.fucai.dto;

import com.fucai.model.RedBallProbability;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RedBallProbabilityDTO extends RedBallProbability {

    private static final long serialVersionUID = 1L;

    //是否来自基础路径查询
    private Integer fromBase;
    //区间限制最小值
    private Integer minValue;
    //区间限制最大值
    private Integer maxValue;
    //最大的红球1概率
    private BigDecimal maxRedBallOne;
    //最小的红球1概率
    private BigDecimal minRedBallOne;
    //最大的红球2概率
    private BigDecimal maxRedBallTwo;
    //最小的红球2概率
    private BigDecimal minRedBallTwo;
    //最大的红球3概率
    private BigDecimal maxRedBallThree;
    //最小的红球3概率
    private BigDecimal minRedBallThree;
    //最大的红球4概率
    private BigDecimal maxRedBallFour;
    //最小的红球4概率
    private BigDecimal minRedBallFour;
    //最大的红球5概率
    private BigDecimal maxRedBallFive;
    //最小的红球5概率
    private BigDecimal minRedBallFive;
    //最大的红球6概率
    private BigDecimal maxRedBallSix;
    //最小的红球6概率
    private BigDecimal minRedBallSix;
    //最大的红球7概率
    private BigDecimal maxRedBallSeven;
    //最小的红球7概率
    private BigDecimal minRedBallSeven;
    //最大的红球8概率
    private BigDecimal maxRedBallEight;
    //最小的红球8概率
    private BigDecimal minRedBallEight;
    //最大的红球9概率
    private BigDecimal maxRedBallNine;
    //最小的红球9概率
    private BigDecimal minRedBallNine;
    //最大的红球10概率
    private BigDecimal maxRedBallTen;
    //最小的红球10概率
    private BigDecimal minRedBallTen;
    //最大的红球11概率
    private BigDecimal maxRedBallEleven;
    //最小的红球11概率
    private BigDecimal minRedBallEleven;
    //最大的红球12概率
    private BigDecimal maxRedBallTwelve;
    //最小的红球12概率
    private BigDecimal minRedBallTwelve;
    //最大的红球13概率
    private BigDecimal maxRedBallThirteen;
    //最小的红球13概率
    private BigDecimal minRedBallThirteen;
    //最大的红球14概率
    private BigDecimal maxRedBallFourteen;
    //最小的红球14概率
    private BigDecimal minRedBallFourteen;
    //最大的红球15概率
    private BigDecimal maxRedBallFifteen;
    //最小的红球15概率
    private BigDecimal minRedBallFifteen;
    //最大的红球16概率
    private BigDecimal maxRedBallSixteen;
    //最小的红球16概率
    private BigDecimal minRedBallSixteen;
    //最大的红球17概率
    private BigDecimal maxRedBallSeventeen;
    //最小的红球17概率
    private BigDecimal minRedBallSeventeen;
    //最大的红球18概率
    private BigDecimal maxRedBallEighteen;
    //最小的红球18概率
    private BigDecimal minRedBallEighteen;
    //最大的红球19概率
    private BigDecimal maxRedBallNineteen;
    //最小的红球19概率
    private BigDecimal minRedBallNineteen;
    //最大的红球20概率
    private BigDecimal maxRedBallTwenty;
    //最小的红球20概率
    private BigDecimal minRedBallTwenty;
    //最大的红球21概率
    private BigDecimal maxRedBallTwentyOne;
    //最小的红球21概率
    private BigDecimal minRedBallTwentyOne;
    //最大的红球22概率
    private BigDecimal maxRedBallTwentyTwo;
    //最小的红球22概率
    private BigDecimal minRedBallTwentyTwo;
    //最大的红球23概率
    private BigDecimal maxRedBallTwentyThree;
    //最小的红球23概率
    private BigDecimal minRedBallTwentyThree;
    //最大的红球24概率
    private BigDecimal maxRedBallTwentyFour;
    //最小的红球24概率
    private BigDecimal minRedBallTwentyFour;
    //最大的红球25概率
    private BigDecimal maxRedBallTwentyFive;
    //最小的红球25概率
    private BigDecimal minRedBallTwentyFive;
    //最大的红球26概率
    private BigDecimal maxRedBallTwentySix;
    //最小的红球26概率
    private BigDecimal minRedBallTwentySix;
    //最大的红球27概率
    private BigDecimal maxRedBallTwentySeven;
    //最小的红球27概率
    private BigDecimal minRedBallTwentySeven;
    //最大的红球28概率
    private BigDecimal maxRedBallTwentyEight;
    //最小的红球28概率
    private BigDecimal minRedBallTwentyEight;
    //最大的红球29概率
    private BigDecimal maxRedBallTwentyNine;
    //最小的红球29概率
    private BigDecimal minRedBallTwentyNine;
    //最大的红球30概率
    private BigDecimal maxRedBallThirty;
    //最小的红球30概率
    private BigDecimal minRedBallThirty;
    //最大的红球31概率
    private BigDecimal maxRedBallThirtyOne;
    //最小的红球31概率
    private BigDecimal minRedBallThirtyOne;
    //最大的红球32概率
    private BigDecimal maxRedBallThirtyTwo;
    //最小的红球32概率
    private BigDecimal minRedBallThirtyTwo;
    //最大的红球33概率
    private BigDecimal maxRedBallThirtyThree;
    //最小的红球33概率
    private BigDecimal minRedBallThirtyThree;


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

    public BigDecimal getMaxRedBallOne() {
        return maxRedBallOne;
    }

    public void setMaxRedBallOne(BigDecimal maxRedBallOne) {
        this.maxRedBallOne = maxRedBallOne;
    }

    public BigDecimal getMinRedBallOne() {
        return minRedBallOne;
    }

    public void setMinRedBallOne(BigDecimal minRedBallOne) {
        this.minRedBallOne = minRedBallOne;
    }

    public BigDecimal getMaxRedBallTwo() {
        return maxRedBallTwo;
    }

    public void setMaxRedBallTwo(BigDecimal maxRedBallTwo) {
        this.maxRedBallTwo = maxRedBallTwo;
    }

    public BigDecimal getMinRedBallTwo() {
        return minRedBallTwo;
    }

    public void setMinRedBallTwo(BigDecimal minRedBallTwo) {
        this.minRedBallTwo = minRedBallTwo;
    }

    public BigDecimal getMaxRedBallThree() {
        return maxRedBallThree;
    }

    public void setMaxRedBallThree(BigDecimal maxRedBallThree) {
        this.maxRedBallThree = maxRedBallThree;
    }

    public BigDecimal getMinRedBallThree() {
        return minRedBallThree;
    }

    public void setMinRedBallThree(BigDecimal minRedBallThree) {
        this.minRedBallThree = minRedBallThree;
    }

    public BigDecimal getMaxRedBallFour() {
        return maxRedBallFour;
    }

    public void setMaxRedBallFour(BigDecimal maxRedBallFour) {
        this.maxRedBallFour = maxRedBallFour;
    }

    public BigDecimal getMinRedBallFour() {
        return minRedBallFour;
    }

    public void setMinRedBallFour(BigDecimal minRedBallFour) {
        this.minRedBallFour = minRedBallFour;
    }

    public BigDecimal getMaxRedBallFive() {
        return maxRedBallFive;
    }

    public void setMaxRedBallFive(BigDecimal maxRedBallFive) {
        this.maxRedBallFive = maxRedBallFive;
    }

    public BigDecimal getMinRedBallFive() {
        return minRedBallFive;
    }

    public void setMinRedBallFive(BigDecimal minRedBallFive) {
        this.minRedBallFive = minRedBallFive;
    }

    public BigDecimal getMaxRedBallSix() {
        return maxRedBallSix;
    }

    public void setMaxRedBallSix(BigDecimal maxRedBallSix) {
        this.maxRedBallSix = maxRedBallSix;
    }

    public BigDecimal getMinRedBallSix() {
        return minRedBallSix;
    }

    public void setMinRedBallSix(BigDecimal minRedBallSix) {
        this.minRedBallSix = minRedBallSix;
    }

    public BigDecimal getMaxRedBallSeven() {
        return maxRedBallSeven;
    }

    public void setMaxRedBallSeven(BigDecimal maxRedBallSeven) {
        this.maxRedBallSeven = maxRedBallSeven;
    }

    public BigDecimal getMinRedBallSeven() {
        return minRedBallSeven;
    }

    public void setMinRedBallSeven(BigDecimal minRedBallSeven) {
        this.minRedBallSeven = minRedBallSeven;
    }

    public BigDecimal getMaxRedBallEight() {
        return maxRedBallEight;
    }

    public void setMaxRedBallEight(BigDecimal maxRedBallEight) {
        this.maxRedBallEight = maxRedBallEight;
    }

    public BigDecimal getMinRedBallEight() {
        return minRedBallEight;
    }

    public void setMinRedBallEight(BigDecimal minRedBallEight) {
        this.minRedBallEight = minRedBallEight;
    }

    public BigDecimal getMaxRedBallNine() {
        return maxRedBallNine;
    }

    public void setMaxRedBallNine(BigDecimal maxRedBallNine) {
        this.maxRedBallNine = maxRedBallNine;
    }

    public BigDecimal getMinRedBallNine() {
        return minRedBallNine;
    }

    public void setMinRedBallNine(BigDecimal minRedBallNine) {
        this.minRedBallNine = minRedBallNine;
    }

    public BigDecimal getMaxRedBallTen() {
        return maxRedBallTen;
    }

    public void setMaxRedBallTen(BigDecimal maxRedBallTen) {
        this.maxRedBallTen = maxRedBallTen;
    }

    public BigDecimal getMinRedBallTen() {
        return minRedBallTen;
    }

    public void setMinRedBallTen(BigDecimal minRedBallTen) {
        this.minRedBallTen = minRedBallTen;
    }

    public BigDecimal getMaxRedBallEleven() {
        return maxRedBallEleven;
    }

    public void setMaxRedBallEleven(BigDecimal maxRedBallEleven) {
        this.maxRedBallEleven = maxRedBallEleven;
    }

    public BigDecimal getMinRedBallEleven() {
        return minRedBallEleven;
    }

    public void setMinRedBallEleven(BigDecimal minRedBallEleven) {
        this.minRedBallEleven = minRedBallEleven;
    }

    public BigDecimal getMaxRedBallTwelve() {
        return maxRedBallTwelve;
    }

    public void setMaxRedBallTwelve(BigDecimal maxRedBallTwelve) {
        this.maxRedBallTwelve = maxRedBallTwelve;
    }

    public BigDecimal getMinRedBallTwelve() {
        return minRedBallTwelve;
    }

    public void setMinRedBallTwelve(BigDecimal minRedBallTwelve) {
        this.minRedBallTwelve = minRedBallTwelve;
    }

    public BigDecimal getMaxRedBallThirteen() {
        return maxRedBallThirteen;
    }

    public void setMaxRedBallThirteen(BigDecimal maxRedBallThirteen) {
        this.maxRedBallThirteen = maxRedBallThirteen;
    }

    public BigDecimal getMinRedBallThirteen() {
        return minRedBallThirteen;
    }

    public void setMinRedBallThirteen(BigDecimal minRedBallThirteen) {
        this.minRedBallThirteen = minRedBallThirteen;
    }

    public BigDecimal getMaxRedBallFourteen() {
        return maxRedBallFourteen;
    }

    public void setMaxRedBallFourteen(BigDecimal maxRedBallFourteen) {
        this.maxRedBallFourteen = maxRedBallFourteen;
    }

    public BigDecimal getMinRedBallFourteen() {
        return minRedBallFourteen;
    }

    public void setMinRedBallFourteen(BigDecimal minRedBallFourteen) {
        this.minRedBallFourteen = minRedBallFourteen;
    }

    public BigDecimal getMaxRedBallFifteen() {
        return maxRedBallFifteen;
    }

    public void setMaxRedBallFifteen(BigDecimal maxRedBallFifteen) {
        this.maxRedBallFifteen = maxRedBallFifteen;
    }

    public BigDecimal getMinRedBallFifteen() {
        return minRedBallFifteen;
    }

    public void setMinRedBallFifteen(BigDecimal minRedBallFifteen) {
        this.minRedBallFifteen = minRedBallFifteen;
    }

    public BigDecimal getMaxRedBallSixteen() {
        return maxRedBallSixteen;
    }

    public void setMaxRedBallSixteen(BigDecimal maxRedBallSixteen) {
        this.maxRedBallSixteen = maxRedBallSixteen;
    }

    public BigDecimal getMinRedBallSixteen() {
        return minRedBallSixteen;
    }

    public void setMinRedBallSixteen(BigDecimal minRedBallSixteen) {
        this.minRedBallSixteen = minRedBallSixteen;
    }

    public BigDecimal getMaxRedBallSeventeen() {
        return maxRedBallSeventeen;
    }

    public void setMaxRedBallSeventeen(BigDecimal maxRedBallSeventeen) {
        this.maxRedBallSeventeen = maxRedBallSeventeen;
    }

    public BigDecimal getMinRedBallSeventeen() {
        return minRedBallSeventeen;
    }

    public void setMinRedBallSeventeen(BigDecimal minRedBallSeventeen) {
        this.minRedBallSeventeen = minRedBallSeventeen;
    }

    public BigDecimal getMaxRedBallEighteen() {
        return maxRedBallEighteen;
    }

    public void setMaxRedBallEighteen(BigDecimal maxRedBallEighteen) {
        this.maxRedBallEighteen = maxRedBallEighteen;
    }

    public BigDecimal getMinRedBallEighteen() {
        return minRedBallEighteen;
    }

    public void setMinRedBallEighteen(BigDecimal minRedBallEighteen) {
        this.minRedBallEighteen = minRedBallEighteen;
    }

    public BigDecimal getMaxRedBallNineteen() {
        return maxRedBallNineteen;
    }

    public void setMaxRedBallNineteen(BigDecimal maxRedBallNineteen) {
        this.maxRedBallNineteen = maxRedBallNineteen;
    }

    public BigDecimal getMinRedBallNineteen() {
        return minRedBallNineteen;
    }

    public void setMinRedBallNineteen(BigDecimal minRedBallNineteen) {
        this.minRedBallNineteen = minRedBallNineteen;
    }

    public BigDecimal getMaxRedBallTwenty() {
        return maxRedBallTwenty;
    }

    public void setMaxRedBallTwenty(BigDecimal maxRedBallTwenty) {
        this.maxRedBallTwenty = maxRedBallTwenty;
    }

    public BigDecimal getMinRedBallTwenty() {
        return minRedBallTwenty;
    }

    public void setMinRedBallTwenty(BigDecimal minRedBallTwenty) {
        this.minRedBallTwenty = minRedBallTwenty;
    }

    public BigDecimal getMaxRedBallTwentyOne() {
        return maxRedBallTwentyOne;
    }

    public void setMaxRedBallTwentyOne(BigDecimal maxRedBallTwentyOne) {
        this.maxRedBallTwentyOne = maxRedBallTwentyOne;
    }

    public BigDecimal getMinRedBallTwentyOne() {
        return minRedBallTwentyOne;
    }

    public void setMinRedBallTwentyOne(BigDecimal minRedBallTwentyOne) {
        this.minRedBallTwentyOne = minRedBallTwentyOne;
    }

    public BigDecimal getMaxRedBallTwentyTwo() {
        return maxRedBallTwentyTwo;
    }

    public void setMaxRedBallTwentyTwo(BigDecimal maxRedBallTwentyTwo) {
        this.maxRedBallTwentyTwo = maxRedBallTwentyTwo;
    }

    public BigDecimal getMinRedBallTwentyTwo() {
        return minRedBallTwentyTwo;
    }

    public void setMinRedBallTwentyTwo(BigDecimal minRedBallTwentyTwo) {
        this.minRedBallTwentyTwo = minRedBallTwentyTwo;
    }

    public BigDecimal getMaxRedBallTwentyThree() {
        return maxRedBallTwentyThree;
    }

    public void setMaxRedBallTwentyThree(BigDecimal maxRedBallTwentyThree) {
        this.maxRedBallTwentyThree = maxRedBallTwentyThree;
    }

    public BigDecimal getMinRedBallTwentyThree() {
        return minRedBallTwentyThree;
    }

    public void setMinRedBallTwentyThree(BigDecimal minRedBallTwentyThree) {
        this.minRedBallTwentyThree = minRedBallTwentyThree;
    }

    public BigDecimal getMaxRedBallTwentyFour() {
        return maxRedBallTwentyFour;
    }

    public void setMaxRedBallTwentyFour(BigDecimal maxRedBallTwentyFour) {
        this.maxRedBallTwentyFour = maxRedBallTwentyFour;
    }

    public BigDecimal getMinRedBallTwentyFour() {
        return minRedBallTwentyFour;
    }

    public void setMinRedBallTwentyFour(BigDecimal minRedBallTwentyFour) {
        this.minRedBallTwentyFour = minRedBallTwentyFour;
    }

    public BigDecimal getMaxRedBallTwentyFive() {
        return maxRedBallTwentyFive;
    }

    public void setMaxRedBallTwentyFive(BigDecimal maxRedBallTwentyFive) {
        this.maxRedBallTwentyFive = maxRedBallTwentyFive;
    }

    public BigDecimal getMinRedBallTwentyFive() {
        return minRedBallTwentyFive;
    }

    public void setMinRedBallTwentyFive(BigDecimal minRedBallTwentyFive) {
        this.minRedBallTwentyFive = minRedBallTwentyFive;
    }

    public BigDecimal getMaxRedBallTwentySix() {
        return maxRedBallTwentySix;
    }

    public void setMaxRedBallTwentySix(BigDecimal maxRedBallTwentySix) {
        this.maxRedBallTwentySix = maxRedBallTwentySix;
    }

    public BigDecimal getMinRedBallTwentySix() {
        return minRedBallTwentySix;
    }

    public void setMinRedBallTwentySix(BigDecimal minRedBallTwentySix) {
        this.minRedBallTwentySix = minRedBallTwentySix;
    }

    public BigDecimal getMaxRedBallTwentySeven() {
        return maxRedBallTwentySeven;
    }

    public void setMaxRedBallTwentySeven(BigDecimal maxRedBallTwentySeven) {
        this.maxRedBallTwentySeven = maxRedBallTwentySeven;
    }

    public BigDecimal getMinRedBallTwentySeven() {
        return minRedBallTwentySeven;
    }

    public void setMinRedBallTwentySeven(BigDecimal minRedBallTwentySeven) {
        this.minRedBallTwentySeven = minRedBallTwentySeven;
    }

    public BigDecimal getMaxRedBallTwentyEight() {
        return maxRedBallTwentyEight;
    }

    public void setMaxRedBallTwentyEight(BigDecimal maxRedBallTwentyEight) {
        this.maxRedBallTwentyEight = maxRedBallTwentyEight;
    }

    public BigDecimal getMinRedBallTwentyEight() {
        return minRedBallTwentyEight;
    }

    public void setMinRedBallTwentyEight(BigDecimal minRedBallTwentyEight) {
        this.minRedBallTwentyEight = minRedBallTwentyEight;
    }

    public BigDecimal getMaxRedBallTwentyNine() {
        return maxRedBallTwentyNine;
    }

    public void setMaxRedBallTwentyNine(BigDecimal maxRedBallTwentyNine) {
        this.maxRedBallTwentyNine = maxRedBallTwentyNine;
    }

    public BigDecimal getMinRedBallTwentyNine() {
        return minRedBallTwentyNine;
    }

    public void setMinRedBallTwentyNine(BigDecimal minRedBallTwentyNine) {
        this.minRedBallTwentyNine = minRedBallTwentyNine;
    }

    public BigDecimal getMaxRedBallThirty() {
        return maxRedBallThirty;
    }

    public void setMaxRedBallThirty(BigDecimal maxRedBallThirty) {
        this.maxRedBallThirty = maxRedBallThirty;
    }

    public BigDecimal getMinRedBallThirty() {
        return minRedBallThirty;
    }

    public void setMinRedBallThirty(BigDecimal minRedBallThirty) {
        this.minRedBallThirty = minRedBallThirty;
    }

    public BigDecimal getMaxRedBallThirtyOne() {
        return maxRedBallThirtyOne;
    }

    public void setMaxRedBallThirtyOne(BigDecimal maxRedBallThirtyOne) {
        this.maxRedBallThirtyOne = maxRedBallThirtyOne;
    }

    public BigDecimal getMinRedBallThirtyOne() {
        return minRedBallThirtyOne;
    }

    public void setMinRedBallThirtyOne(BigDecimal minRedBallThirtyOne) {
        this.minRedBallThirtyOne = minRedBallThirtyOne;
    }

    public BigDecimal getMaxRedBallThirtyTwo() {
        return maxRedBallThirtyTwo;
    }

    public void setMaxRedBallThirtyTwo(BigDecimal maxRedBallThirtyTwo) {
        this.maxRedBallThirtyTwo = maxRedBallThirtyTwo;
    }

    public BigDecimal getMinRedBallThirtyTwo() {
        return minRedBallThirtyTwo;
    }

    public void setMinRedBallThirtyTwo(BigDecimal minRedBallThirtyTwo) {
        this.minRedBallThirtyTwo = minRedBallThirtyTwo;
    }

    public BigDecimal getMaxRedBallThirtyThree() {
        return maxRedBallThirtyThree;
    }

    public void setMaxRedBallThirtyThree(BigDecimal maxRedBallThirtyThree) {
        this.maxRedBallThirtyThree = maxRedBallThirtyThree;
    }

    public BigDecimal getMinRedBallThirtyThree() {
        return minRedBallThirtyThree;
    }

    public void setMinRedBallThirtyThree(BigDecimal minRedBallThirtyThree) {
        this.minRedBallThirtyThree = minRedBallThirtyThree;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ballProbabilityId=").append(getBallProbabilityId());
        sb.append(", redBallOne=").append(getRedBallOne());
        sb.append(", redBallTwo=").append(getRedBallTwo());
        sb.append(", redBallThree=").append(getRedBallThree());
        sb.append(", redBallFour=").append(getRedBallFour());
        sb.append(", redBallFive=").append(getRedBallFive());
        sb.append(", redBallSix=").append(getRedBallSix());
        sb.append(", redBallSeven=").append(getRedBallSeven());
        sb.append(", redBallEight=").append(getRedBallEight());
        sb.append(", redBallNine=").append(getRedBallNine());
        sb.append(", redBallTen=").append(getRedBallTen());
        sb.append(", redBallEleven=").append(getRedBallEleven());
        sb.append(", redBallTwelve=").append(getRedBallTwelve());
        sb.append(", redBallThirteen=").append(getRedBallThirteen());
        sb.append(", redBallFourteen=").append(getRedBallFourteen());
        sb.append(", redBallFifteen=").append(getRedBallFifteen());
        sb.append(", redBallSixteen=").append(getRedBallSixteen());
        sb.append(", redBallSeventeen=").append(getRedBallSeventeen());
        sb.append(", redBallEighteen=").append(getRedBallEighteen());
        sb.append(", redBallNineteen=").append(getRedBallNineteen());
        sb.append(", redBallTwenty=").append(getRedBallTwenty());
        sb.append(", redBallTwentyOne=").append(getRedBallTwentyOne());
        sb.append(", redBallTwentyTwo=").append(getRedBallTwentyTwo());
        sb.append(", redBallTwentyThree=").append(getRedBallTwentyThree());
        sb.append(", redBallTwentyFour=").append(getRedBallTwentyFour());
        sb.append(", redBallTwentyFive=").append(getRedBallTwentyFive());
        sb.append(", redBallTwentySix=").append(getRedBallTwentySix());
        sb.append(", redBallTwentySeven=").append(getRedBallTwentySeven());
        sb.append(", redBallTwentyEight=").append(getRedBallTwentyEight());
        sb.append(", redBallTwentyNine=").append(getRedBallTwentyNine());
        sb.append(", redBallThirty=").append(getRedBallThirty());
        sb.append(", redBallThirtyOne=").append(getRedBallThirtyOne());
        sb.append(", redBallThirtyTwo=").append(getRedBallThirtyTwo());
        sb.append(", redBallThirtyThree=").append(getRedBallThirtyThree());
        sb.append(", lastUpdateDate=").append(getLastUpdateDate());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", fromBase=").append(fromBase);
        sb.append(", minValue=").append(minValue);
        sb.append(", maxValue=").append(maxValue);
        sb.append(", maxRedBallOne=").append(maxRedBallOne);
        sb.append(", minRedBallOne=").append(minRedBallOne);
        sb.append(", maxRedBallTwo=").append(maxRedBallTwo);
        sb.append(", minRedBallTwo=").append(minRedBallTwo);
        sb.append(", maxRedBallThree=").append(maxRedBallThree);
        sb.append(", minRedBallThree=").append(minRedBallThree);
        sb.append(", maxRedBallFour=").append(maxRedBallFour);
        sb.append(", minRedBallFour=").append(minRedBallFour);
        sb.append(", maxRedBallFive=").append(maxRedBallFive);
        sb.append(", minRedBallFive=").append(minRedBallFive);
        sb.append(", maxRedBallSix=").append(maxRedBallSix);
        sb.append(", minRedBallSix=").append(minRedBallSix);
        sb.append(", maxRedBallSeven=").append(maxRedBallSeven);
        sb.append(", minRedBallSeven=").append(minRedBallSeven);
        sb.append(", maxRedBallEight=").append(maxRedBallEight);
        sb.append(", minRedBallEight=").append(minRedBallEight);
        sb.append(", maxRedBallNine=").append(maxRedBallNine);
        sb.append(", minRedBallNine=").append(minRedBallNine);
        sb.append(", maxRedBallTen=").append(maxRedBallTen);
        sb.append(", minRedBallTen=").append(minRedBallTen);
        sb.append(", maxRedBallEleven=").append(maxRedBallEleven);
        sb.append(", minRedBallEleven=").append(minRedBallEleven);
        sb.append(", maxRedBallTwelve=").append(maxRedBallTwelve);
        sb.append(", minRedBallTwelve=").append(minRedBallTwelve);
        sb.append(", maxRedBallThirteen=").append(maxRedBallThirteen);
        sb.append(", minRedBallThirteen=").append(minRedBallThirteen);
        sb.append(", maxRedBallFourteen=").append(maxRedBallFourteen);
        sb.append(", minRedBallFourteen=").append(minRedBallFourteen);
        sb.append(", maxRedBallFifteen=").append(maxRedBallFifteen);
        sb.append(", minRedBallFifteen=").append(minRedBallFifteen);
        sb.append(", maxRedBallSixteen=").append(maxRedBallSixteen);
        sb.append(", minRedBallSixteen=").append(minRedBallSixteen);
        sb.append(", maxRedBallSeventeen=").append(maxRedBallSeventeen);
        sb.append(", minRedBallSeventeen=").append(minRedBallSeventeen);
        sb.append(", maxRedBallEighteen=").append(maxRedBallEighteen);
        sb.append(", minRedBallEighteen=").append(minRedBallEighteen);
        sb.append(", maxRedBallNineteen=").append(maxRedBallNineteen);
        sb.append(", minRedBallNineteen=").append(minRedBallNineteen);
        sb.append(", maxRedBallTwenty=").append(maxRedBallTwenty);
        sb.append(", minRedBallTwenty=").append(minRedBallTwenty);
        sb.append(", maxRedBallTwentyOne=").append(maxRedBallTwentyOne);
        sb.append(", minRedBallTwentyOne=").append(minRedBallTwentyOne);
        sb.append(", maxRedBallTwentyTwo=").append(maxRedBallTwentyTwo);
        sb.append(", minRedBallTwentyTwo=").append(minRedBallTwentyTwo);
        sb.append(", maxRedBallTwentyThree=").append(maxRedBallTwentyThree);
        sb.append(", minRedBallTwentyThree=").append(minRedBallTwentyThree);
        sb.append(", maxRedBallTwentyFour=").append(maxRedBallTwentyFour);
        sb.append(", minRedBallTwentyFour=").append(minRedBallTwentyFour);
        sb.append(", maxRedBallTwentyFive=").append(maxRedBallTwentyFive);
        sb.append(", minRedBallTwentyFive=").append(minRedBallTwentyFive);
        sb.append(", maxRedBallTwentySix=").append(maxRedBallTwentySix);
        sb.append(", minRedBallTwentySix=").append(minRedBallTwentySix);
        sb.append(", maxRedBallTwentySeven=").append(maxRedBallTwentySeven);
        sb.append(", minRedBallTwentySeven=").append(minRedBallTwentySeven);
        sb.append(", maxRedBallTwentyEight=").append(maxRedBallTwentyEight);
        sb.append(", minRedBallTwentyEight=").append(minRedBallTwentyEight);
        sb.append(", maxRedBallTwentyNine=").append(maxRedBallTwentyNine);
        sb.append(", minRedBallTwentyNine=").append(minRedBallTwentyNine);
        sb.append(", maxRedBallThirty=").append(maxRedBallThirty);
        sb.append(", minRedBallThirty=").append(minRedBallThirty);
        sb.append(", maxRedBallThirtyOne=").append(maxRedBallThirtyOne);
        sb.append(", minRedBallThirtyOne=").append(minRedBallThirtyOne);
        sb.append(", maxRedBallThirtyTwo=").append(maxRedBallThirtyTwo);
        sb.append(", minRedBallThirtyTwo=").append(minRedBallThirtyTwo);
        sb.append(", maxRedBallThirtyThree=").append(maxRedBallThirtyThree);
        sb.append(", minRedBallThirtyThree=").append(minRedBallThirtyThree);
        sb.append("]");
        return sb.toString();
    }

}