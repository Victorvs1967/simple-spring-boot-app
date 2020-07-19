package com.vvs.web.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vvs.web.app.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {

}
