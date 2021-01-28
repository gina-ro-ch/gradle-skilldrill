package edu.isu.cs.cs2263;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private List<Course> courses;

    public Student (){}

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

    public String toString(){
        return String.format("%s %s", firstName, lastName);
    }

    public static void main(String[] args){
        Student student1 = new Student();
        student1.setFirstName("Isaac");
        student1.setLastName("Griffith");

        System.out.println(student1.toString());
    }
}
