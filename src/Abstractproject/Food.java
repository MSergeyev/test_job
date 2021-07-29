package Abstractproject;

class Carrot {
    public void peel() {
        int quantity = 5;
        System.out.println("Чистить" + quantity+ " штук");
    }
}

public class Food {
    public static void main(String[] args) {
        Carrot carrot = new Carrot() {
            @Override
            public void peel() {
                int quantity = 4;
                System.out.println("Помойте морковь " + quantity + " штуки.");
            }
        };
        carrot.peel();
    }
}
