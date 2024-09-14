package lk.ijse.notecollecter.controller;


import lk.ijse.notecollecter.dto.impl.UserDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDTO saveUser(@RequestPart ("firstName") String firstName,
                            @RequestPart ("lastName") String lastName,
                            @RequestPart ("email") String email,
                            @RequestPart ("password") String password,
                            @RequestPart ("profilePic") String profilePic

    ){
        //TODO:ProfilePic ------> Base64

        //TODO:User ID Generate
        //TODO:Build The Object

    }
}
