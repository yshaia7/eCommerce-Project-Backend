package com.luv2code.ecommerce.controller;

import com.luv2code.ecommerce.dto.RegisterResponse;
import com.luv2code.ecommerce.entity.Register;
import com.luv2code.ecommerce.service.RegisterService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/register")
public class RegisterController {

    private RegisterService registerService;

    public RegisterController(RegisterService registerService){
        this.registerService = registerService;
    }

    @PostMapping("/addNewRegister")
    public RegisterResponse addNewRegister(@RequestBody Register register){
        RegisterResponse registerResponse = registerService.addNewRegister(register);
        return registerResponse;
    }
}
