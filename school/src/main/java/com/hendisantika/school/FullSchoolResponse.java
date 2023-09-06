package com.hendisantika.school;

import com.hendisantika.school.entity.Student;
import lombok.*;

import java.util.List;

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
public class FullSchoolResponse {

    List<Student> students;
    private String name;
    private String email;
}
