package com.gxs.algorithmdesigncanvas.entity;

import lombok.*;

/**
 * FileName: Canvas
 * author: gxs
 * Date: 2022/8/23  11:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Canvas {
    private Integer canvasID;
    private String canvasName;
    private String constraints;
    private String ideas;
    private String complexity;
    private String code;
    private String tests;
    private boolean finished;
}
/**
 * CREATE TABLE IF NOT EXISTS `canvas`(
 *    `canvas_id` INT UNSIGNED AUTO_INCREMENT,
 *    `canvasName` VARCHAR(30) NOT NULL,
 *    `constraints` VARCHAR(100) NOT NULL,
 *    `ideas` VARCHAR(150) NOT NULL,
 *    `complexity` VARCHAR(80) NOT NULL,
 *    `code` VARCHAR(150) NOT NULL,
 *    `tests` VARCHAR(100) NOT NULL,
 *    `finished` TINYINT(1) NOT NULL
 * )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 *
 * */