package com.canddella.FeelBetter.service.impl;


import com.canddella.FeelBetter.dto.RegistrationDto;
import com.canddella.FeelBetter.entity.Customer;
import com.canddella.FeelBetter.entity.Role;
import com.canddella.FeelBetter.entity.User;
import com.canddella.FeelBetter.entity.UserRole;
import com.canddella.FeelBetter.repositary.CustomerRepository;
import com.canddella.FeelBetter.repositary.RoleRepository;
import com.canddella.FeelBetter.repositary.UserRepository;
import com.canddella.FeelBetter.repositary.UserRoleRepository;
import com.canddella.FeelBetter.service.RegistrationService;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegistrationServiceImpl implements RegistrationService {


    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
   private UserRoleRepository userRoleRepository;
    @Autowired
    private CustomerRepository customerRepository;
@Autowired
private ModelMapper modelMapper;

    @Override
    public String register(RegistrationDto registrationDto) {



    /*    modelMapper.addMappings(new PropertyMap<RegistrationDto, User>() {
            @Override
            protected void configure() {
                map().setName(source.getFirstName());
            }
        });*/
        User user = modelMapper.map(registrationDto, User.class);

        user = userRepository.save(user);

        Role role = new Role();
      if (registrationDto.getName().equals("Admin")){
             role = roleRepository.findByName("Admin");
      }
       else if (registrationDto.getName().equals("User")){
           role = roleRepository.findByName("User");
      }
        Customer customer = modelMapper.map(registrationDto, Customer.class);
       customer.setUser(user);
        customer = customerRepository.save(customer);


        UserRole userRole = new UserRole();

        userRole.setRole(role);
        userRole.setUser(user);
        userRole = userRoleRepository.save(userRole);

        return "Sucessfully Registred";
    }




}
