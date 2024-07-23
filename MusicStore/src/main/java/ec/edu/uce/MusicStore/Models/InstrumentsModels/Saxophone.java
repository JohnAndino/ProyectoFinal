package ec.edu.uce.MusicStore.Models.InstrumentsModels;

import ec.edu.uce.MusicStore.Interface.*;
import ec.edu.uce.MusicStore.Models.Product;

public class Saxophone extends Product implements Manageable, Cuttable, Assembleable, Weldable,
        Polishable,Testeable,Packable, Paintable,Sandable,Tunable {

    public Saxophone(String name, String description, String type, Float price,String color) {
        super(name, description, type, price,color);
    }

    @Override
    public void Assemble() {
        System.out.println("Assembling the valves and pistons.");
    }

    @Override
    public void Cut() {
        System.out.println("Cutting brass tubes");
    }

    @Override
    public void BuyMaterials() {
        System.out.println("Acquisition of brass and pads.");
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
    public void Weld() {
        System.out.println("Welding the saxophone parts.");
    }

    @Override
    public void Paint() {
        System.out.println("Painting the desired color");
    }

    @Override
    public void Sand() {
        System.out.println("Sanding the metal for a shiny finish.");
    }

    @Override
    public void FineTune() {
        System.out.println("Adjusting and tuning the strings to obtain the correct tone");
    }
}
