package Model;

public class Customer {

    private Integer id;
    private String name;
    private String surname;
    private Integer birthyear;
    private String gender;

    public Customer(Integer id, String name, String surname, Integer birthyear, String gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthyear = birthyear;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(Integer birthyear) {
        this.birthyear = birthyear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
