package lk.ijse.notecollecter.entity.impl;

import lk.ijse.notecollecter.dto.impl.NoteDTO;
import lk.ijse.notecollecter.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserEntity implements SuperEntity {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String profilePic;
    private List<NoteDTO> notes;
}
