package com.project.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 班级课程：(ClassCourses)表实体类
 *
 */
@TableName("`class_courses`")
@Data
@EqualsAndHashCode(callSuper = false)
public class ClassCourses implements Serializable {

    // ClassCourses编号
    @TableId(value = "class_courses_id", type = IdType.AUTO)
    private Integer class_courses_id;

    // 学生账号
    @TableField(value = "`student_account`")
    private Integer student_account;
    // 学生姓名
    @TableField(value = "`student_name`")
    private String student_name;
    // 学生学号
    @TableField(value = "`student_id`")
    private String student_id;
    // 班级名称
    @TableField(value = "`class_name`")
    private String class_name;
    // 班级课号
    @TableField(value = "`class_class_number`")
    private String class_class_number;
    // 课程名称
    @TableField(value = "`course_name`")
    private String course_name;
    // 教师账号
    @TableField(value = "`teacher_account`")
    private Integer teacher_account;
    // 教师姓名
    @TableField(value = "`teachers_name`")
    private String teachers_name;
    // 教师工号
    @TableField(value = "`teacher_id`")
    private String teacher_id;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
