package Leeson1.work.Vending;

import java.util.ArrayList;
import java.util.List;

public class VendingAutoHD implements Auto {
    public List<Product> list = new ArrayList<>();
    public List<HotDrinks> hotDrinksList = new ArrayList<>();


    @Override
    public void initProducts(List<Product> newList) {
       // Product list = (HotDrinks) hotDrinksList;
        this.list = newList;
        System.out.println(newList);
    }

//    public void printProduct(String name, int temperature) {
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getName().equals(name)) {
//                if (hotDrinksList.get(i).getTemperature() == temperature) {
//                    System.out.println(list.get(i));
//                }}
//        }
//    }

    public void printProduct(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                System.out.println(list.get(i));
            }
        }
    }

    public void printProduct(int temperature) {
        for (int i = 0; i < list.size(); i++) {
            if (hotDrinksList.get(i).getTemperature() == temperature) {
                System.out.println(list.get(i));
            }
        }
    }
}