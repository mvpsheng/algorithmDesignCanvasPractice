package com.gxs.algorithmdesigncanvas.mapper;

import com.gxs.algorithmdesigncanvas.entity.Canvas;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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

    @Insert("INSERT INTO canvas(canvas_name,constraints,ideas,complexity,code,tests,finished) VALUES(#{canvasName}, #{constraints}, #{ideas}" +
            ", #{complexity}, #{code}, #{tests}, #{finished})")
    void insert(Canvas user);

    @Update("UPDATE canvas SET user_name=#{userName},password=#{password} WHERE user_id =#{userId}")
    void update(Canvas user);

    @Delete("DELETE FROM canvas WHERE canvas_id =#{canvasID}")
    void delete(Integer userId);
}
