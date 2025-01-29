class Cat extends Animal {
    private static int catCount = 0;
    private boolean hungry = true;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать так далеко.");
        }
    }

    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public boolean eat(Bowl bowl, int foodAmount) {
        if (bowl.getFood() >= foodAmount) {
            bowl.decreaseFood(foodAmount);
            hungry = false;
            System.out.println(name + " поел " + foodAmount + " еды.");
            return true;
        } else {
            System.out.println(name + " не смог поесть, недостаточно еды.");
            return false;
        }
    }
}
