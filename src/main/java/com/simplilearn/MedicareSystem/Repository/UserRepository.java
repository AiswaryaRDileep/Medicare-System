package com.simplilearn.MedicareSystem.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.simplilearn.MedicareSystem.Model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	Optional<User> findUserByEmail(String email);
	

}
