package com.example.androidgame.mapper;

import com.example.androidgame.entity.Artical;
import com.example.androidgame.entity.ArticalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table artical
     *
     * @mbg.generated
     */
    long countByExample(ArticalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table artical
     *
     * @mbg.generated
     */
    int deleteByExample(ArticalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table artical
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer articalId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table artical
     *
     * @mbg.generated
     */
    int insert(Artical record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table artical
     *
     * @mbg.generated
     */
    int insertSelective(Artical record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table artical
     *
     * @mbg.generated
     */
    List<Artical> selectByExample(ArticalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table artical
     *
     * @mbg.generated
     */
    Artical selectByPrimaryKey(Integer articalId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table artical
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Artical record, @Param("example") ArticalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table artical
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Artical record, @Param("example") ArticalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table artical
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Artical record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table artical
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Artical record);
}