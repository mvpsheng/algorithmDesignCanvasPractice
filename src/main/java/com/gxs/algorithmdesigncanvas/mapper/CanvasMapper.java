package com.gxs.algorithmdesigncanvas.mapper;

import com.gxs.algorithmdesigncanvas.entity.Canvas;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * FileName: CanvasMapper
 * author: gxs
 * Date: 2022/8/23  13:46
 */
public interface CanvasMapper {
/**
 * private Integer canvasID;
 *     private String canvasName;
 *     private String constraints;
 *     private String ideas;
 *     private String complexity;
 *     private String code;
 *     private String tests;
 *     private boolean finished;
 * */
    @Select("SELECT * FROM canvas")
    List<Canvas> getAllCanvas();

    @Select("SELECT * FROM canvas WHERE canvas_id = #{canvasId}")
    Canvas getOne(Integer canvasId);

    @Select("SELECT * FROM canvas WHERE canvas_name = #{canvasName}")
    List<Canvas> getOneByName(String canvasName);

    @Insert("INSERT INTO canvas(canvas_name,constraints,ideas,complexity,code,tests,finished) VALUES(#{canvasName}, #{constraints}, #{ideas}" +
            ", #{complexity}, #{code}, #{tests}, #{finished})")
    void insert(Canvas canvas);

    @Update("UPDATE canvas SET user_name=#{userName},password=#{password} WHERE user_id =#{userId}")
    void update(Canvas canvas);

    @Delete("DELETE FROM canvas WHERE canvas_id =#{canvasID}")
    void deleteById(Integer canvasId);

    @Delete("DELETE FROM canvas WHERE canvas_name =#{canvasName}")
    void deleteByName(String canvasName);

    @Update("UPDATE canvas SET ideas =#{canvasIdeas} WHERE canvas_name =#{canvasName}")
    void updateIdeasByName(@Param("canvasName") String canvasName, @Param("canvasIdeas") String canvasIdeas);
}
