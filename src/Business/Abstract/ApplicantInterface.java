package Business.Abstract;

import Entities.Person;

import java.util.List;

public interface ApplicantInterface {
    void applyForMask(Person person);

    boolean checkPerson(Person person);

    List<Person> getList();
}
