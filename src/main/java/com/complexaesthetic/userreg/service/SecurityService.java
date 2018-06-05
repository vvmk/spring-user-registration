package com.complexaesthetic.userreg.service;

/**
 * project: user-reg
 * package: com.complexaesthetic.userreg.service
 * author: https://github.com/vvmk
 * date: 6/4/18
 */
public interface SecurityService {
    String findLoggedInUsername();
    void autologin(String username, String password);
}
