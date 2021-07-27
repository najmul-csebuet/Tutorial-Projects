package com.onssoftware.SpringBootTutorial.DataJpa.Annotations.OneToOne;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class InitDbOneToOne {
    @Bean
    public CommandLineRunner oneToOneMappingDemo(UserRepository userRepository) {
        return args -> {

/*            // create a user instance
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
        };
    }
}
