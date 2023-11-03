package hw4.task3;

import java.util.List;
import java.util.Objects;

public class User_TreeSet implements Comparable<User_TreeSet> {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private Car car;
    private List<Skill> skills;

    public User_TreeSet() {
    }

    public User_TreeSet(int id, String name, String surname, String email, int age, Gender gender, Car car, List<Skill> skills) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.car = car;
        this.skills = skills;
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

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User_TreeSet user = (User_TreeSet) o;
        return getId() == user.getId() && getAge() == user.getAge() && Objects.equals(getName(), user.getName()) && Objects.equals(getSurname(), user.getSurname()) && Objects.equals(getEmail(), user.getEmail()) && getGender() == user.getGender() && Objects.equals(getCar(), user.getCar()) && Objects.equals(getSkills(), user.getSkills());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSurname(), getEmail(), getAge(), getGender(), getCar(), getSkills());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", car=" + car +
                ", skills=" + skills +
                '}';
    }

    @Override
    public int compareTo(User_TreeSet o) {
        return this.skills.size()-o.getSkills().size();
    }
}
