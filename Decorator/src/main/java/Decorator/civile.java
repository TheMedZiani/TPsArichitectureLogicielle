package Decorator;

public class civile extends assuranceVoitureAbs{
    public civile (){
        name="responsabilité civile";
    }

    @Override
    public double cout() {
        return 1500;
    }
}
