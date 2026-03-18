package prototype;

public class Rabbit implements Prototype<Rabbit>, Cloneable {
    private String name;
    private int age;

    public Rabbit(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Rabbit clone() {
        try {
            return (Rabbit) super.clone(); // shallow copy
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone failed");
        }
    }

    @Override
    public String toString() {
        return "Rabbit{name='" + name + "', age=" + age + "}";
    }
}