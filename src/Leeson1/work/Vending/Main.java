package Leeson1.work.Vending;

import java.util.ArrayList;
import java.util.List;

/*
Реализуйте класс Товар,
содержащий данные о товаре, и
ТорговыйАвтомат, содержащий в себе методы
initProducts (List <Product>) сохраняющий
в себе список исходных продуктов
и getProduct(String name)
*/


/*Сделать класс Товар абстрактным,
 * создать нескольких наследников (к примеру: БутылкаВоды),
 * сделать интерфейсом ТорговыйАвтомат и реализовать класс какого-то одного типа ТорговогоАвтомата
 * (пример: ПродающийБутылкиВодыАвтомат */


/*Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод
getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре */



public class Main {
    public static void main(String[] args) {

//        Product cal = new Product("Cal", 100);
//        Product sweet = new Product("sweet", 5);


//        BottleOfWater bottleOfWater = new BottleOfWater("Saint spring",1, 60);
//        BottleOfWater bottleOfWater1 = new BottleOfWater("Aqua mineral",2, 110);
//        BottleOfWater bottleOfWater2 = new BottleOfWater("Beer*",5, 250);
//        Sweets sweets = new Sweets("choco",1, 4);
//        //List<Product> prodList = new ArrayList<>(List.of(bottleOfWater, bottleOfWater1, bottleOfWater2, sweets));
//        List<Product> prodBoWList = new ArrayList<>(List.of(bottleOfWater, bottleOfWater1, bottleOfWater2));
//
//        VendingAutoOfBOW vendingAutoOfBOW = new VendingAutoOfBOW();
//        vendingAutoOfBOW.initProducts(prodBoWList);
//        System.out.println("--".repeat(10));
//        vendingAutoOfBOW.printProduct("Saint spring");
       // vendingAutoOfBOW.printProduct(3);

//        Auto auto = new Auto();
//
//        auto.initProducts(prodList);
//        auto.printProduct("bottle of water");
//        auto.printProduct("Sweet");
        /* -----------------------------------------------------------------
                                Home work
           ----------------------------------------------------------------- */
        HotDrinks hotDrink = new HotDrinks("Tea",100, 50);
        HotDrinks hotDrink1 = new HotDrinks("Coffee",90, 70);
        HotDrinks hotDrink2 = new HotDrinks("Hot milk",95, 120);

        List<Product> prodHDList = new ArrayList<>(List.of(hotDrink, hotDrink1, hotDrink2));

        VendingAutoHD vendingAutoHD = new VendingAutoHD();
        vendingAutoHD.initProducts(prodHDList);
        System.out.println("--".repeat(10));
        vendingAutoHD.printProduct("Coffee");
        System.out.println("--".repeat(10));
        vendingAutoHD.printProduct("Tea");
        //vendingAutoHD.printProduct(100);
    }
}