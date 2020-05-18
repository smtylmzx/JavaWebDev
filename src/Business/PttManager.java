package Business;

import Business.Abstract.ApplicantInterface;
import Business.Abstract.SupplierInterface;
import Entities.Person;

public class PttManager implements SupplierInterface {
    private final ApplicantInterface applicantInterface;

    public PttManager(ApplicantInterface applicantInterface) {
        this.applicantInterface = applicantInterface;
    }

    public void giveMask(Person person){
        if (applicantInterface.checkPerson(person)){
            System.out.println(person.getFirstName() + " için maske verildi");
        }
    }
}
