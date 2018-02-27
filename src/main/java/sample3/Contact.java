package sample3;

public class Contact {
    private final String name;
    private final String surname;
    private final String email;
    private final String phone;
    private final Address address;

    public Contact(String name, String surname, String email, String phone, Address address) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Address getAddress() {
        return address;
    }
}
