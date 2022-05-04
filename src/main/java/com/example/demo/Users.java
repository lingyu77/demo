/*
 * Copyright (C) 2022 Digital River, Inc. All Rights Reserved.
 */
package com.example.demo;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.Instant;

/**
 * @author <a href="mailto:lychen@digitalriver.com">Kelly Chen</a>
 */
@Data
public class Users {

    @Id
    private Integer id;

    private String acct;

    private String pwd;

    private String fullname;

    private Instant create_at;

    private Instant update_at;
}
