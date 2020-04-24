package com.example.androidgame.mapper;

import com.example.androidgame.entity.Artical;
import com.example.androidgame.entity.Game;

import java.util.List;

import com.example.androidgame.entity.GameExample;
import org.apache.ibatis.annotations.Param;

public interface GameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    long countByExample(GameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    int deleteByExample(GameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer gameId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    int insert(Game record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    int insertSelective(Game record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    List<Game> selectByExample(GameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    Game selectByPrimaryKey(Integer gameId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Game record, @Param("example") GameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Game record, @Param("example") GameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Game record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Game record);

    List<Game> selectAll();

    List<Game> selectByUserId(int UserId);
}