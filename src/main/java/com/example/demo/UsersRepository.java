/*
 * Copyright (C) 2022 Digital River, Inc. All Rights Reserved.
 */
package com.example.demo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author <a href="mailto:lychen@digitalriver.com">Kelly Chen</a>
 */
@RepositoryRestResource(path = "users")
public interface UsersRepository extends CrudRepository<Users, Integer> {

    Users findByFullname(@Param("fullname")String fullname); // post update???

}
