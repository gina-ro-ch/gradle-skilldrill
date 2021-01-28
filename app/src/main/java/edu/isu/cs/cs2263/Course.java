package edu.isu.cs.cs2263;

public class Course {
    private int number;
    private String subject;
    private String title;

    public Course(){}

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString(){
        return String.format("%s %d %s", subject, number, title);

    }

    public static void main(String[] args){
        Course course1 = new Course();
        course1.setNumber(1181);
        course1.setSubject("CS");
        course1.setTitle("Intro to Programming");

        System.out.println(course1.toString());
    }
}
