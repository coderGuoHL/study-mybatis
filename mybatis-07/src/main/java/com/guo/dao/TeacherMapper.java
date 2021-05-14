package com.guo.dao;

import com.guo.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {

    List<Teacher> getTeacher(@Param("tid")int id);

   Teacher getTeacher2(@Param("tid")int id);

}
