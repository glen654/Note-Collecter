package lk.ijse.notecollecter.service;

import lk.ijse.notecollecter.dto.UserStatus;
import lk.ijse.notecollecter.dto.impl.UserDTO;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO userDTO);

    List<UserDTO> getAllUsers();

    UserStatus getUser(String userId);

    void deleteUser(String userId);

    void updateUser(String userId,UserDTO userDTO);
}
