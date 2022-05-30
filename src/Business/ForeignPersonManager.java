package Business;

import Business.Abstract.ApplicantInterface;
import Entities.Person;

import java.util.List;

public class ForeignPersonManager implements ApplicantInterface {
    @Override
    public void applyForMask(Person person) {

    }

    @Override
    public boolean checkPerson(Person person) {
        // TODO mernis kontrolü yapılacak.
        return false;
    }

    @Override
    public List<Person> getList() {
        return null;
    }
}
