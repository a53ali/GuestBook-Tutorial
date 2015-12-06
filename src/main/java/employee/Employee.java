package employee;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




/**
 * Created by adil on 8/11/2015.
 */
@Entity
public class Employee {
    // Persistent Fields:
    @Id @GeneratedValue
    Long id;
    private String name;
    private Date contractDate;
    private Date startDate;
    private Date terminationDate;

    // Department
    private String department;

    //Contact
    private String contactInformation;

    // Constructors:
    public Employee() {
    }

    public Employee(String name, Date contractDate, Date startDate, Date terminationDate, String department, String contactInformation) {
        this.name = name;
        this.contractDate = contractDate;
        this.startDate = startDate;
        this.terminationDate = terminationDate;
        this.department = department;
        this.contactInformation = contactInformation;
    }

    // String Representation:
    @Override
    public String toString() {
        return name + " (signed on " + contractDate + ")";
    }

}
