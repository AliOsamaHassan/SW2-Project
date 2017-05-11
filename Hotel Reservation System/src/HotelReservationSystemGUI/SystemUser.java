
import java.util.Date;

public abstract class SystemUser {

    protected String firstName;

    protected String lastName;

    protected Long SSN;

    protected Date dateOfBirth;

    protected int age;

    protected String Password;

    protected String userName;

    protected String address;

    protected String phone;

    protected String Country;

    protected Comment comment;

    public String login(String userName, String password) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void logOut() {
    }
}
