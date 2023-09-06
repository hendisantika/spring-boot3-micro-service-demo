package com.hendisantika.department.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot3-micro-service-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/7/23
 * Time: 06:26
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping(value = "/api/v1/department")
public class DepartmentController {

    @GetMapping(value = "/hallo/{name}")
    public String getHalloDepartment(@PathVariable("name") String name) {
        return "hallo " + name;
    }

}
