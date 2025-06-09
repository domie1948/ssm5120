package com.project.demo.controller;

import com.project.demo.entity.SubjectiveQuestionBank;
import com.project.demo.service.SubjectiveQuestionBankService;
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
 * 主观题库：(SubjectiveQuestionBank)表控制层
 *
 */
@RestController
@RequestMapping("/subjective_question_bank")
public class SubjectiveQuestionBankController extends BaseController<SubjectiveQuestionBank, SubjectiveQuestionBankService> {

    /**
     * 主观题库对象
     */
    @Autowired
    public SubjectiveQuestionBankController(SubjectiveQuestionBankService service) {
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
