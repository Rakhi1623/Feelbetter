package com.canddella.FeelBetter.service.impl;


import com.canddella.FeelBetter.entity.Customer;
import com.canddella.FeelBetter.entity.User;
import com.canddella.FeelBetter.repositary.CustomerRepository;
import com.canddella.FeelBetter.repositary.UserRepository;
import com.canddella.FeelBetter.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Boolean login(String username, String password) {
        /*customerRepository.findById()*/
        Boolean result = false;
        if(userRepository.existsByUsername(username) && userRepository.existsByPassword(password)) {
            result = true;
            User user = userRepository.findByUsername( username );
            System.out.println(user);

            Long customerId = user.getCustomer().getCustomerId();
            System.out.println(customerId);
            Customer customer = user.getCustomer();
           /* System.out.println(customer);*/

            // put this customer object into HttpSession
        }


        return result;

    }
    public long getCustomerId(String username)
    {
        return 0;
    }

    @Override
    public User findUserByName(String username) {
        User user = userRepository.findByUsername( username );
        return user;
    }


}
