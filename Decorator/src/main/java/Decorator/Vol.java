package Decorator;

public class Vol extends  DecorateurAbstrait{
    public Vol(assuranceVoitureAbs assurance) {
        super(assurance);
    }

    @Override
    public double cout() {
        return assurance.cout()+ 300;
    }
}
