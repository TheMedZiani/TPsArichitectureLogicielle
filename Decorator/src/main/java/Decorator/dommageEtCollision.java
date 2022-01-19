package Decorator;

public class dommageEtCollision extends DecorateurAbstrait {
    public dommageEtCollision(assuranceVoitureAbs assurance) {
        super(assurance);
    }

    @Override
    public double cout() {
        return assurance.cout()+ 200;
    }
}
