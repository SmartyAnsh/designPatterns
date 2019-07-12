package com.smartdiscover.memento;

import java.util.ArrayList;

public final class NotepadMemento {

    private ArrayList<Notepad> notepadCache;

    public NotepadMemento() {
        this.notepadCache = new ArrayList<>();
    }

    public ArrayList<Notepad> getNotepadCache() {
        return notepadCache;
    }

    public void setNotepadCache(ArrayList<Notepad> notepadCache) {
        this.notepadCache = notepadCache;
    }
}
