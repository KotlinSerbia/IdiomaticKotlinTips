package sample2;

public class Client {
    private PersonalInfo personalInfo;

    Client(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }
}
