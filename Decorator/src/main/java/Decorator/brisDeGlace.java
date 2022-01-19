package Decorator;

public class brisDeGlace extends DecorateurAbstrait{
    public brisDeGlace(assuranceVoitureAbs assurance) {
        super(assurance);
    }

    @Override
    public double cout() {
        return assurance.cout()+ 100;
    }
}
