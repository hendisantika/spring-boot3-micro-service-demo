package com.hendisantika.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot3-micro-service-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/8/23
 * Time: 07:57
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping(value = "/api/v1/employee")
public class EmployeeController {

    @GetMapping(value = "/hallo")
    public String getHalloEmployee(@RequestParam("name") String name) {
        return "Hello " + name;
    }
}
