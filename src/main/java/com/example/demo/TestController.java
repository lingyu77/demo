/*
 * Copyright (C) 2022 Digital River, Inc. All Rights Reserved.
 */
package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:lychen@digitalriver.com">Kelly Chen</a>
 */
@RestController
final class TestController {

    public UsersRepository usersRepository;


    TestController(final UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        final Iterable<Users> result = this.usersRepository.findAll();
        System.out.println(result);
        return ResponseEntity.ok("good");
    }
}
