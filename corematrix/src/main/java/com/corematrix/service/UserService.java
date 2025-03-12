package com.corematrix.service;

import com.corematrix.entity.Users;
import com.corematrix.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private JWTService jwtService;

    @Autowired
    AuthenticationManager authManager;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public Users saveUser(Users user){
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepo.save(user);
    }

    public String Verify(Users user){
        Authentication authentication = authManager.authenticate(new UsernamePasswordAuthenticationToken( user.getUsername(),user.getPassword()));

        if(authentication.isAuthenticated())
            return jwtService.generateToken(user.getUsername());
        return "fail";
    }
}
