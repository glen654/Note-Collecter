package lk.ijse.notecollecter.entity.impl;

import lk.ijse.notecollecter.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NoteEntity implements SuperEntity {
    private String noteId;
    private String noteTitle;
    private String noteDesc;
    private String createdDate;
    private String priorityLevel;
    private String userId;
}
