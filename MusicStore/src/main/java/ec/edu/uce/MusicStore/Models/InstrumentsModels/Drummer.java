package ec.edu.uce.MusicStore.Models.InstrumentsModels;

import ec.edu.uce.MusicStore.Interface.*;
import ec.edu.uce.MusicStore.Models.Product;

public class Drummer extends Product implements Assembleable, Cuttable, Manageable,
        Instalable, Paintable,Testeable,Packable,Moldable,Tunable {
    public Drummer(String name, String description, String type, Float price,String color) {
        super(name, description, type, price,color);
    }

    @Override
    public void Assemble() {
        System.out.println("Assembly of the drum shells.");
    }


    @Override
    public void Cut() {
        System.out.println("Cutting wood and metal for the shells.");
    }

    @Override
    public void Instale() {
        System.out.println("Installing the supports and pedals");
    }

    @Override
    public void BuyMaterials() {
        System.out.println("Acquisiting  wood, metal, plastics, and patch materials.");
    }

    @Override
    public void PackageProduct() {
        System.out.println("Packing the product, for delivery to the customer");
    }

    @Override
    public void Paint() {
        System.out.println("Painting the battery shells");
    }

    @Override
    public void TestSound() {
        System.out.println("Checking the sound quality.");
    }

    @Override
    public void Mold() {
        System.out.println("Molding the shells and the Hoops");
    }

    @Override
    public void FineTune() {
        System.out.println("Adjusting and tuning the strings to obtain the correct tone");
    }
}
