package com.criticalsoftware;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public Student() {
    }

    public Student(int id, String fristName, String lastName, int age) {

        this.id = id;
        this.firstName = fristName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFristName() {
        return firstName;
    }

    public void setFristName(String fristName) {
        this.firstName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return new StringBuffer(" First Name : ").append(this.firstName)
                .append(" Last Name : ").append(this.lastName)
                .append(" Age : ").append(this.age).append(" ID : ")
                .append(this.id).toString();
    }
}
