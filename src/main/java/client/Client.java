package client;

import lombok.Getter;
public class Client {
    @Getter
    private final int id;
    @Getter
    private final String name;
    @Getter
    private final int age;
    @Getter
    private final String sex;
    @Getter
    private final String email;

    public Client(int id, String email, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }




}
