package xyz.xishangqing.entiy;

public class User {
    private Integer id;
    private String name;
    private String emile;
    private Integer age;

    public User() {
    }

    public User(int id, String name, String emile, int age) {
        this.id = id;
        this.name = name;
        this.emile = emile;
        this.age = age;
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

    public String getEmile() {
        return emile;
    }

    public void setEmile(String emile) {
        this.emile = emile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emile='" + emile + '\'' +
                ", age=" + age +
                '}';
    }
}
