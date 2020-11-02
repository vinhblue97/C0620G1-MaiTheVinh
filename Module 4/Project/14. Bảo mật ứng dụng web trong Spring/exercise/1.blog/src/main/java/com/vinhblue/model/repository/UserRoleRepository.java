package com.vinhblue.model.repository;

import com.vinhblue.model.entity.AppRole;
import com.vinhblue.model.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    AppRole findByUserRoleName(String roleName);
}
