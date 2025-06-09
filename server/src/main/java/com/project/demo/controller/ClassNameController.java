package com.project.demo.controller;

import com.project.demo.entity.ClassName;
import com.project.demo.service.ClassNameService;
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
 * 班级名称：(ClassName)表控制层
 *
 */
@RestController
@RequestMapping("/class_name")
public class ClassNameController extends BaseController<ClassName, ClassNameService> {

    /**
     * 班级名称对象
     */
    @Autowired
    public ClassNameController(ClassNameService service) {
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
