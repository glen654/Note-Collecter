package lk.ijse.notecollecter.controller;

import lk.ijse.notecollecter.dto.impl.NoteDTO;
import lk.ijse.notecollecter.service.NoteService;
import lk.ijse.notecollecter.service.NoteServiceImpl;
import lk.ijse.notecollecter.util.AppUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/notes")
public class NoteController {
    @Autowired
    private NoteService noteService;
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public NoteDTO saveNote(@RequestBody NoteDTO noteDTO){
       return noteService.saveNote(noteDTO);
    }

    public NoteDTO getSelectedNote(){
        return null;
    }

    public List<NoteDTO> getAllNotes(){
        return null;
    }

    public void deleteNote(String noteId){

    }

    public void updateNote(String noteId,NoteDTO noteDTO){

    }

}
