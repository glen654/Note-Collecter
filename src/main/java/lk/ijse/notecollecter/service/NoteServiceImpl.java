package lk.ijse.notecollecter.service;

import lk.ijse.notecollecter.dto.impl.NoteDTO;
import lk.ijse.notecollecter.util.AppUtil;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class NoteServiceImpl implements NoteService{
    private static List<NoteDTO> noteDTOList = new ArrayList<>();

    NoteServiceImpl(){
        noteDTOList.add(
                new NoteDTO("NOTE-7146c4ab-c3cf-4ca6-bb2b-ae3371135362",
                        "Python",
                        "Python Test",
                        "20240914",
                        "P1",
                        "1"));

        noteDTOList.add(new NoteDTO("NOTE-7246c4ab-c3cf-4ca6-bb2b-ae3371135362",
                "Js",
                "Js Test",
                "20240914",
                "P1",
                "2"));
    }
    @Override
    public NoteDTO saveNote(NoteDTO noteDTO) {
        noteDTO.setNoteId(AppUtil.generateNoteId());
        return noteDTO;
    }

    @Override
    public List<NoteDTO> getAllNotes() {
        return noteDTOList;
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
