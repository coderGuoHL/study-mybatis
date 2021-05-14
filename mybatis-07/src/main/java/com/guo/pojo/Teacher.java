package com.guo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private int id;
    private String name;
//    一个老师对应多个学生哦
    private List<Student> students;
}
