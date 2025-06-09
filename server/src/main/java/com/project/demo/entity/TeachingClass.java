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
 * 授课班级：(TeachingClass)表实体类
 *
 */
@TableName("`teaching_class`")
@Data
@EqualsAndHashCode(callSuper = false)
public class TeachingClass implements Serializable {

    // TeachingClass编号
    @TableId(value = "teaching_class_id", type = IdType.AUTO)
    private Integer teaching_class_id;

    // 教师账号
    @TableField(value = "`teacher_account`")
    private Integer teacher_account;
    // 教师姓名
    @TableField(value = "`teachers_name`")
    private String teachers_name;
    // 教师工号
    @TableField(value = "`teacher_id`")
    private String teacher_id;
    // 授课班级
    @TableField(value = "`teaching_class`")
    private String teaching_class;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
