/**
 * Created by dulun on 22.11.2016.
 */
public interface Email {

    String getName();
    
    String getSurname();
    
    String getEmail();
       
    boolean addEmail(Email e);

    boolean removeEmail(Email e);

    void printOn(int i);
    
    String printForGui();
}
