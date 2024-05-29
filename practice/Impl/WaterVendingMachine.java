package practice.Impl;

import java.util.List;

import practice.Product;
import practice.VendingMachine;

public class WaterVendingMachine extends VendingMachine  {
    public WaterVendingMachine() {
        super();
    }

    public WaterVendingMachine(List<Product> products) {
        super(products);
    }
}
