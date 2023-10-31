package hw3.task2;

//Створити інтерфейс Instrument та реалізовуючі його класи "Гітара", "Барабан"  та "Труба" .
//Інтерфейс Instrument  містить метод play().
//Клас "Гітара" містить змінну класу "кількістьСтрун",
//клас "Барабан" - розмір, а клас "Труба" - діаметр.
//Створити масив типу "Інструмент" (Instrument), що містить інструменти різних типів.
//У циклі викликати метод play() для кожного інструменту,
//який повинен виводити рядок "Грає такий-то інструмент з такими-то характеристиками".
//
public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = {
                new Drum(15.5), new Drum(17),
                new Guitar(7),
                new Guitar(5),
                new Saxophone(10.5),
                new Saxophone(11)
        };
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}

