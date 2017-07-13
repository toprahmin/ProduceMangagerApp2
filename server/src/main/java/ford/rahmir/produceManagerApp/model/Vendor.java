package ford.rahmir.produceManagerApp.model;

import javax.persistence.*;

/**
 * Created by rahmirford on 6/23/17.
 */

@Entity
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VENDOR_ID")
    private int id;
    @Column(name = "Company_Name")
    private String companyName;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PRIMARY_CONTACT")
    private String primaryContact;
    @Column(name = "ADDRESS")
    private String Address;
    @Column(name = "PHONENUMBER")
    private String phoneNumber;


    public Vendor(){}

    public Vendor(String companyName, String email, String primaryContact) {
        this.companyName = companyName;
        this.email = email;
        this.primaryContact = primaryContact;
    }

    public int getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrimaryContact() {
        return primaryContact;
    }

    public void setPrimaryContact(String primaryContact) {
        this.primaryContact = primaryContact;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
