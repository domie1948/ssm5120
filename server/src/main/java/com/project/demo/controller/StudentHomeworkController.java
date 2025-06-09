package com.project.demo.controller;

import com.project.demo.entity.StudentHomework;
import com.project.demo.service.StudentHomeworkService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

/**
 * 学生作业：(StudentHomework)表控制层
 *
 */
@RestController
@RequestMapping("/student_homework")
public class StudentHomeworkController extends BaseController<StudentHomework, StudentHomeworkService> {

    /**
     * 学生作业对象
     */
    @Autowired
    public StudentHomeworkController(StudentHomeworkService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
