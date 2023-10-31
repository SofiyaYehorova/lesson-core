package lesson3.demo1_interface;
// Interface дає нам лише контракт і методи (описує що мін містить), в AbstractClass місить логіку для виконання
//для всіх методів interface intellig пропускає метод public (хоча він є прописаний підкапоно)
// в interface змінні треба оголовувати (під капотом private, final, static). Пишем тип(double, String, int), назву ("a"), значення (10)


public interface Shape {
    //    public static final
//    для зміних
    double a = 10;

    //    public
//     для методів
    double getPerimeter();

    //    public
// для статичних методів
    static int getCount() {
        return 100;
    }

    //    дефолтні методи
    default void printPerimeter() {
        System.out.println(getPerimeter());
    }

}
