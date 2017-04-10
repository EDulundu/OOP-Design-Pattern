import java.awt.*;

/**
 * Created by dulun on 23.11.2016.
 */
public class AddressBook {

    private Email allEmails;

    public AddressBook(Email allEmails){
        this.allEmails = allEmails;
    }

    public void printOn(){
        allEmails.printOn(0);
    }
    
    public String printForGui(){
        return allEmails.printForGui();
    }
}
