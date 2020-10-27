package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        int waterPerCup = 200;
        int milkPerCup = 50;
        int coffeeBeansPerCup = 15;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        System.out.print("> ");
        int water = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        System.out.print("> ");
        int milk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        System.out.print("> ");
        int coffeeBeans = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        System.out.print("> ");
        int noOfCups = scanner.nextInt();


    }
}

/*Write how many cups of coffee you will need:
> 25
For 25 cups of coffee you will need:
5000 ml of water
1250 ml of milk
375 g of coffee beans

Write how many ml of water the coffee machine has:
> 1550
Write how many ml of milk the coffee machine has:
> 299
Write how many grams of coffee beans the coffee machine has:
> 300
Write how many cups of coffee you will need:
> 3
Yes, I can make that amount of coffee (and even 2 more than that)
 */