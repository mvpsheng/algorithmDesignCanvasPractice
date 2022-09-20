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

    @GetMapping("/canvasList")
    @CrossOrigin(origins = "http://localhost:8080/canvas",allowCredentials = "true")
    public List<Canvas> getCanvasList() {
        counter++;
        System.out.println("发生了依次canvasList请求" + counter + "次");

        return canvasMapper.getAllCanvas();
    }
    @GetMapping("/canvasByName")
    public List<Canvas> getCanvasByName(HttpServletRequest request) {
        String canvasName = request.getParameter("canvasName");
        System.out.println("发生了依次canvasList请求" + counter + "次");

        return canvasMapper.getOneByName(canvasName);
    }

    @DeleteMapping(value = "/deleteCanvas")
    public String deleteCanvasByName(HttpServletRequest request) {
        String canvasName = request.getParameter("deleteCanvasName");//deleteCanvasName
        System.out.println("canvasListdelete " + canvasName);
        canvasMapper.deleteByName(canvasName);
        return "已经删除了 " + canvasName;
    }
    @PostMapping(value = "/addCanvas")
    public String addCanvasList(HttpServletRequest request) {
        System.out.println("又被访问到");
        String canvasName = request.getParameter("canvasName");
        String constraints = request.getParameter("constraints");
        String ideas = request.getParameter("ideas");
        String complexity = request.getParameter("complexity");
        String password = request.getParameter("password");
        System.out.println(canvasName + " canvasName");
        System.out.println(ideas + " ideas");
        return "congratulations";
    }

    @GetMapping(value = "/updateCanvas")
    public List<Canvas> updateCanvasByName(HttpServletRequest request) {
        String canvasName = request.getParameter("updateCanvasName");
        String canvasIdeas = request.getParameter("updateCanvasIdeas");
        System.out.println("canvas updateName " + canvasName);
        canvasMapper.updateIdeasByName(canvasName,canvasIdeas);
        return canvasMapper.getOneByName(canvasName);
    }
}
