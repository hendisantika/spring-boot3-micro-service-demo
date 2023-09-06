package com.hendisantika.student.service;

import com.hendisantika.student.entity.Student;
import com.hendisantika.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot3-micro-service-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/6/23
 * Time: 19:12
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;


    public void saveStudent(Student student) {
        studentRepository.save(student);
    }
}
