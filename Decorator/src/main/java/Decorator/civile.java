package Decorator;

public class civile extends assuranceVoitureAbs{
    public civile (){
        name="responsabilit√© civile";
    }

    @Override
    public double cout() {
        return 1500;
    }
}
