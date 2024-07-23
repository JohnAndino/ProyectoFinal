package ec.edu.uce.MusicStore.Models.InstrumentsModels;

import ec.edu.uce.MusicStore.Interface.*;
import ec.edu.uce.MusicStore.Models.Product;

public class Trumpet extends Product implements Manageable, Cuttable, Moldable, Assembleable,
        Weldable,Polishable,Sandable,Testeable,Packable, Lacquerable,Tunable {

    public Trumpet(String name, String description, String type, Float price,String color) {
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
        System.out.println("Purchasing brass and valve components");
    }

    @Override
    public void Mold() {
        System.out.println("Molding brass tubes");
    }

    @Override
    public void PackageProduct() {
        System.out.println("Packing the product, for delivery to the customer");
    }

    @Override
    public void Polish() {
        System.out.println("Polishing the metal for a shiny finish.");
    }

    @Override
    public void Sand() {
        System.out.println("Sanding the surface for a professional finish");
    }

    @Override
    public void TestSound() {
        System.out.println("Checking the sound quality.");
    }

    @Override
    public void Weld() {
        System.out.println("Welding the trumpet parts.");
    }

    @Override
    public void ApplyLaquer() {
        System.out.println("Applying lacquer of the desired color");
    }

    @Override
    public void FineTune() {
        System.out.println("Adjusting and tuning the strings to obtain the correct tone");
    }
}
