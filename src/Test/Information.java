package Test;

import java.util.List;

public class Information {
    private int id;
    private String name;
    private int age;

    public Information() {}

    public Information(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Information(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
