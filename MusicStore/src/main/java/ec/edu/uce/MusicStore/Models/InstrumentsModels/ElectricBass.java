package ec.edu.uce.MusicStore.Models.InstrumentsModels;

import ec.edu.uce.MusicStore.Interface.*;
import ec.edu.uce.MusicStore.Models.Product;

public class ElectricBass extends Product implements Manageable, Cuttable, Assembleable,
        Instalable, Testeable,Packable,Lacquerable,Tunable {

    public ElectricBass(String name, String description, String type, Float price, String color) {
        super(name, description, type, price,color);
    }

    @Override
    public void Assemble() {
        System.out.println("Assembling the bass body");
    }


    @Override
    public void Cut() {
        System.out.println(" Cutting the wood pieces for the body, neck, and fingerboard.");
    }

    @Override
    public void Instale() {
        System.out.println("Placing the pickups and electronics");
    }

    @Override
    public void BuyMaterials() {
        System.out.println("Selecting woods, strings, pickups and electronic components.");
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
    public void ApplyLaquer() {
        System.out.println("Applying  lacquer of the desired color");
    }

    @Override
    public void FineTune() {
        System.out.println("Adjusting and tuning the strings to obtain the correct tone");
    }
}
