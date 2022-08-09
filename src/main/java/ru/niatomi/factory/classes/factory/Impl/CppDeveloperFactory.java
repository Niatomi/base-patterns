package ru.niatomi.factory.classes.factory.Impl;

import ru.niatomi.factory.classes.developers.Developer;
import ru.niatomi.factory.classes.developers.Impl.CppDeveloper;
import ru.niatomi.factory.classes.factory.DeveloperFactory;

/**
 * @author niatomi
 */
public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
