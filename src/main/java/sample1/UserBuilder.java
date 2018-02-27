package sample1;

public class UserBuilder {
    private String name;
    private String surname;
    private String email;
    private int age;

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public User createUser() {
        return new User(name, surname, email, age);
    }
}