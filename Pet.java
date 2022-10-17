package OtherClasses;

import Interfaces.Birthable;

public class Pet implements Birthable {

    private String Name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        Name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return Name;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
