package com.fategrandorder.services;

import com.fategrandorder.dao.UserDAO;
import com.fategrandorder.model.SecUserDetails;
import com.fategrandorder.model.UserModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserAuthenticationService implements UserDetailsService {

    @Autowired
    private UserDAO userDAO = new UserDAO();

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel user = new UserModel();
        user = this.userDAO.findUserByUserName(username);
        if (user == null)
            throw new UsernameNotFoundException(username);
        else {
            UserDetails details = new SecUserDetails(user);
            return details;
        }
    }
}
