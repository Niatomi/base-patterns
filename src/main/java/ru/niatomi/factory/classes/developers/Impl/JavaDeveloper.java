package ru.niatomi.factory.classes.developers.Impl;

import ru.niatomi.factory.classes.developers.Developer;

/**
 * @author niatomi
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Developer writes Java code");
    }
}
