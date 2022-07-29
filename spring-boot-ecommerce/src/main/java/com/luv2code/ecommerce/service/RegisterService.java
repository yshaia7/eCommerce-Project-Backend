package com.luv2code.ecommerce.service;

import com.luv2code.ecommerce.dto.RegisterResponse;
import com.luv2code.ecommerce.dto.Registration;

public interface RegisterService {

    RegisterResponse addNewRegister(Registration registration);
   // RegisterResponse isUserExist(Registration registration);
}
