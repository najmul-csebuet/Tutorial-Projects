package com.onssoftware.SpringBootTutorial.DataJpa.Annotations.OneToOne;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
