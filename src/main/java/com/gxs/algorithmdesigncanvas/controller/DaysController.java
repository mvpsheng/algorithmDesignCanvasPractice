package com.gxs.algorithmdesigncanvas.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

/**
 * FileName: DaysController
 * author: gxs
 * Date: 2022/10/19  19:09
 * 目标：给每日心情项目提供后端日期数据服务API
 *  一、前端问题：
 *      1.如何获取一年中的天数，重复生成数据即可，根据循环控制语句生成数据列表，再将列表展开为HTML标签。而标签中的数据从后端API中获取，
 *          根绝后端API中获取的数据对应生成想要的效果。
 *      2.如何根据数据列表遍历生成HTML表格 ---》 根据List.map()方法解决， 直接遍历list中的数据，加上想要的标签效果即可。
 *  3.前端想要的数据效果：
 *      前端表格展示效果，1月到12月只有2月的日期不确定（根据是否为闰年来决定；闰年有29天），只需要根据前端写一点判断闰年的算法即可解决
 *  二、后端问题：
 *      建立起相关日期的情绪数据实体， 前端只需要调用对应年份的情绪，即可获取一年中已经写入的情绪数据。
 */
@RestController

@CrossOrigin(origins = "http://localhost:8080/daysOfTheYear",allowCredentials = "true")

@RequestMapping("/days")
public class DaysController {
    @GetMapping(value = "/")
    public void getDays(int year) {
        List<String> str = new LinkedList<>();
//        return str;
    }

    public static void main(String[] args) {
        new DaysController().getDays(2022);
    }
}
