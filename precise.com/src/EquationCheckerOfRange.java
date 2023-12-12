public class EquationCheckerOfRange implements EquationChecker{
    private int max;
    private int min;
    public EquationCheckerOfRange(int min, int max)
    {
        this.max=max;
        this.min=min;
    }
    @Override
    public boolean check(IEqualtion equation) {
        return equation.getFirst()<=max&&equation.getFirst()>=min&&equation.getSecond()>=min&&equation.getSecond()<=max&&equation.calculate(equation.getFirst(), equation.getSecond())>=min&&equation.calculate(equation.getFirst(), equation.getSecond())<=max;


    }
}
