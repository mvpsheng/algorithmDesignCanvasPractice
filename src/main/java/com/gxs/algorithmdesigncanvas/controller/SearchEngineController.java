package com.gxs.algorithmdesigncanvas.controller;

import com.gxs.algorithmdesigncanvas.entity.Canvas;
import com.gxs.algorithmdesigncanvas.mapper.CanvasMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedList;
import java.util.List;

/**
 * FileName: SearchEngineController
 * author: gxs
 * Date: 2022/9/29  16:15
 * purpose: 搜索引擎， 用来显示特定的关键字对应的canvas，后续可以添加同时搜索得到相关canvas和user
 */
@RestController
public class SearchEngineController {
    @Autowired
    CanvasMapper canvasMapper;

    @GetMapping("/searchName")
    public List<Canvas> searchByName(HttpServletRequest request) {
        String canvasName = request.getParameter("canvasName");
//TODO: 需要实现虽然canvas那么相同，但是不同的用户可以拥有相同名称的canvas，那么一个用户搜索一个名称时，可能会出现很多不同用户的同一名称的canvas
        return canvasMapper.getOneByName(canvasName);
    }

    @GetMapping("/searchKeyWords")
    public List<Canvas> searchByKeyWords(HttpServletRequest request) {
//TODO: 根据 httpRequest 获取KeyWords数组，然后逐一遍历数据库，将结果canvas加入到展示列表中。
        List<Canvas> resultList = new LinkedList<>();
        String keywords = request.getParameter("keyWords");
        return resultList;
    }
}
