package ru.niatomi.factory.classes.factory.Impl;

import ru.niatomi.factory.classes.developers.Developer;
import ru.niatomi.factory.classes.developers.Impl.JavaDeveloper;
import ru.niatomi.factory.classes.factory.DeveloperFactory;

/**
 * @author niatomi
 */
public class JavaFactoryFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
