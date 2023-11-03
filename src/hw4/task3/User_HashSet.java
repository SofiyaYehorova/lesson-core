package hw4.task3;

import java.util.Objects;

public class User_HashSet {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private Car car;

    public User_HashSet() {
    }

    public User_HashSet(int id, String name, String surname, String email, int age, Gender gender, Car car) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User_HashSet that = (User_HashSet) o;
        return getId() == that.getId() && getAge() == that.getAge() && Objects.equals(getName(), that.getName()) && Objects.equals(getSurname(), that.getSurname()) && Objects.equals(getEmail(), that.getEmail()) && getGender() == that.getGender() && Objects.equals(getCar(), that.getCar());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSurname(), getEmail(), getAge(), getGender(), getCar());
    }

    @Override
    public String toString() {
        return "User_HasSet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", car=" + car +
                '}';
    }
}
