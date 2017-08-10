package com.fucai.dao;

import com.fucai.model.FiveBlueBallProbability;
import com.fucai.model.FiveBlueBallProbabilityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FiveBlueBallProbabilityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table five_blue_ball_probability
     *
     * @mbggenerated
     */
    int countByExample(FiveBlueBallProbabilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table five_blue_ball_probability
     *
     * @mbggenerated
     */
    int deleteByExample(FiveBlueBallProbabilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table five_blue_ball_probability
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer ballProbabilityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table five_blue_ball_probability
     *
     * @mbggenerated
     */
    int insert(FiveBlueBallProbability record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table five_blue_ball_probability
     *
     * @mbggenerated
     */
    int insertSelective(FiveBlueBallProbability record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table five_blue_ball_probability
     *
     * @mbggenerated
     */
    List<FiveBlueBallProbability> selectByExample(FiveBlueBallProbabilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table five_blue_ball_probability
     *
     * @mbggenerated
     */
    FiveBlueBallProbability selectByPrimaryKey(Integer ballProbabilityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table five_blue_ball_probability
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FiveBlueBallProbability record, @Param("example") FiveBlueBallProbabilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table five_blue_ball_probability
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FiveBlueBallProbability record, @Param("example") FiveBlueBallProbabilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table five_blue_ball_probability
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FiveBlueBallProbability record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table five_blue_ball_probability
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FiveBlueBallProbability record);
}