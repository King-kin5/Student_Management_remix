import java.util.Date;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private Date  dateAdded;
    private double phoneNumber;
    private String gender;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
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
    public double getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Student(String firstName, String lastName, int id,double phoneNumber, String gender){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.phoneNumber=phoneNumber;
        this.gender=gender;
        this.dateAdded=new Date();
    }
    @Override
    public String toString(){
        return "{Id:"+id+",First name:"+firstName+",Last name:"+lastName+",Phone number:"+phoneNumber+",Gender:"+gender+
                ",Date of brith:"+dateAdded+"\n";
    }
}
