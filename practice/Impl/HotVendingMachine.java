package practice.Impl;

import java.util.List;

import practice.Product;
import practice.VendingMachine;

public class HotVendingMachine extends VendingMachine {

    public HotVendingMachine(){
        super();
    }

    public HotVendingMachine(List<Product> products){
        super(products);
    }

}
