package ec.edu.uce.MusicStore.Models.InstrumentsModels;

import ec.edu.uce.MusicStore.Interface.*;
import ec.edu.uce.MusicStore.Models.Product;

public class Clarinet extends Product implements Manageable, Cuttable, Assembleable,
        Sandable,Polishable,Testeable, Packable,Instalable,Lacquerable,Tunable,Moldable {
    public Clarinet(String name, String description, String type, Float price, String Color) {
        super(name, description, type, price, Color);
    }

    @Override
    public void Assemble() {
        System.out.println("Assembling the clarinet body");
    }

    @Override
    public void Cut() {

        System.out.println("Precise cutting of wooden pieces.");
    }

    @Override
    public void BuyMaterials() {
        System.out.println("Acquiring granadilla wood, metal and pads.");
    }

    @Override
    public void PackageProduct() {
        System.out.println("packing the product, for delivery to the customer");
    }

    @Override
    public void Polish() {
        System.out.println("Polishing the surface for a professional finish");
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
    public void Instale() {
        System.out.println("Placing and adjusting the keys.");
    }

    @Override
    public void ApplyLaquer() {
        System.out.println("Applying  lacquer of the desired color");
    }

    @Override
    public void FineTune() {
        System.out.println("Adjusting and tuning the strings to obtain the correct tone");
    }

    @Override
    public void Mold() {
        System.out.println("Molding the body of the Clarinet");
    }
}
