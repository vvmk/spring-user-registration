package com.complexaesthetic.userreg.repo;

import com.complexaesthetic.userreg.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * project: user-reg
 * package: com.complexaesthetic.userreg.repo
 * author: https://github.com/vvmk
 * date: 6/4/18
 */

public interface RoleRepository extends JpaRepository<Role, Long> {
}
