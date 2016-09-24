package April;

/**
 * Created by yuliu on 4/29/16.
 */
public class Employee {
    private int id;
    private String firstname;
    private String lastname;

    public Employee() {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }



    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void updatename(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }



    public void Manager() {
        getFirstname();
        getLastname();
        getId();
    }

    public void Subordinates() {
        getFirstname();
        getLastname();
        getId();
    }
    public static void main(String[] args) {
        Employee test = new Employee();
        test.updatename("", "");

        test.Manager();
        test.Subordinates();
    }
}
