package com.gxs.algorithmdesigncanvas.mapper;

import com.gxs.algorithmdesigncanvas.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * FileName: UserMapper
 * author: gxs
 * Date: 2022/8/23  13:29
 */
public interface UserMapper {
    @Select("SELECT * FROM user")
    List<User> getAll();

    @Select("SELECT * FROM user WHERE userId = #{userId}")
    User getOne(Integer userId);

    @Insert("INSERT INTO user(user_id,user_name,password) VALUES(#{userID}, #{userName}, #{password})")
    void insert(User user);

    @Update("UPDATE user SET user_name=#{userName},password=#{password} WHERE user_id =#{userId}")
    void update(User user);

    @Delete("DELETE FROM user WHERE userId =#{userId}")
    void delete(Integer userId);
}
