package com.simplilearn.MedicareSystem.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.simplilearn.MedicareSystem.Model.CustomUserDetail;
import com.simplilearn.MedicareSystem.Model.User;
import com.simplilearn.MedicareSystem.Repository.UserRepository;

public class CustomUserDetailService implements UserDetailsService{
	
	@Autowired
	UserRepository userRepository;
	
	
	
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{
		Optional<User> user = userRepository.findUserByEmail(email);
		user.orElseThrow(() ->  new UsernameNotFoundException("invalid user"));
		return user.map(CustomUserDetail::new).get();
	}

}
