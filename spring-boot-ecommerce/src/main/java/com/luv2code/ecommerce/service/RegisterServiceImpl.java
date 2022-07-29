package com.luv2code.ecommerce.service;

import com.luv2code.ecommerce.dao.RegisterRepository;
import com.luv2code.ecommerce.dto.RegisterResponse;
import com.luv2code.ecommerce.dto.Registration;
import com.luv2code.ecommerce.entity.Register;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class RegisterServiceImpl implements RegisterService {

    private RegisterRepository registerRepository;

    public RegisterServiceImpl(RegisterRepository registerRepository){
        this.registerRepository = registerRepository;
    }
    @Override
    @Transactional
    public RegisterResponse addNewRegister(Registration registration) {

        Register newRegister = registration.getRegister();
        RegisterResponse registerResponse = new RegisterResponse(newRegister);

        // check if this is an existing register
        String theEmail = newRegister.getEmail();
        Register registerFromDB = registerRepository.findByEmail(theEmail);

        // don't save the email if exist
        if(registerFromDB != null) {
            registerResponse.setMsg("Please Choose different email");
            return registerResponse;
        }

        // email doesn't exist yes, store hem in the db
        registerRepository.save(newRegister);

        return registerResponse;
    }

//    @Override
//    public RegisterResponse isUserExist(Registration registration) {
//
//        Register newRegister = registration.getRegister();
//
//        boolean passwordMatched = false;
//
//        // check if this is an existing register
//        String theEmail = newRegister.getEmail();
//        Register registerFromDB = registerRepository.findByEmail(theEmail);
//
//        RegisterResponse registerResponse = new RegisterResponse(registerFromDB);
//
//        // if exist in DB check if password matches
//        if(registerFromDB != null) {
//            passwordMatched = newRegister.getPassword().equals(registerFromDB.getPassword());
//        }
//        else{
//            registerResponse.setMsg("The email doesn't exist");
//        }
//        if(registerFromDB != null && !passwordMatched)
//            registerResponse.setMsg("Wrong password");
//
//        return registerResponse;
//    }



}
