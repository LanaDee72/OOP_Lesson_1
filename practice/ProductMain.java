package practice;

import java.time.LocalDate;
import java.util.List;

// import practice.Impl.BottleOfWater;
// import practice.Impl.EPackage;
import practice.Impl.HotDrink;
import practice.Impl.HotVendingMachine;
// import practice.Impl.WaterVendingMachine;

public class ProductMain {

//     Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы
// initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)

    public static void main(String[] args) {
        
        // Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        // Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1),
        //         true, EPackage.GLASS.getMaterial(), 0.5F);

        // VendingMachine vm = new WaterVendingMachine();

        // System.out.println(vm.getProducts());

        // vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        // System.out.println(vm.getProducts());

        // vm.getProduct("Родники");

        // System.out.println(vm.getProducts());


        Product hotDrink1 = new HotDrink("coffe", 120, LocalDate.now(), 80, 0.4F);
        Product hotDrink2 = new HotDrink("tea", 90, LocalDate.now(), 80, 0.4F);
        Product hotDrink3 = new HotDrink("cocoa", 150, LocalDate.now(), 80, 0.4F);


        VendingMachine hvm = new HotVendingMachine();

        hvm.addProducts(List.of(hotDrink1, hotDrink2, hotDrink3, hotDrink1, hotDrink3));

        System.out.println(hvm.getProducts());
        
        hvm.getProduct(hotDrink1.getName());

        System.out.println(hvm.getProducts());
        
    }



}
