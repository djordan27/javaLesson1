package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        int a = 12;



        Product product1 = new Product();
        //product1.brand = "ООО Чистый Источник";
        //product1.name = "Бутылка с водой";
        //product1.price = 125.15;
        System.out.println(product1.displayInfo());

        Product product2 = new Product("ООО Чистый Источник", "Бутылка с водой #2", -90.15);
        //product2.brand = "ООО Чистый Источник";
        //product2.name = "__";
        //product2.price = -15;
        product2.setPrice(-30);
        System.out.println(product2.displayInfo());

        BottleOfWater bottleOfWater1 =
                new BottleOfWater("ООО Чистый Источник", "Бутылка с водой #3", -90.15, 1.5);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfMilk
                = new BottleOfMilk("ООО Чистый Источник", "Бутылка с молоком #1", -90.15, 1.5, 10);
        Product chocolate = new Chocolate("Альпен голд", "Шоколадка", 100,90);
        System.out.println(bottleOfMilk.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(bottleOfWater1);
        products.add(bottleOfMilk);
        products.add(chocolate);

//        System.out.println("massiv \n" + products + "\n end");
        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(1.5);


        Chocolate chocolateResult = vendingMachine.getChocolate();
//        if (bottleOfWaterResult != null){
//            System.out.println("Вы купили:");
//            System.out.println(bottleOfWaterResult.displayInfo());
//        }
//        else
            if (chocolate != null){
            System.out.println("Вы купили:" + "\n " + chocolate.displayInfo());
        }

    }


}
