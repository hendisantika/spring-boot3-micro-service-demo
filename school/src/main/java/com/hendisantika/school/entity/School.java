package com.hendisantika.school.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot3-micro-service-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/6/23
 * Time: 17:15
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class School {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String email;
}
