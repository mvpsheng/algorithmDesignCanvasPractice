package com.gxs.algorithmdesigncanvas.mapper;

import com.gxs.algorithmdesigncanvas.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FileName: UserMapper
 * author: gxs
 * Date: 2022/8/23  13:29
 */
@Mapper
public interface UserMapper {
    static Map<String, User> userMap = new HashMap<>();
    @Select("SELECT * FROM user")
    List<User> getAll();

    @Select("SELECT * FROM user WHERE userId = #{userId}")
    User getOne(Integer userId);
    @Select("SELECT * FROM user WHERE userName = #{userName}")
    User getOneByName(String userName);
    @Insert("INSERT INTO user(user_id,user_name,password) VALUES(#{userID}, #{userName}, #{password})")
    void insert(User user);

    @Update("UPDATE user SET user_name=#{userName},password=#{password} WHERE user_id =#{userId}")
    void update(User user);

    @Delete("DELETE FROM user WHERE userId =#{userId}")
    void delete(Integer userId);
}
