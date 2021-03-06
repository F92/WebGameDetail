package com.example.androidgame.mapper;

import com.example.androidgame.entity.Publish;

import java.util.List;

import com.example.androidgame.entity.PublishExample;
import org.apache.ibatis.annotations.Param;

public interface PublishMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publish
     *
     * @mbg.generated
     */
    long countByExample(PublishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publish
     *
     * @mbg.generated
     */
    int deleteByExample(PublishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publish
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer publishId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publish
     *
     * @mbg.generated
     */
    int insert(Publish record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publish
     *
     * @mbg.generated
     */
    int insertSelective(Publish record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publish
     *
     * @mbg.generated
     */
    List<Publish> selectByExample(PublishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publish
     *
     * @mbg.generated
     */
    Publish selectByPrimaryKey(Integer publishId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publish
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Publish record, @Param("example") PublishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publish
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Publish record, @Param("example") PublishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publish
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Publish record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publish
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Publish record);
}