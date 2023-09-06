package com.hendisantika.school.entity;

import lombok.*;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot3-micro-service-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/6/23
 * Time: 17:13
 * To change this template use File | Settings | File Templates.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private String firstname;
    private String lastname;
    private String email;
}
