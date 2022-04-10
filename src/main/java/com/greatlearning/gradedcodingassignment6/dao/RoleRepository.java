package com.greatlearning.gradedcodingassignment6.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.gradedcodingassignment6.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}