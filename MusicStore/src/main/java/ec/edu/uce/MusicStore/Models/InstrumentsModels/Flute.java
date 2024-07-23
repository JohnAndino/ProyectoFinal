package ec.edu.uce.MusicStore.Models.InstrumentsModels;

import ec.edu.uce.MusicStore.Interface.*;
import ec.edu.uce.MusicStore.Models.Product;

public class Flute extends Product implements Manageable, Cuttable,Moldable, Polishable,
        Testeable, Packable,Assembleable,Instalable,Paintable,Tunable {
    public Flute(String name, String description, String type, Float price,String color) {
        super(name, description, type, price,color);
    }

    @Override
    public void Cut() {
        System.out.println("Precise cutting of metal pipes");
    }

    @Override
    public void BuyMaterials() {
        System.out.println("Acquiring metals such as silver, nickel or copper, and pads.");
    }

    @Override
    public void PackageProduct() {
        System.out.println("packing the product, for delivery to the customer");
    }

    @Override
    public void Polish() {
        System.out.println("Polishing the metal for a shiny finish.");
    }

    @Override
    public void TestSound() {
        System.out.println("Checking the sound quality.");
    }

    @Override
    public void Mold() {
        System.out.println("Molding the metal to obtain the desired shape.");
    }

    @Override
    public void Assemble() {
        System.out.println("Assembling the pieces of the flute.");
    }

    @Override
    public void Instale() {
        System.out.println("Installing and adjusting the keys.");
    }

    @Override
    public void Paint() {
        System.out.println("Painting the desired color");
    }

    @Override
    public void FineTune() {
        System.out.println("Adjusting and tuning the strings to obtain the correct tone");
    }
}
