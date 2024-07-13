package org.jd14.service.impl;

import lombok.RequiredArgsConstructor;
import org.jd14.dao.NoteDAO;
import org.jd14.model.Note;
import org.jd14.service.NoteService;


import java.util.List;


@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService {
    private final NoteDAO noteDAO;

    public NoteServiceImpl(NoteDAO noteDAO) {
        this.noteDAO = noteDAO;
    }

    @Override
    public List<Note> listAll() {
        return noteDAO.listAll();
    }

    @Override
    public Note add(Note note) {
        return noteDAO.add(note);
    }

    @Override
    public void deleteById(long id) {
        noteDAO.deleteById(id);
    }

    @Override
    public void update(Note note) {
        noteDAO.update(note);
    }

    @Override
    public Note getById(long id) {
        return noteDAO.getById(id).orElseThrow(IllegalArgumentException::new);
    }
}
