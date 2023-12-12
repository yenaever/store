import java.util.Random;
public class EquationFactory {
    Random r=new Random();


    public AbstractEquation getEquation(String type)
    {
        short first= (short) r.nextInt(0,100);
        short second= (short) r.nextInt(0,100);
        if (type.equals("Add"))
        {
            AddEquation.AddEquationBuilder add=new AddEquation.AddEquationBuilder(first,second,'+');

            return add.build();
        }
        if (type.equals("Sub"))
        {
            SubEquation.SubEquationBuilder sub=new SubEquation.SubEquationBuilder(first,second,'-');

            return sub.build();
        }
        if(type==null) {
            return null;
        }
        return null;
    }
    public AbstractEquation getEquationRandom()
    {
        short first= (short) r.nextInt(0,100);
        short second= (short) r.nextInt(0,100);

        boolean i= r.nextBoolean();
        if (i==true)
        {
            AddEquation.AddEquationBuilder add=new AddEquation.AddEquationBuilder(first,second,'+');
            return add.build();
        }
        else {
            SubEquation.SubEquationBuilder sub=new SubEquation.SubEquationBuilder(first,second,'-');
            return sub.build();
        }
    }
}
