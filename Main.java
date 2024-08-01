// Интерфейс Swimmable
interface Swimmable {
    void swim();
}

// Интерфейс Flyable
interface Flyable {
    void fly();
}

// Класс Human
class Human implements Swimmable, Flyable {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println(name + " умеет плавать техникой брасс.");
    }

    @Override
    public void fly() {
        System.out.println(name + " не умеет летать.");
    }
}

// Класс Fish
class Fish implements Swimmable {
    private String name;
    private int age;

    public Fish(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println(name + " плавет быстро в воде.");
    }
}

// Класс Bird
class Bird implements Swimmable, Flyable {
    private String name;
    private int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println(name + " плавает на поверхности воды.");
    }

    @Override
    public void fly() {
        System.out.println(name + " умеет летать высоко в небе.");
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {
        Human human = new Human("Алексей", 30);
        Fish fish = new Fish("Немо", 2);
        Bird bird = new Bird("Скопа", 1);

        human.swim();
        human.fly();

        fish.swim();

        bird.swim();
        bird.fly();
    }
}

