package com.at.onlinecatalog.config;

import com.at.onlinecatalog.config.CustomUserDetails;
import com.at.onlinecatalog.model.User;
import com.at.onlinecatalog.repository.UserRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
@Getter
public class DatabaseUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    @Autowired
    public DatabaseUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)    //trying to find a user in the database, if its the good one then take it out
                .orElseThrow(()-> new UsernameNotFoundException(username)); //if its not the good one then throw an exception
        return new CustomUserDetails(user);
    }
}
