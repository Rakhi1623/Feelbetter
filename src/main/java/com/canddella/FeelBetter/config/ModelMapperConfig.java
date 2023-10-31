package com.canddella.FeelBetter.config;
import com.canddella.FeelBetter.dto.RegistrationDto;
import com.canddella.FeelBetter.entity.User;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper(){
        /*ModelMapper modelMapper = new ModelMapper();

        modelMapper.addMappings(new PropertyMap<RegistrationDto, User>() {
            @Override
            protected void configure() {
                map().setName(source.getFirstName());
            }
        });*/
        return  new ModelMapper();
    }
}


