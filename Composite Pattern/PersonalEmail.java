
import java.util.Objects;
import java.util.StringTokenizer;

/**
 * Created by dulun on 22.11.2016.
 */
public class PersonalEmail implements Email{

    private String name = null;

    private String surname = null;

    private String emailAddress = null;

    public PersonalEmail(String name, String surname, String emailAddress){

        StringTokenizer token = new StringTokenizer(emailAddress, "@");
        token.nextToken();
        String temp = name.toLowerCase() + surname.toLowerCase() + "@" + token.nextToken();
        if(temp.equalsIgnoreCase(emailAddress)){
            this.name = name;
            this.surname = surname;
            this.emailAddress = emailAddress;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getEmail() {
        return emailAddress;
    }
 
    @Override
    public boolean addEmail(Email e) {
        throw new UnsupportedOperationException("Personal Email unsupported operation addEmail");
    }

    @Override
    public boolean removeEmail(Email e) {
        throw new UnsupportedOperationException("Personal Email unsupported operation removeEmail");
    }
    
    @Override
    public void printOn(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
        System.out.println(emailAddress + " ," + name + " " + surname);
    }
    
    @Override
    public String printForGui(){
        return emailAddress + " ," + name + " " + surname + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PersonalEmail other = (PersonalEmail) obj;
        
        if (!Objects.equals(this.emailAddress, other.emailAddress)) {
            return false;
        }
        return true;
    }

}
