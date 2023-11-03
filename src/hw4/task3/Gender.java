package hw4.task3;

import java.util.function.Predicate;

public enum Gender implements Predicate<User_TreeSet> {
    MALE, FEMALE;

    @Override
    public boolean test(User_TreeSet user) {
        return false;
    }
}
