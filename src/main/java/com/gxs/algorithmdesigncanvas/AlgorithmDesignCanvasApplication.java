package com.gxs.algorithmdesigncanvas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class AlgorithmDesignCanvasApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmDesignCanvasApplication.class, args);
    }

}
