package com.exam;

public class ProductEx01 {
    public static void main(String[] args) {
        Product<Tv,String> product1 = new Product<>();
        product1.setKind(new Tv());
        product1.setModel("스마트 Tv");

        Tv tv = product1.getKind();
        String model = product1.getModel();
        System.out.println(model + " : "+tv);

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("디젤");

        Car car = product2.getKind();
        model = product2.getModel();
        System.out.println(model + " : "+car);
    }
}
