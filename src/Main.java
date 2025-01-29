public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");

        Bowl bowl = new Bowl(15);
        System.out.println("В миске сейчас " + bowl.getFood() + " еды.");

        cat1.eat(bowl, 10);
        cat2.eat(bowl, 10);

        bowl.addFood(10);
        cat2.eat(bowl, 10);
    }
}
