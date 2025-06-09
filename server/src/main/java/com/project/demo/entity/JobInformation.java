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
 * 作业信息：(JobInformation)表实体类
 *
 */
@TableName("`job_information`")
@Data
@EqualsAndHashCode(callSuper = false)
public class JobInformation implements Serializable {

    // JobInformation编号
    @TableId(value = "job_information_id", type = IdType.AUTO)
    private Integer job_information_id;

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
    // 发布日期
    @TableField(value = "`release_date`")
    private Timestamp release_date;
    // 作业内容
    @TableField(value = "`assignment_content`")
    private String assignment_content;
    // 完成要求
    @TableField(value = "`complete_requirements`")
    private String complete_requirements;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
