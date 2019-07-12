package com.smartdiscover.memento;

import java.util.ArrayList;

public class Notepad {

    private long id;
    private String fileName = "untitled";
    private String content;

    private NotepadMemento memento = new NotepadMemento();

    public Notepad(long id) {
        super();
        this.id = id;
    }

    public Notepad(long id, String fileName, String content) {
        super();
        this.id = id;
        this.fileName = fileName;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ArrayList<Notepad> getNotepadCache() {
        return this.memento.getNotepadCache();
    }

    public void undo() {

        if(this.memento.getNotepadCache().size() >= 2){
            Notepad lastEntry = this.memento.getNotepadCache().get(this.memento.getNotepadCache().size()-2);

            this.id = lastEntry.getId();
            this.fileName = lastEntry.getFileName();
            this.content = lastEntry.getContent();

            this.memento.getNotepadCache().remove(this.memento.getNotepadCache().size()-1);
        }

    }

    public void saveNotepadEntry() {
        Notepad notepad = new Notepad(this.id, this.fileName, this.content);
        this.memento.getNotepadCache().add(notepad);
    }

    @Override
    public String toString() {
        return "Notepad [id=" + id + ", fileName=" + fileName + ", content=" + content + "]";
    }
}
