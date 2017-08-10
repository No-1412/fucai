package com.fucai.dao;

import com.fucai.model.BlueBallProbability;
import com.fucai.model.BlueBallProbabilityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlueBallProbabilityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blue_ball_probability
     *
     * @mbggenerated
     */
    int countByExample(BlueBallProbabilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blue_ball_probability
     *
     * @mbggenerated
     */
    int deleteByExample(BlueBallProbabilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blue_ball_probability
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer ballProbabilityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blue_ball_probability
     *
     * @mbggenerated
     */
    int insert(BlueBallProbability record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blue_ball_probability
     *
     * @mbggenerated
     */
    int insertSelective(BlueBallProbability record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blue_ball_probability
     *
     * @mbggenerated
     */
    List<BlueBallProbability> selectByExample(BlueBallProbabilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blue_ball_probability
     *
     * @mbggenerated
     */
    BlueBallProbability selectByPrimaryKey(Integer ballProbabilityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blue_ball_probability
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BlueBallProbability record, @Param("example") BlueBallProbabilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blue_ball_probability
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BlueBallProbability record, @Param("example") BlueBallProbabilityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blue_ball_probability
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BlueBallProbability record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blue_ball_probability
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BlueBallProbability record);
}