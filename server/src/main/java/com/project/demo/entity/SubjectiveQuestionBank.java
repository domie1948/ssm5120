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
 * 主观题库：(SubjectiveQuestionBank)表实体类
 *
 */
@TableName("`subjective_question_bank`")
@Data
@EqualsAndHashCode(callSuper = false)
public class SubjectiveQuestionBank implements Serializable {

    // SubjectiveQuestionBank编号
    @TableId(value = "subjective_question_bank_id", type = IdType.AUTO)
    private Integer subjective_question_bank_id;

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
    // 题目编号
    @TableField(value = "`question_number`")
    private String question_number;
    // 题目分数
    @TableField(value = "`question_score`")
    private Integer question_score;
    // 发布时间
    @TableField(value = "`release_time`")
    private Timestamp release_time;
    // 题目内容
    @TableField(value = "`topic_content`")
    private String topic_content;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
