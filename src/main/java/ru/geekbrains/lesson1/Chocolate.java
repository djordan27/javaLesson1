package ru.geekbrains.lesson1;

public class Chocolate extends Product{
    private int caloriesOffWeight;

    public Chocolate(String brand, String name, double price, int caloriesOffWeight) {
        super(brand, name, price);
        this.caloriesOffWeight = caloriesOffWeight * 546 ;
    }

//    public Chocolate(int caloriesOffWeight) {
//        this.caloriesOffWeight = caloriesOffWeight * 546;
//    }

    public int getCaloriesOffWeight() {
        return caloriesOffWeight;
    }


//    @Override
//    public String toString() {
//        return "Сhocolate{" +
//                "caloriesOffWeight=" + caloriesOffWeight +
//                '}';
//    }
    @Override
    public String displayInfo(){
        return String.format("%s - %s - %f - %x", brand, name, price, getCaloriesOffWeight());
    }
}
