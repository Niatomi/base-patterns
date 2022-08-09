package ru.niatomi.factory;

import ru.niatomi.factory.classes.developers.Developer;
import ru.niatomi.factory.classes.factory.DeveloperFactory;
import ru.niatomi.factory.classes.factory.Impl.CppDeveloperFactory;
import ru.niatomi.factory.classes.factory.Impl.JavaFactoryFactory;

/**
 * @author niatomi
 */
public class Main {

    public static void main(String[] args) {

        DeveloperFactory developerBySpeciality = createDeveloperBySpeciality("123");

        Developer developer = developerBySpeciality.createDeveloper();

        developer.writeCode();

    }

    static DeveloperFactory createDeveloperBySpeciality(String speciality) {

        if (speciality.equalsIgnoreCase("java")) {
            return new JavaFactoryFactory();
        }

        if (speciality.equalsIgnoreCase("cpp")) {
            return new CppDeveloperFactory();
        }

        throw new RuntimeException("We don't have this kind developers");
    }

}
