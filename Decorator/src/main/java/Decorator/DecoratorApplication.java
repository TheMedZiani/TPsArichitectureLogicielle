package Decorator;


public class DecoratorApplication {

    public static void main(String[] args) {
    assuranceVoitureAbs assurance =new civile();
    assurance = new Vol(assurance);
    System.out.println(assurance.cout());

} }
