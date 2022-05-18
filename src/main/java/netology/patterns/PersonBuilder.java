package netology.patterns;

public class PersonBuilder implements IPersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    @Override
    public Person build() {
        if (name == null) throw new IllegalStateException("Поле имя должно быть определено");
        else if (surname == null) throw new IllegalStateException("Поле фамилия должно быть определено");
        else if (age < 0) throw new IllegalStateException("Поле возраст не может быть отрицательным");
        Person person = new Person(name, surname, age);
        person.setAddress(address);
        return person;
    }

    public PersonBuilder setName(String name) {
        if (this.name == null) {
            this.name = name;
        }
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (this.surname == null) {
            this.surname = surname;
        }
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Возраст не может быть меньше нуля");
        if (this.age > 0) {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }


}
