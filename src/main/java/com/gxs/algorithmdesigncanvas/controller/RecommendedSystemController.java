package com.gxs.algorithmdesigncanvas.controller;

import com.gxs.algorithmdesigncanvas.entity.Canvas;
import com.gxs.algorithmdesigncanvas.mapper.CanvasMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * FileName: RecommendedSystemController
 * author: gxs
 * Date: 2022/9/29  16:19
 * purpose: 推荐系统，用户在每户打开时，可以直接看到自己感兴趣的canvas
 * current: 当前目标实现用户打开后看到自己所有的canvas， 分页展示
 */
@RestController
public class RecommendedSystemController {
    @Autowired
    CanvasMapper canvasMapper;

/**
 * 通过获取用户搜索引擎的keywords历史记录来进行推荐
 * 通过 用户查看的一些canvas和自己保存提交的一些canvas的keywords来推荐
 * 综合以上两种方法来推荐
 * */
    @GetMapping("/recommand")
    public List<Canvas> recommend() {
        return canvasMapper.getAllCanvas();

    }
}
