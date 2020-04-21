package com.example.androidgame.mapper;

import com.example.androidgame.entity.Discuss;
import com.example.androidgame.entity.DiscussExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiscussMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss
     *
     * @mbg.generated
     */
    long countByExample(DiscussExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss
     *
     * @mbg.generated
     */
    int deleteByExample(DiscussExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer discussId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss
     *
     * @mbg.generated
     */
    int insert(Discuss record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss
     *
     * @mbg.generated
     */
    int insertSelective(Discuss record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss
     *
     * @mbg.generated
     */
    List<Discuss> selectByExample(DiscussExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss
     *
     * @mbg.generated
     */
    Discuss selectByPrimaryKey(Integer discussId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Discuss record, @Param("example") DiscussExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Discuss record, @Param("example") DiscussExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Discuss record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discuss
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Discuss record);
}