package lk.ijse.notecollecter.service;

import lk.ijse.notecollecter.dto.impl.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO saveUser(UserDTO userDTO);

    List<UserDTO> getAllUsers();

    UserDTO getUser(String userId);

    void deleteUser(String userId);

    boolean updateUser(String userId,UserDTO userTO);
}
