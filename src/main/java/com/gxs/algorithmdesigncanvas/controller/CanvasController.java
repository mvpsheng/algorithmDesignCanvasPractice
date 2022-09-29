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
<<<<<<< HEAD
@CrossOrigin(origins = "http://localhost:8080/canvas",allowCredentials = "true")
=======
>>>>>>> master
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
<<<<<<< HEAD
    }
    @GetMapping("/canvasByName")
    public List<Canvas> getCanvasByName(HttpServletRequest request) {
        String canvasName = request.getParameter("canvasName");
        System.out.println("发生了依次canvasList请求" + counter + "次");

        return canvasMapper.getOneByName(canvasName);
=======
>>>>>>> master
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
<<<<<<< HEAD
        return "congratulations";
    }

    @GetMapping(value = "/updateCanvas")
    public List<Canvas> updateCanvasByName(HttpServletRequest request) {
        String canvasName = request.getParameter("updateCanvasName");
        String canvasIdeas = request.getParameter("updateCanvasIdeas");
        System.out.println("canvas updateName " + canvasName);
        canvasMapper.updateIdeasByName(canvasName,canvasIdeas);
        return canvasMapper.getOneByName(canvasName);
=======
//        @Insert("INSERT INTO canvas(canvas_name,constraints,ideas,complexity,code,tests,finished) VALUES(#{canvasName}, #{constraints}, #{ideas}" +
//            ", #{complexity}, #{code}, #{tests}, #{finished})")
//        System.out.println("开始插入数据。。。。。。。。。。");
//        canvasMapper.insert(Canvas.builder().canvasName("gxs1").constraints("加入约束")
//                .ideas("ideas:....").complexity("time..memory..").code("code...")
//                .tests("tests...").finished(true).build());
//        canvasMapper.insert(Canvas.builder().canvasName("gxs2").constraints("加入约束")
//                .ideas("ideas:....").complexity("time..memory..").code("code...")
//                .tests("tests...").finished(true).build());
//        canvasMapper.insert(Canvas.builder().canvasName("gxs3").constraints("加入约束")
//                .ideas("ideas:....").complexity("time..memory..").code("code...")
//                .tests("tests...").finished(false).build());
//        System.out.println("canvasList-------------");
//        System.out.println(Arrays.toString(canvasMapper.getAllCanvas().toArray()));
        return "congratulations";
>>>>>>> master
    }
}
