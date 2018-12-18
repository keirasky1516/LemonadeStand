import java.util.Scanner;

public class LemonadeStand {


    public static void main(String[] argus) {

        Scanner keyboard = new Scanner(System.in);


        String item1;
        String item2;
        String item3;
        double price = 0;
        int item_1;
        int item_2;
        int item_3;
        int item_4;
        int sales;
        double _sales = 0;
        Double priceItem4;
        Double priceItem3;
        Double priceItem2;
        Double priceItem1;
        Double amountSold;
        int amountOfItemsPurchased;
        int numberOfItems = 5;
        Double totalCost = null;
        Double costPerItem;
        int amountOfItem;
        costPerItem = totalCost;
        totalCost = costPerItem;
        amountOfItem = numberOfItems;
        numberOfItems = amountOfItem;
        amountSold=-_sales;






        System.out.println("Welcome to my manufacturing project");
        System.out.println("How many days");
        keyboard.nextInt();

        System.out.println("Day 1");

        System.out.println("How many items are needed");
        keyboard.nextInt();
        System.out.println("How much of item1 do you need");
        item_1=keyboard.nextInt();
        System.out.println("What is the cost per item");
        priceItem1=keyboard.nextDouble();



    System.out.println("How much of item2 do you need");
        item_2=keyboard.nextInt();
        System.out.println("What is the cost per item");
       priceItem2= keyboard.nextDouble();

        System.out.println("How much of item3 do you need");
        item_3=keyboard.nextInt();
        System.out.println("What is the cost per item");
        priceItem3=keyboard.nextDouble();


        System.out.println("How much of item4 do you need");
        item_4=keyboard.nextInt();
        System.out.println("What is the cost per item");
        priceItem4=keyboard.nextDouble();

        System.out.println("How many were sold");
        _sales=keyboard.nextInt();
        System.out.println("For what price each");
        price=keyboard.nextDouble();

        double itemTotal=priceItem1*item_1+priceItem2*item_2+item_3*priceItem3+item_4*priceItem4;

        double totalSales=price*_sales;
        double profit= totalSales-itemTotal;
        System.out.println("Your total profit is $"+profit);








    }


































}





