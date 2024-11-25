package org.example;

public class User {
    private int idNumber;
    private String name;
    private String email;
    private String password;
    private int age;

    public User(int idNumber,String name, String email, String password){
       // this.age = age;
        this.email = email;
        this.name = name;
        this.password = password;
        this.idNumber = idNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
