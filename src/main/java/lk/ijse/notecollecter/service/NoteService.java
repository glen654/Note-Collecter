package lk.ijse.notecollecter.service;

import lk.ijse.notecollecter.dto.NoteStatus;
import lk.ijse.notecollecter.dto.impl.NoteDTO;

import java.util.List;

public interface NoteService {
    void saveNote(NoteDTO noteDTO);

    List<NoteDTO> getAllNotes();

    NoteStatus getNote(String noteId);

    void deleteNote(String noteId);

    void updateNote(String noteId,NoteDTO noteDTO);
}
