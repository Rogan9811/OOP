package Leeson1.work.Vending;


public abstract class Product {
    public int cost;
    public String name;

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product {" + name +
                " cost = " + cost +
                '}';
    }
}

//    public void setCost(int cost) {
//        this.cost = cost;
//    }
//
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String setProduct() {
//        return name;
//    }
//

//
