import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * Created by dulun on 22.11.2016.
 */
public class GroupEmail implements Email{

    private String name = null;

    private String emailAddress = null;

    private List<Email> emailList = null;

    public GroupEmail(String name, String emailAddress){
        this.name = name;
        this.emailAddress = emailAddress;
        emailList = new ArrayList<Email>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return emailAddress;
    }
    
    @Override
    public String getSurname(){
        throw new UnsupportedOperationException("Group Email unsupported operation getSurname");
    }
    
    @Override
    public boolean addEmail(Email e){

        if(e == null)
            return false;

        if(!emailList.contains(e))
            return emailList.add(e);

        return false;
    }

    @Override
    public boolean removeEmail(Email e){

        if(e == null)
            return false;

        return emailList.remove(e);
    }

    @Override
    public void printOn(int i){
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
        System.out.println(emailAddress + " ," + name);
        for(Email e : emailList){
            e.printOn(i+1);
        }
    }

    @Override
    public String printForGui(){
        
        String str = emailAddress + " ," + name + "\n";
        Iterator iter = emailList.iterator();
        while(iter.hasNext()){
            Email e = (Email)iter.next();
            str += e.printForGui();
        }
        
        return str;
    }  
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GroupEmail other = (GroupEmail) obj;
        
        if (!Objects.equals(this.emailAddress, other.emailAddress)) {
            return false;
        }
        return true;
    }   
}
