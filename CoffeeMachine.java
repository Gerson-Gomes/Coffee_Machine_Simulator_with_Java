package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int cups = 9;
        int money = 550;
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String buy = scanner.next();
                    switch (buy) {
                        case "1":
                            if(water >= 250 && coffeeBeans >= 16 && cups >= 1) {
                                water = water - 250;
                                coffeeBeans = coffeeBeans - 16;
                                money = money + 4;
                                cups = cups - 1;
                                System.out.println("I have enough resources, making you coffee!");
                            } else if(cups > 0){
                                if(water/250 == 0){
                                    System.out.println("Sorry, not enough water!");
                                } else if (coffeeBeans/16 == 0) {
                                    System.out.println("Sorry, not enough coffee beans");
                                }
                                } else {
                                    System.out.println("Sorry, not enough disposable cups");
                                }
                            break;
                        case "2":
                            if(water >= 350 && milk >= 75 && coffeeBeans >= 20  && cups >= 1) {
                                water = water - 350;
                                milk = milk - 75;
                                coffeeBeans = coffeeBeans - 20;
                                money = money + 7;
                                cups = cups - 1;
                                System.out.println("I have enough resources, making you coffee!");
                                break;
                            } else if(cups > 0){
                                if(water/350 == 0){
                                    System.out.println("Sorry, not enough water!");
                                } else if (coffeeBeans/20 == 0) {
                                    System.out.println("Sorry, not enough coffee beans");
                                } else if (milk/75 == 0){
                                    System.out.println("Sorry, not enough milk");
                                }
                            } else {
                                System.out.println("Sorry, not enough disposable cups");
                            }
                            break;
                        case "3":
                            if(water >= 200 && milk >= 100 && coffeeBeans >= 12 && cups >=1 ) {
                                water = water - 200;
                                milk = milk - 100;
                                coffeeBeans = coffeeBeans - 12;
                                money = money + 6;
                                cups = cups - 1;
                                System.out.println("I have enough resources, making you coffee!");
                                break;
                            } else if(cups > 0) {
                                if(water/200 == 0){
                                    System.out.println("Sorry, not enough water!");
                                } else if (coffeeBeans/12 == 0) {
                                    System.out.println("Sorry, not enough coffee beans");
                                } else if (milk/100 == 0){
                                    System.out.println("Sorry, not enough milk");
                                }
                            } else {
                                System.out.println("Sorry, not enough disposable cups");
                            }
                            break;
                        case "back":
                            break;
                        default:
                            System.out.println("Error");
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    int w = scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    int m = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    int cB = scanner.nextInt();
                    System.out.println("Write how many disposable cups you want to add:");
                    int dC = scanner.nextInt();
                    water = water + w;
                    milk = milk + m;
                    coffeeBeans = coffeeBeans + cB;
                    cups = cups + dC;
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " ml of water");
                    System.out.println(milk + " ml of milk");
                    System.out.println(coffeeBeans + " g of coffee beans");
                    System.out.println(cups + " disposable cups");
                    System.out.println("$" + money + " of money");
                    break;
                case "exit":
                    System.exit(0);
                    return;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

