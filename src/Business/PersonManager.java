package Business;

import Business.Abstract.ApplicantInterface;
import Entities.Person;

import java.util.List;

// Wrapper gibi davranıyor -- Facade Design Pattern gibi galiba
public class PersonManager implements ApplicantInterface {
    @Override
    public void applyForMask(Person person) {

    }

    @Override
    public boolean checkPerson(Person person) {
        // TODO mernis kontrolü yapılacak.
        return true;
    }

    @Override
    public List<Person> getList() {
        return null;
    }
}
