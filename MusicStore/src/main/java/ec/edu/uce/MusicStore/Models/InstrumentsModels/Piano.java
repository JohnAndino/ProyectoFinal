package ec.edu.uce.MusicStore.Models.InstrumentsModels;

import ec.edu.uce.MusicStore.Interface.*;
import ec.edu.uce.MusicStore.Models.Product;

public class Piano extends Product implements Manageable, Assembleable, Buildable, Tunable,
        Testeable,Packable,Instalable, Paintable {
    public Piano(String name, String description, String type, Float price,String color) {
        super(name, description, type, price,color);
    }

    @Override
    public void Assemble() {
        System.out.println( "Placing and adjusting the strings. Installing the keys and hammer mechanism.");
    }


    @Override
    public void Buildframework() {
        System.out.println("Manufacturing of the wood and metal frame.");
    }

    @Override
    public void BuyMaterials() {
        System.out.println("Acquiring high quality wood, keys (plastic or synthetic ivory), steel strings, " +
                "and electronic components (for digital pianos).");
    }

    @Override
    public void PackageProduct() {
        System.out.println("Packing the product, for delivery to the customer");
    }

    @Override
    public void TestSound() {
        System.out.println("Checking the sound quality.");
    }

    @Override
    public void FineTune() {
        System.out.println("Adjusting and tuning the tuners, strings, pedals, hammers and dampers to obtain the correct tone");
    }

    @Override
    public void Instale() {
        System.out.println("Installating electronic components and speakers.");
    }

    @Override
    public void Paint() {
        System.out.println("Painting the desire color");
    }
}
