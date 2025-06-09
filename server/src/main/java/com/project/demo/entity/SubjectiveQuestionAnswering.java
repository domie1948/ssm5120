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
 * 主观答题：(SubjectiveQuestionAnswering)表实体类
 *
 */
@TableName("`subjective_question_answering`")
@Data
@EqualsAndHashCode(callSuper = false)
public class SubjectiveQuestionAnswering implements Serializable {

    // SubjectiveQuestionAnswering编号
    @TableId(value = "subjective_question_answering_id", type = IdType.AUTO)
    private Integer subjective_question_answering_id;

    // 教师账号
    @TableField(value = "`teacher_account`")
    private Integer teacher_account;
    // 教师姓名
    @TableField(value = "`teachers_name`")
    private String teachers_name;
    // 教师工号
    @TableField(value = "`teacher_id`")
    private String teacher_id;
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
    // 课程名称
    @TableField(value = "`course_name`")
    private String course_name;
    // 题目编号
    @TableField(value = "`question_number`")
    private String question_number;
    // 答题内容
    @TableField(value = "`answer_content`")
    private String answer_content;
    // 答题备注
    @TableField(value = "`answer_notes`")
    private String answer_notes;



    // 审核状态
    @TableField(value = "examine_state")
    private String examine_state;



    // 审核回复
    @TableField(value = "examine_reply")
    private String examine_reply;




    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
