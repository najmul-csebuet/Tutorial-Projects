package com.onssoftware.SpringBootTutorial.DataJpa.Annotations.OneToOne;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("OneToOne")
public class InitDbOneToOne {
    @Bean
    public CommandLineRunner oneToOneMappingDemo(UserRepository userRepository, AddressRepository addressRepository) {
        return args -> {
/*            // create an user instance
            User user = new User("John Doe", "john.doe@example.com", "1234abcd");

            // create an address instance
            Address address = new Address("Lake View 321", "Berlin", "Berlin",
                    "95781", "DE");

            // set child reference
            address.setUser(user);

            // set parent reference
            user.setAddress(address);

            // save the parent
            // which will save the child (address) as well
            userRepository.save(user);*/

            User user1 = userRepository.findAll().get(0);
            userRepository.delete(user1);
            //Address address1 = addressRepository.findAll().get(0);
            System.out.println();
        };
    }

//    @Bean
    public CommandLineRunner oneToOneMappingDemo1(UserRepository userRepository, AddressRepository addressRepository) {
        return args -> {
            // create an user instance
            User user = new User("John Doe", "john.doe@example.com", "1234abcd");
            userRepository.save(user);

            // create an address instance
            Address address = new Address("Lake View 321", "Berlin", "Berlin",
                    "95781", "DE");

            // set child reference
            address.setUser(user);
            addressRepository.save(address);
        };
    }
}
