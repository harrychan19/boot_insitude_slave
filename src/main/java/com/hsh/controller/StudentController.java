package com.hsh.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hsh.dubbo.StudentDubboService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hushihai
 * @version V1.0, 2018/11/9
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Reference
    StudentDubboService studentDubboService;

    @GetMapping(value = "/dubboTest")
    public void dubboTest (){
        studentDubboService.sayHello();
    }
}
