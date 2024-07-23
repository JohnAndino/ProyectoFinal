package ec.edu.uce.MusicStore.Models.InstrumentsModels;

import ec.edu.uce.MusicStore.Interface.*;
import ec.edu.uce.MusicStore.Models.Product;

public class Fiddle extends Product implements Assembleable, Cuttable, Manageable, Sandable,
        Polishable,Applicable,Testeable,Packable,Instalable,Lacquerable,Tunable {

    public Fiddle(String name, String description, String type, Float price,String color) {
        super(name, description, type, price,color);
    }

    @Override
    public void AplyVarnish() {
        System.out.println("applying varnish on the product");
    }

    @Override
    public void Assemble() {
        System.out.println("assembling the fiddle body, the neck and fingerboard.");
    }



    @Override
    public void Cut() {
        System.out.println(" Cutting the wood pieces for the body, neck, and fingerboard.");
    }

    @Override
    public void BuyMaterials() {
        System.out.println("Selecting of woods such as maple and spruce, strings, pegs and varnish");
    }

    @Override
    public void PackageProduct() {
        System.out.println("Packing the product, for delivery to the customer");
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
        System.out.println("Placement of the pegs, strings and bridge.");
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
