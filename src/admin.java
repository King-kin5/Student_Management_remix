

import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class admin {
    Scanner sc = new Scanner(System.in);
    ArrayList<Student> studentArrayList = new ArrayList<>();
    public void errorMsg() {
        System.out.println("Invalid Input");
    }
    public int testMethod() {
        int value = 0;
        do {
            try {
                System.out.println("SELECT:");
                value = sc.nextInt();
            } catch (InputMismatchException ex) {
                errorMsg();}
        } while (value == 0);
        return value;
    }

    public String firstNameGet() {
        System.out.println("Enter First name:");
        String firstName = sc.nextLine();
        return firstName;
    }

    public String lastNameGet() {
        System.out.println("Enter Last name:");
        String lastName = sc.nextLine();
        return lastName;
    }
    public int idGet(){
        System.out.println("Enter Id");
        int id= sc.nextInt();
        return id;
    }

    public double phoneNumberGet() {
        System.out.println("Enter Phone number:");
        double phoneNumber = sc.nextDouble();
        return phoneNumber;
    }

    public String genderGet() {
        System.out.println("Enter Gender:");
        String gender = sc.nextLine();
        return gender;
    }
    public void addStudent() {
        System.out.println("Numbers of Student to be Created");
        int action = testMethod();
        int i = 1;
        for (; i <= action; i++) {
            Student student = new Student(firstNameGet(), lastNameGet(),idGet(), phoneNumberGet(), genderGet());
            studentArrayList.add(student);
        }
        System.out.println((i - 1) + "Student created");
    }
    public void viewStudent(){
        if (studentArrayList.isEmpty()){
            System.out.println("No student added.");
        }else {
            System.out.println(studentArrayList);
        }
    }
    public void removeStudent(){
        if (studentArrayList.isEmpty()){
            System.out.println("No Student Created.");
        }else {
            System.out.println("For number of students to be removed");
            int action = testMethod();

            if (action>studentArrayList.size()){
                System.out.println("Input too large");
            }else {
                int count=0;
                for (;count<action;count++){
                    viewStudent();
                    int idSelect;
                    try {
                        System.out.println("Select Student id:");
                        idSelect=sc.nextInt();
                    }catch (InputMismatchException ex){
                        System.out.println("Id does not exist");
                        break;
                    }
                    sc.nextLine();
                    Iterator<Student>iterator=studentArrayList.iterator();
                    while (iterator.hasNext()){
                        if (iterator.next().getId()==idSelect){
                            iterator.remove();
                        }
                    }
                }
            }
        }
    }
}