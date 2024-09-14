package lk.ijse.notecollecter.service;

import lk.ijse.notecollecter.dto.impl.NoteDTO;
import lk.ijse.notecollecter.util.AppUtil;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NoteServiceImpl implements NoteService{
    @Override
    public NoteDTO saveNote(NoteDTO noteDTO) {
        noteDTO.setNoteId(AppUtil.generateNoteId());
        return noteDTO;
    }

    @Override
    public List<NoteDTO> getAllNotes() {
        return null;
    }

    @Override
    public NoteDTO getNote(String noteId) {
        return null;
    }

    @Override
    public boolean deleteNote(String noteId) {
        return false;
    }

    @Override
    public boolean updateNote(String noteId,NoteDTO noteDTO) {
        return false;
    }
}
