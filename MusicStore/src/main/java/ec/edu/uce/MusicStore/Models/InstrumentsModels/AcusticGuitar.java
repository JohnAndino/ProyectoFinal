package ec.edu.uce.MusicStore.Models.InstrumentsModels;

import ec.edu.uce.MusicStore.Interface.*;
import ec.edu.uce.MusicStore.Models.Product;

public class AcusticGuitar extends Product implements Manageable, Cuttable, Assembleable,
        Sandable, Polishable,Applicable,Tunable,Packable,Testeable,Instalable,Lacquerable{
    public AcusticGuitar(String name, String description, String type, Float price,String color) {
        super(name, description, type, price,color);
    }

    @Override
    public void AplyVarnish() {
        System.out.println("applying varnish on the product");
    }

    @Override
    public void Assemble() {
        System.out.println("assembling the guitar body");
    }



    @Override
    public void Cut() {
        System.out.println(" Cutting the wood pieces for the body, neck, and fingerboard.");

    }

    @Override
    public void BuyMaterials() {
        System.out.println("Selecting high quality woods (mahogany, maple, rosewood), steel or nylon strings, pegs, and varnishes.");
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
    public void FineTune() {
        System.out.println("Adjusting and tuning the strings to obtain the correct tone");
    }

    @Override
    public void Instale() {
        System.out.println("Placing pegs, strings, and other accessories");
    }

    @Override
    public void TestSound() {
        System.out.println("Checking the sound quality.");
    }

    @Override
    public void ApplyLaquer() {
        System.out.println("Applying  lacquer of the desired color");
    }
}
