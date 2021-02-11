package com.mateuszjanczak.authservice.authservice.repository;

import com.mateuszjanczak.authservice.authservice.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
