package hw4.task4;

import java.util.*;

public class ZooClub {
    private final Map<Person, List<Pet>> club = new HashMap<>();

    private String _inputString() {
        return new Scanner(System.in).nextLine();
    }

    private int _inputInt() {
        return new Scanner(System.in).nextInt();
    }

    private Map.Entry<Person, List<Pet>> _entryByPeronId() {
        int personId = this._inputInt();
        return this.club.entrySet().stream().filter(item -> item.getKey().getId() == personId).findFirst().orElse(null);
    }

    private void addPerson() {
        System.out.println("***************************************************************");
        Integer personId = this.club
                .keySet()
                .stream()
                .max((a, b) -> a.getId() - b.getId())
                .map(person -> person.getId() + 1)
                .orElse(1);

        System.out.println("Введіть ім'я: ");
        String personName = this._inputString();
        this.club.put(new Person(personId, personName), new ArrayList<>());

        System.out.println("***************************************************************");
    }

    private void addPetToMember() {
        if (this.showAllMembersOfTheClubWithAnimals()) {
            System.out.println("Додати тварину до (введіть id Учасника клубу): ");
            Map.Entry<Person, List<Pet>> personListEntry = this._entryByPeronId();

            if (personListEntry != null) {
                Animal[] animals = Animal.values();
                for (int i = 0; i < animals.length; i++) {
                    System.out.println(i + ") " + animals[i]);
                }
                System.out.print("Виберіть тип тварини: ");
                int index = this._inputInt();

                System.out.print("Введіть ім'я тварини: ");
                String petName = this._inputString();

                int idPet = personListEntry
                        .getValue()
                        .stream().max((a, b) -> a.getId() - b.getId())
                        .map(pet -> pet.getId() + 1)
                        .orElse(1);
                personListEntry.getValue().add(new Pet(idPet, animals[index], petName));
            } else {
                System.out.println("***************************************************************");
                System.out.println("Такого учасника не знайдено!!!");
                System.out.println("***************************************************************");
            }
        } else {
            System.out.println("***************************************************************");
            System.out.println("Клуб порожній!");
            System.out.println("***************************************************************");

        }

    }
    private void deletePetFromMemberOfTheClub(){
        if(this.showAllMembersOfTheClubWithAnimals()){
            System.out.print("Від якого власника видалити тварину? :");
            Map.Entry<Person, List<Pet>> personListEntry = this._entryByPeronId();

            if(personListEntry==null){
                System.out.println("Такого власника не існує в клубі");
                return;
            }
            personListEntry.getValue().forEach(pet -> {
                System.out.println(pet.getId()+") " + pet);
            });
            System.out.print("Яку тварину видалити?: ");
            int idPet = this._inputInt();

            personListEntry.getValue().removeIf(pet -> pet.getId()==idPet);
        }
    }
    private void deleteAnimalByType(){
        Animal[] animals = Animal.values();
        for (int i = 0; i < animals.length; i++) {
            System.out.println(i+") " + animals[i]);
        }
        System.out.print("Який тип тварин хочете видалити (введіть id типу)?: ");
        int index = this._inputInt();
        Animal animal = animals[index];
        this.club.values().forEach(pets -> pets.removeIf(pet -> pet.getAnimalType()==animal));
    }
    private void deleteMemberFromClub(){
        if(!this.showAllMembersOfTheClubWithAnimals()){
            return;
        }
        System.out.print("Якого учасника (введіть id) видалити?: ");
        Map.Entry<Person, List<Pet>> personListEntry = this._entryByPeronId();

        if(personListEntry==null){
            return;
        }
        this.club.remove(personListEntry.getKey());
    }

    private boolean showAllMembersOfTheClubWithAnimals() {
        if (this.club.isEmpty()) {
            return false;
        }
        System.out.println("***************************************************************");
        this.club.forEach(((person, pets) -> {
            System.out.println(person.getId() + ") " + person + " Pets: " + pets);
        }));
        System.out.println("***************************************************************");
        return true;
    }

    public void menu() {
        while (true) {
            System.out.println("1) додати учасника в клуб");
            System.out.println("2) додати тваринку до учасника клубу");
            System.out.println("3) видалити тваринку з власника");
            System.out.println("4) видалити учасника клубу");
            System.out.println("5) видалити конкретну тваринку з усіх власників");
            System.out.println("6) вивести на екран зооклуб");
            System.out.println("9) вихід");

            System.out.println("Зробіть свій вибір: ");

            String choice = this._inputString();
            switch (choice) {
                case "1":
                    this.addPerson();
                    break;
                case "2":
                    this.addPetToMember();
                    break;
                case "3":
                    this.deletePetFromMemberOfTheClub();
                    break;
                case"4":
                    this.deleteMemberFromClub();
                    break;
                case "5":
                    this.deleteAnimalByType();
                    break;
                case "6":
                    this.showAllMembersOfTheClubWithAnimals();
                    break;
                case "9":
                    return;
            }
        }

    }
}
