package com.hendisantika.school.repository;

import com.hendisantika.school.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot3-micro-service-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/6/23
 * Time: 17:14
 * To change this template use File | Settings | File Templates.
 */
public interface SchoolRepository extends JpaRepository<School, Integer> {
}
