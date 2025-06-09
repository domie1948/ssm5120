package com.project.demo.controller;

import com.project.demo.entity.ReviewInformation;
import com.project.demo.service.ReviewInformationService;
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
 * 批阅信息：(ReviewInformation)表控制层
 *
 */
@RestController
@RequestMapping("/review_information")
public class ReviewInformationController extends BaseController<ReviewInformation, ReviewInformationService> {

    /**
     * 批阅信息对象
     */
    @Autowired
    public ReviewInformationController(ReviewInformationService service) {
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
