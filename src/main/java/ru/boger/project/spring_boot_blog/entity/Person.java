package ru.boger.project.spring_boot_blog.entity;

public class Person {
    private String name;
    private String email;
    private String numberPhone;

    public Person(String name, String email, String numberPhone) {
        this.name = name;
        this.email = email;
        this.numberPhone = numberPhone;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }
}
