package lk.ijse.notecollecter.service;

import lk.ijse.notecollecter.dto.impl.NoteDTO;

import java.util.List;

public class NoteServiceImpl implements NoteService{
    @Override
    public String saveNote(NoteDTO noteDTO) {
        return null;
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
