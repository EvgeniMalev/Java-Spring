
package com.paintingscollectors.service;

import com.paintingscollectors.model.dto.RegisterDTO;
import com.dictionaryapp.model.dto.UserDTO;
import com.paintingscollectors.model.entity.User;

public interface UserService {


     UserDTO findUserByUsername(String username);

     UserDTO findUserByEmail(String email) ;

     boolean checkCredentials(String username, String password);

    void initAdmin();

    void initTest();

    User register(RegisterDTO registerDTO);

    User findByUsername(String username);

    User findByEmail(String email);
}
