package hw4.task3;

import java.util.Objects;

public class Skill {
    private String title;
    private int experience;

    public Skill() {
    }

    public Skill(String title, int experience) {
        this.title = title;
        this.experience = experience;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill skill = (Skill) o;
        return getExperience() == skill.getExperience() && Objects.equals(getTitle(), skill.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getExperience());
    }

    @Override
    public String toString() {
        return "Skill{" +
                "title='" + title + '\'' +
                ", experience=" + experience +
                '}';
    }
}
