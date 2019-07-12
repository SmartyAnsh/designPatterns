package com.smartdiscover.memento;

import org.junit.Assert;
import org.junit.Test;

public class MementoTest {

    @Test
    public void mementoTest() {

        Notepad notepad = new Notepad(1);

        notepad.saveNotepadEntry();

        System.out.println(notepad);

        assert notepad.getNotepadCache().size() == 1;

        notepad.setFileName("Memento.txt");
        notepad.setContent("Memento design pattern is used when state of object is often changed");

        notepad.saveNotepadEntry();

        System.out.println(notepad);

        assert notepad.getNotepadCache().size() == 2;

        notepad.setContent("Memento design pattern is used when state of object is often changed and restores the state of object to the previous state.");

        notepad.saveNotepadEntry();

        System.out.println(notepad);

        assert notepad.getNotepadCache().size() == 3;

        notepad.undo();

        System.out.println(notepad);

        assert notepad.getNotepadCache().size() == 2;
        Assert.assertEquals(notepad.getContent(),"Memento design pattern is used when state of object is often changed");

        notepad.undo();

        System.out.println(notepad);
        notepad.undo();

        System.out.println(notepad);

        assert notepad.getId() == 1;

    }

}
