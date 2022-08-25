package com.gxs.algorithmdesigncanvas;

import com.gxs.algorithmdesigncanvas.entity.User;
import com.gxs.algorithmdesigncanvas.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * FileName: MybatisTest
 * author: gxs
 * Date: 2022/8/23  13:34
 */
@SpringBootTest
@Slf4j
public class MybatisTest {

        @Autowired
        private UserMapper userMapper;

        @Test
        void testInsert() {
            userMapper.insert(User.builder().userName("gxs二").password("123456").build());
            userMapper.insert(User.builder().userName("gxs三").password("123456").build());
            userMapper.insert(User.builder().userName("gxs四").password("123456").build());
            log.info("查询所有：{}", userMapper.getAll().toArray());
        }

        @Test
        List<User> testQuery() {
            List<User> all = userMapper.getAll();
            log.info("查询所有：{}", all.toArray());
            return all;
        }

        @Test
        void testUpdate() {
            User one = userMapper.getOne(1);
            log.info("更新前{}", one);
            one.setPassword("654321");
            userMapper.update(one);
            log.info("更新后{}", userMapper.getOne(1));
        }

        @Test
        void testDelete() {
            log.info("删除前{}", userMapper.getAll().toArray());
            userMapper.delete(1);
            log.info("删除后{}", userMapper.getAll().toArray());

        }
}
