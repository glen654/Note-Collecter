package lk.ijse.notecollecter.service.impl;

import lk.ijse.notecollecter.dao.UserDao;
import lk.ijse.notecollecter.dto.impl.UserDTO;
import lk.ijse.notecollecter.entity.impl.UserEntity;
import lk.ijse.notecollecter.service.UserService;
import lk.ijse.notecollecter.util.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private Mapping mapping;
    @Override
    public UserDTO saveUser(UserDTO userDTO) {
       return mapping.toUserDTO(userDao.save(mapping.toUserEntity(userDTO)));
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<UserEntity> allUsers = userDao.findAll();
        return mapping.asUserDTOList(allUsers);
    }

    @Override
    public UserDTO getUser(String userId) {
        UserEntity selectedUser = userDao.getReferenceById(userId);
        return mapping.toUserDTO(selectedUser);
    }

    @Override
    public void deleteUser(String userId) {
        userDao.deleteById(userId);
    }

    @Override
    public boolean updateUser(String userId, UserDTO userTO) {
        return false;
    }
}
