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
 * 学生作业：(StudentHomework)表实体类
 *
 */
@TableName("`student_homework`")
@Data
@EqualsAndHashCode(callSuper = false)
public class StudentHomework implements Serializable {

    // StudentHomework编号
    @TableId(value = "student_homework_id", type = IdType.AUTO)
    private Integer student_homework_id;

    // 学生账号
    @TableField(value = "`student_account`")
    private Integer student_account;
    // 学生姓名
    @TableField(value = "`student_name`")
    private String student_name;
    // 学生学号
    @TableField(value = "`student_id`")
    private String student_id;
    // 教师账号
    @TableField(value = "`teacher_account`")
    private Integer teacher_account;
    // 教师姓名
    @TableField(value = "`teachers_name`")
    private String teachers_name;
    // 教师工号
    @TableField(value = "`teacher_id`")
    private String teacher_id;
    // 班级名称
    @TableField(value = "`class_name`")
    private String class_name;
    // 课程名称
    @TableField(value = "`course_name`")
    private String course_name;
    // 作业编号
    @TableField(value = "`job_number`")
    private String job_number;
    // 作业题目
    @TableField(value = "`assignment_title`")
    private String assignment_title;
    // 上传作业
    @TableField(value = "`upload_homework`")
    private String upload_homework;



    // 审核状态
    @TableField(value = "examine_state")
    private String examine_state;







    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
