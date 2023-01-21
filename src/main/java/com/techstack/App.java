package com.techstack;

import com.techstack.generator.Generator;

import java.util.Scanner;

public class App {

//    Suppose we are a manufacturer, and we know the prices for each component.
//    In this case, we can generate prices using the abstract "price" (com.techstack.computers.component.Copmonent.class)
//    field that all child classes have received, so we avoid code duplication.
//    In another case, if we are just a retailer and do not have actual access to pricing,
//    I would probably refuse the abstract price field, or in computer types whose components we cannot evaluate,
//    fill in the field as 0.0 and introduce an additional price field in the computer abstraction, and a setter,
//    so all child classes would independently override their pricing, let's say laptops just immediately indicated
//    their full cost, because it is impossible to get access the price of soldered parts on the motherboard.

//    Also I thought about field in Component.class such kind of "ConnectionInterface" (reference type)
//    for define connection opportunity of copmonents, but different components have too different interface connection
//    some has only input, some has only output, some hasn`t any. To blurry abstraction.

    public static void main( String[] args ) {

        Shop shop = Shop.getInstance(Generator.generateStock(), 10000.0f);

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the COMPUTER SHOP");
        System.out.println("You can buy any computer which you want if we have it in stock");
        System.out.println("Allowed Command:");
        System.out.println("stock - shows all computers");
        System.out.println("desktop - shows only desktop");
        System.out.println("laptop - shows only laptops");
        System.out.println("all-in-one - shows only all-in-one");
        System.out.println("show full specs - shows full properties of PC by id (check it in stock)");
        System.out.println("buy - to buy a computer");
        System.out.println("exit - exit");

        String input = "";
        while (!input.equals("exit")) {
            input = sc.nextLine();
            switch (input) {
                case "stock":
                    System.out.println(shop.getStock());
                    break;
                case "desktop":
                    System.out.println(shop.getDesktopPCs());
                    break;
                case "laptop":
                    System.out.println(shop.getLaptops());
                    break;
                case "all-in-one":
                    System.out.println(shop.getAllInOne());
                    break;
                case "show full specs":
                    System.out.println("Type full computer name");
                    input = sc.nextLine();
                    System.out.println(shop.showFullProperties(input));
                    break;
                case "buy":
                    System.out.println("Type id");
                    input = sc.nextLine();
                    shop.sellComputer(input);
                    break;
                case "exit":
                    System.out.println("Have a nice day. Bye");
                    break;
                default:
                    System.out.println("Command not support");
            }
        }
    }
}
