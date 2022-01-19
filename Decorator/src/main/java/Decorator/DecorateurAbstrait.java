package Decorator;

public abstract class DecorateurAbstrait extends assuranceVoitureAbs{
    protected assuranceVoitureAbs assurance;
    public DecorateurAbstrait(assuranceVoitureAbs assurance) {
        super();
        this.assurance = assurance;
    }
    }

