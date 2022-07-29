package com.luv2code.ecommerce.service;

import com.luv2code.ecommerce.dto.RegisterResponse;
import com.luv2code.ecommerce.entity.Register;

public interface RegisterService {

    RegisterResponse addNewRegister(Register register);
}
