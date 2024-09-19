package course.models;

import jakarta.validation.constraints.*;

public class Person {
    private int id;

    @NotEmpty(message = "Имя не может быть пустым")
    @Size(min = 2, max = 30, message = "Имя должно быть от 2 до 30 символов")
    private String name;

    @Min(value = 0, message = "Возраст не может быть меньше 0")
    private int age;

    @NotEmpty(message = "Почта не может быть пустой")
    @Email(message = "Неверно введен адрес")
    private String email;

    @Pattern(regexp = "[A-Z]\\w+, [A-Z]\\w+, \\d{6}", message = "Address is incorrect")//Страна, город, индекс (6 цифр)
    private String address;

    public Person() {

    }

    public Person(int id, String name, int age, String email, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
