package com.luv2code.ecommerce.controller;


import com.luv2code.ecommerce.dto.RegisterResponse;
import com.luv2code.ecommerce.dto.Registration;
import com.luv2code.ecommerce.service.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    private LoginService loginService;

    public LoginController(LoginService loginService){
        this.loginService = loginService;
    }

    @PostMapping("/isUserExist")
    public RegisterResponse isUserExist(@RequestBody Registration register){
        RegisterResponse registerResponse = loginService.isUserExist(register);
        return registerResponse;
    }
}

