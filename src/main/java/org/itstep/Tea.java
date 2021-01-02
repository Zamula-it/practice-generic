package org.itstep;
public class Tea implements Comparable<Tea>{
    private final String name;
    private final double price;
    public Tea(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Чай: " + name + " \nЦена: " + price;
    }
    @Override
    public int compareTo(Tea o) {
        if(price< o.price)
        {
            return -1;
        }
        else if(price>o.price){
            return 1;
        }
        return 0;
    }
}
