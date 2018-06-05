package com.complexaesthetic.userreg.service;

import com.complexaesthetic.userreg.domain.User;

/**
 * project: user-reg
 * package: com.complexaesthetic.userreg.service
 * author: https://github.com/vvmk
 * date: 6/4/18
 */

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
