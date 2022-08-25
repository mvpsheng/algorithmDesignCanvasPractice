package com.gxs.algorithmdesigncanvas.controller;

import com.gxs.algorithmdesigncanvas.entity.Canvas;
import com.gxs.algorithmdesigncanvas.mapper.CanvasMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

/**
 * FileName: CanvasController
 * author: gxs
 * Date: 2022/8/23  11:19
 */
@Controller
@RequestMapping("/canvas")
public class CanvasController {

    @Autowired
    CanvasMapper canvasMapper;

//    @GetMapping(value = "/canvasList")
    @RequestMapping("/canvasList")
    public String getCanvasList() {
        System.out.println("canvasList");
        return "login";
    }

    @GetMapping(value = "/deleteCanvas")
    public Canvas getOneCanvas() {
        System.out.println("canvasListdelete");
        canvasMapper.delete(1);
        return canvasMapper.getOne(1);
    }
    @GetMapping(value = "/addCanvas")
    public String addCanvasList() {
//        @Insert("INSERT INTO canvas(canvas_name,constraints,ideas,complexity,code,tests,finished) VALUES(#{canvasName}, #{constraints}, #{ideas}" +
//            ", #{complexity}, #{code}, #{tests}, #{finished})")
        System.out.println("开始插入数据。。。。。。。。。。");
        canvasMapper.insert(Canvas.builder().canvasName("gxs1").constraints("加入约束")
                .ideas("ideas:....").complexity("time..memory..").code("code...")
                .tests("tests...").finished(true).build());
        canvasMapper.insert(Canvas.builder().canvasName("gxs2").constraints("加入约束")
                .ideas("ideas:....").complexity("time..memory..").code("code...")
                .tests("tests...").finished(true).build());
        canvasMapper.insert(Canvas.builder().canvasName("gxs3").constraints("加入约束")
                .ideas("ideas:....").complexity("time..memory..").code("code...")
                .tests("tests...").finished(false).build());
        System.out.println("canvasList-------------");
        System.out.println(Arrays.toString(canvasMapper.getAllCanvas().toArray()));
        return "userMainPage.html";
    }
}
