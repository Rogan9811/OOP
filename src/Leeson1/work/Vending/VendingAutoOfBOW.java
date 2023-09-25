package Leeson1.work.Vending;

import java.util.ArrayList;
import java.util.List;

public class VendingAutoOfBOW implements Auto {
    public List<Product> list = new ArrayList<>();
    public List<BottleOfWater> bottleOfWaterList = new ArrayList<>();

    @Override
    public void initProducts(List<Product> newList) {
       // Product list = (BottleOfWater) bottleOfWaterList;
        this.list = newList;
        System.out.println(newList);
    }

    public void printProduct(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                System.out.println(list.get(i));
            }
        }
    }

//    public void printProduct(int vol) {
//        for (int i = 0; i < list.size(); i++) {
//            if (bottleOfWaterList.get(i).getVolumeSize() == vol) {
//                System.out.println(list.get(i));
//            }
//        }
//    }
}

//* Object o = getSomeObject(),
//String s = (String) o; /