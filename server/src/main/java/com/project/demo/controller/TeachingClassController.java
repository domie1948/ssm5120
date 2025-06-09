package com.project.demo.controller;

import com.project.demo.entity.TeachingClass;
import com.project.demo.service.TeachingClassService;
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
 * 授课班级：(TeachingClass)表控制层
 *
 */
@RestController
@RequestMapping("/teaching_class")
public class TeachingClassController extends BaseController<TeachingClass, TeachingClassService> {

    /**
     * 授课班级对象
     */
    @Autowired
    public TeachingClassController(TeachingClassService service) {
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
