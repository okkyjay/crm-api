package crm.api.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name ="users")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id", unique = true)
    private Integer id;
    private String username;
    private String firstName;
    private String lastName;
    private String emailAdress;
    private String phoneNumber;
    @Lob 
    @Column(name="bio", length=512)
    private String bio;
    private String ipAddress;
    private String city;
    private String state;
    private String region;
    private String country;
    private String password;
    
    public UserModel(){
    	
    }

    public UserModel(int id, String username, String firstName, String lastName, String emailAdress, String phoneNumber, String bio, String ipAddress, String city, String state, String region, String country, String password) {
        super();
    	this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAdress = emailAdress;
        this.phoneNumber = phoneNumber;
        this.bio = bio;
        this.ipAddress = ipAddress;
        this.city = city;
        this.state = state;
        this.region = region;
        this.country = country;
        this.password = password;
    }
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
