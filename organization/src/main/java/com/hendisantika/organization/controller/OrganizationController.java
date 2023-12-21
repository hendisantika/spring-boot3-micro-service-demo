package com.hendisantika.organization.controller;

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
 * Time: 06:16
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping(value = "/api/v1/organization")
public class OrganizationController {

    @GetMapping(value = "/hello/{name}")
    private String getHalloOrganization(@PathVariable("name") String name) {
        return "Hello " + name;
    }
}
