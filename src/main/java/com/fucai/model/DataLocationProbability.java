package com.fucai.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DataLocationProbability implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_location_probability.DATA_LOCATION_PROBABILITY_ID
     *
     * @mbggenerated
     */
    private Integer dataLocationProbabilityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_location_probability.APPEAR_DATA
     *
     * @mbggenerated
     */
    private String appearData;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_location_probability.LOCATION_ONE_PROBABILITY
     *
     * @mbggenerated
     */
    private BigDecimal locationOneProbability;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_location_probability.LOCATION_TWO_PROBABILITY
     *
     * @mbggenerated
     */
    private BigDecimal locationTwoProbability;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_location_probability.LOCATION_THREE_PROBABILITY
     *
     * @mbggenerated
     */
    private BigDecimal locationThreeProbability;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_location_probability.LOCATION_FOUR_PROBABILITY
     *
     * @mbggenerated
     */
    private BigDecimal locationFourProbability;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_location_probability.LOCATION_FIVE_PROBABILITY
     *
     * @mbggenerated
     */
    private BigDecimal locationFiveProbability;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_location_probability.LOCATION_SIX_PROBABILITY
     *
     * @mbggenerated
     */
    private BigDecimal locationSixProbability;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_location_probability.LAST_UPDATE_DATA
     *
     * @mbggenerated
     */
    private Date lastUpdateData;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table data_location_probability
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_location_probability.DATA_LOCATION_PROBABILITY_ID
     *
     * @return the value of data_location_probability.DATA_LOCATION_PROBABILITY_ID
     *
     * @mbggenerated
     */
    public Integer getDataLocationProbabilityId() {
        return dataLocationProbabilityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_location_probability.DATA_LOCATION_PROBABILITY_ID
     *
     * @param dataLocationProbabilityId the value for data_location_probability.DATA_LOCATION_PROBABILITY_ID
     *
     * @mbggenerated
     */
    public void setDataLocationProbabilityId(Integer dataLocationProbabilityId) {
        this.dataLocationProbabilityId = dataLocationProbabilityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_location_probability.APPEAR_DATA
     *
     * @return the value of data_location_probability.APPEAR_DATA
     *
     * @mbggenerated
     */
    public String getAppearData() {
        return appearData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_location_probability.APPEAR_DATA
     *
     * @param appearData the value for data_location_probability.APPEAR_DATA
     *
     * @mbggenerated
     */
    public void setAppearData(String appearData) {
        this.appearData = appearData == null ? null : appearData.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_location_probability.LOCATION_ONE_PROBABILITY
     *
     * @return the value of data_location_probability.LOCATION_ONE_PROBABILITY
     *
     * @mbggenerated
     */
    public BigDecimal getLocationOneProbability() {
        return locationOneProbability;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_location_probability.LOCATION_ONE_PROBABILITY
     *
     * @param locationOneProbability the value for data_location_probability.LOCATION_ONE_PROBABILITY
     *
     * @mbggenerated
     */
    public void setLocationOneProbability(BigDecimal locationOneProbability) {
        this.locationOneProbability = locationOneProbability;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_location_probability.LOCATION_TWO_PROBABILITY
     *
     * @return the value of data_location_probability.LOCATION_TWO_PROBABILITY
     *
     * @mbggenerated
     */
    public BigDecimal getLocationTwoProbability() {
        return locationTwoProbability;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_location_probability.LOCATION_TWO_PROBABILITY
     *
     * @param locationTwoProbability the value for data_location_probability.LOCATION_TWO_PROBABILITY
     *
     * @mbggenerated
     */
    public void setLocationTwoProbability(BigDecimal locationTwoProbability) {
        this.locationTwoProbability = locationTwoProbability;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_location_probability.LOCATION_THREE_PROBABILITY
     *
     * @return the value of data_location_probability.LOCATION_THREE_PROBABILITY
     *
     * @mbggenerated
     */
    public BigDecimal getLocationThreeProbability() {
        return locationThreeProbability;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_location_probability.LOCATION_THREE_PROBABILITY
     *
     * @param locationThreeProbability the value for data_location_probability.LOCATION_THREE_PROBABILITY
     *
     * @mbggenerated
     */
    public void setLocationThreeProbability(BigDecimal locationThreeProbability) {
        this.locationThreeProbability = locationThreeProbability;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_location_probability.LOCATION_FOUR_PROBABILITY
     *
     * @return the value of data_location_probability.LOCATION_FOUR_PROBABILITY
     *
     * @mbggenerated
     */
    public BigDecimal getLocationFourProbability() {
        return locationFourProbability;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_location_probability.LOCATION_FOUR_PROBABILITY
     *
     * @param locationFourProbability the value for data_location_probability.LOCATION_FOUR_PROBABILITY
     *
     * @mbggenerated
     */
    public void setLocationFourProbability(BigDecimal locationFourProbability) {
        this.locationFourProbability = locationFourProbability;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_location_probability.LOCATION_FIVE_PROBABILITY
     *
     * @return the value of data_location_probability.LOCATION_FIVE_PROBABILITY
     *
     * @mbggenerated
     */
    public BigDecimal getLocationFiveProbability() {
        return locationFiveProbability;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_location_probability.LOCATION_FIVE_PROBABILITY
     *
     * @param locationFiveProbability the value for data_location_probability.LOCATION_FIVE_PROBABILITY
     *
     * @mbggenerated
     */
    public void setLocationFiveProbability(BigDecimal locationFiveProbability) {
        this.locationFiveProbability = locationFiveProbability;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_location_probability.LOCATION_SIX_PROBABILITY
     *
     * @return the value of data_location_probability.LOCATION_SIX_PROBABILITY
     *
     * @mbggenerated
     */
    public BigDecimal getLocationSixProbability() {
        return locationSixProbability;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_location_probability.LOCATION_SIX_PROBABILITY
     *
     * @param locationSixProbability the value for data_location_probability.LOCATION_SIX_PROBABILITY
     *
     * @mbggenerated
     */
    public void setLocationSixProbability(BigDecimal locationSixProbability) {
        this.locationSixProbability = locationSixProbability;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_location_probability.LAST_UPDATE_DATA
     *
     * @return the value of data_location_probability.LAST_UPDATE_DATA
     *
     * @mbggenerated
     */
    public Date getLastUpdateData() {
        return lastUpdateData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_location_probability.LAST_UPDATE_DATA
     *
     * @param lastUpdateData the value for data_location_probability.LAST_UPDATE_DATA
     *
     * @mbggenerated
     */
    public void setLastUpdateData(Date lastUpdateData) {
        this.lastUpdateData = lastUpdateData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_location_probability
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dataLocationProbabilityId=").append(dataLocationProbabilityId);
        sb.append(", appearData=").append(appearData);
        sb.append(", locationOneProbability=").append(locationOneProbability);
        sb.append(", locationTwoProbability=").append(locationTwoProbability);
        sb.append(", locationThreeProbability=").append(locationThreeProbability);
        sb.append(", locationFourProbability=").append(locationFourProbability);
        sb.append(", locationFiveProbability=").append(locationFiveProbability);
        sb.append(", locationSixProbability=").append(locationSixProbability);
        sb.append(", lastUpdateData=").append(lastUpdateData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}