package com.gxs.algorithmdesigncanvas.controller;

import com.gxs.algorithmdesigncanvas.entity.Canvas;
import com.gxs.algorithmdesigncanvas.mapper.CanvasMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * FileName: CanvasController
 * author: gxs
 * Date: 2022/8/23  11:19
 */
@RestController

@CrossOrigin(origins = "http://localhost:8080/canvas",allowCredentials = "true")

@RequestMapping("/canvas")
public class CanvasController {

    @Autowired
    CanvasMapper canvasMapper;
    static int counter = 0;

/**
 * 获取所有本用户的canvas
 * */
    @GetMapping("/")
    @CrossOrigin(origins = "http://localhost:8080/canvas",allowCredentials = "true")
    public List<Canvas> getCanvasList() {
//        counter++;
//        System.out.println("发生了依次canvasList请求" + counter + "次");
        return canvasMapper.getAllCanvas();
    }
    @GetMapping("/canvasName")
    public List<Canvas> getCanvasByName(HttpServletRequest request) {
        String canvasName = request.getParameter("canvasName");
        System.out.println("发生了依次canvasList请求" + counter + "次");

        return canvasMapper.getOneByName(canvasName);

    }

    @DeleteMapping("/{canvasName}")
    public void deleteCanvasByName(@PathVariable String canvasName) {
//        String canvasName = request.getParameter("deleteCanvasName");//deleteCanvasName
//        System.out.println("canvasListdelete " + canvasName);
        canvasMapper.deleteByName(canvasName);
    }
    @PostMapping
    public void addCanvas(@RequestBody Canvas canvas) {
//        String canvasName = request.getParameter("canvasName");
//        String description = request.getParameter("description");
//        String constraints = request.getParameter("constraints");
//        String ideas = request.getParameter("ideas");
//        String complexity = request.getParameter("complexity");
//        String code = request.getParameter("code");
//        String tests = request.getParameter("tests");
//        String conclusion = request.getParameter("conclusion");
//        Canvas canvas = new Canvas(canvasName, description, constraints, ideas, complexity
//        ,code, tests, conclusion);
        canvasMapper.insert(canvas);
    }


/**
 * TODO: 更新canvas中的各种内容
 * */
    @GetMapping(value = "/canvasName")
    public List<Canvas> updateCanvasByName(HttpServletRequest request) {
        String canvasName = request.getParameter("updateCanvasName");
        String canvasIdeas = request.getParameter("updateCanvasIdeas");
        System.out.println("canvas updateName " + canvasName);
        canvasMapper.updateIdeasByName(canvasName,canvasIdeas);
        return canvasMapper.getOneByName(canvasName);
    }
}
