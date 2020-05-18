import Business.PersonManager;
import Business.PttManager;
import Entities.Person;

public class MainClass {
    public static void main(String[] args){
        Person person = new Person();
        person.setFirstName("Samet");
        person.setLastName("Yılmaz");
        person.setDateOfBirth(0);
        person.setIdNumber("");

        PttManager pttManager = new PttManager(new PersonManager());
        pttManager.giveMask(person);
    }
}
