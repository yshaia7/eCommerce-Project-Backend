package com.luv2code.ecommerce.service;

import com.luv2code.ecommerce.dao.RegisterRepository;
import com.luv2code.ecommerce.dto.RegisterResponse;
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
    public RegisterResponse addNewRegister(Register register) {

        Register newRegister = new Register();
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("register.getId() " + register.getId());
        System.out.println("register.getEmail() " + register.getEmail());
        System.out.println("register.getPassword() " + register.getPassword());
        System.out.println("register.getDateCreated() " + register.getDateCreated());
        System.out.println("===============================");
        System.out.println("===============================");
        newRegister.setId(register.getId());
        newRegister.setEmail(register.getEmail());
        newRegister.setPassword(register.getPassword());
        newRegister.setDateCreated(register.getDateCreated());

        // save to the database
//        registerRepository.save(newRegister);

        // return a response
        return new RegisterResponse(newRegister);
    }

}
