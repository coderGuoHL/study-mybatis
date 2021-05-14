package com.guo.dao;

import com.guo.pojo.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
//    @Select("select * from teacher")
    List<Teacher> getTeacherList();
}
