package ec.edu.uce.MusicStore.Models.InstrumentsModels;

import ec.edu.uce.MusicStore.Interface.*;
import ec.edu.uce.MusicStore.Models.Product;

public class Harp extends Product implements Manageable, Cuttable, Assembleable,Instalable,
        Sandable, Polishable,Applicable,Testeable,Packable,Lacquerable,Tunable {
    public Harp(String name, String description, String type, Float price, String Color) {
        super(name, description, type, price, Color);
    }

    @Override
    public void AplyVarnish() {
        System.out.println("Application of varnish to protect and beautify the wood.");
    }

    @Override
    public void Assemble() {
        System.out.println("Assembling the wooden harp frame");
    }

    @Override
    public void Cut() {
        System.out.println("Precisely cutting the wooden pieces for the body and frame of the harp.");
    }

    @Override
    public void Instale() {
        System.out.println("Installing and adjusting the strings.");
    }

    @Override
    public void BuyMaterials() {
        System.out.println("Purchasing wood (maple, spruce), nylon or steel strings, and tuning components");
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
    public void ApplyLaquer() {
        System.out.println("Applying  lacquer of the desired color");
    }

    @Override
    public void FineTune() {
        System.out.println("Adjusting and tuning the strings to obtain the correct tone");
    }
}
