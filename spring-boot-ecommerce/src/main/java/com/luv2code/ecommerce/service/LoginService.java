package com.luv2code.ecommerce.service;

import com.luv2code.ecommerce.dto.RegisterResponse;
import com.luv2code.ecommerce.dto.Registration;

public interface LoginService {
    RegisterResponse isUserExist(Registration registration);
}
