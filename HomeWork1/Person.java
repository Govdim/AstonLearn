package HomeWork1;

public class Person{

    private final String name;
    private final String surname;

    private final BirthDate birthDate;

    public Person(String name, String surname, BirthDate birthDate){
        this.name = name;
        this.surname = surname;
        this.birthDate = new BirthDate(birthDate.getDay(), birthDate.getMonth(), birthDate.getYear());
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public BirthDate getBirthDate() {
        return new BirthDate(birthDate.getDay(), birthDate.getMonth(), birthDate.getYear());
    }

    public static void main(String[] args){
        BirthDate birthDate1 = new BirthDate(13, 10, 2001);
        Person person = new Person("Дмитрий", "Комаров", birthDate1);

        birthDate1.setDay(22);
        System.out.println(person.getBirthDate());
    }
}
