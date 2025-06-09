package com.project.demo.controller;

import com.project.demo.entity.ClassCourses;
import com.project.demo.service.ClassCoursesService;
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
 * 班级课程：(ClassCourses)表控制层
 *
 */
@RestController
@RequestMapping("/class_courses")
public class ClassCoursesController extends BaseController<ClassCourses, ClassCoursesService> {

    /**
     * 班级课程对象
     */
    @Autowired
    public ClassCoursesController(ClassCoursesService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> mapclass_class_number = new HashMap<>();
        mapclass_class_number.put("class_class_number",String.valueOf(paramMap.get("class_class_number")));
        List listclass_class_number = service.selectBaseList(service.select(mapclass_class_number, new HashMap<>()));
        if (listclass_class_number.size()>0){
            return error(30000, "字段班级课号内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}
