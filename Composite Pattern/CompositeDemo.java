/**
 * Created by dulun on 22.11.2016.
 */
public class CompositeDemo {

    public static void main(String[] args) {

        Email allEmails = new GroupEmail("ADMIN", "admin@gtu.edu.tr");

        Email e = new GroupEmail("Bilgisayar Muh","bilmuh@gtu.edu.tr");
        Email e2 = new GroupEmail("Matematik", "math@gtu.edu.tr");
        Email e3 = new GroupEmail("Elektronik Muh","elmuh@gtu.edu.tr");
        Email e4 = new GroupEmail("Math1th", "math1th@gtu.edu.tr");

        allEmails.addEmail(e);
        allEmails.addEmail(e2);
        allEmails.addEmail(e3);

        e.addEmail(new PersonalEmail("Emre", "Dulundu", "emredulundu@gtu.edu.tr"));
        e.addEmail(new PersonalEmail("Hakan", "Osturk", "hakanosturk@gtu.edu.tr"));

        e2.addEmail(new PersonalEmail("Ali", "Yilmaz", "aliyilmaz@gtu.edu.tr"));
        e2.addEmail(new PersonalEmail("Mehmet", "Sahin", "mehmetsahin@gtu.edu.tr"));

        allEmails.addEmail(new PersonalEmail("Dursun", "Sonmez", "dursunsonmez@gtu.edu.tr"));

        e2.addEmail(e4);
        e4.addEmail(new PersonalEmail("Yasin", "Cayir", "yasincayir@gtu.edu.tr"));

        AddressBook book = new AddressBook(allEmails);
        book.printOn();
    }
}
