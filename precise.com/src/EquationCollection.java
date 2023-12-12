import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
public class EquationCollection {
    private static  final EquationCollection instance= new EquationCollection();
    HashSet<AbstractEquation> equations = new HashSet<>();
    ObjectMapper map=new ObjectMapper();
    AbstractEquation E;
    Random r=new Random();
    EquationFactory equa=new EquationFactory();
    int i;
    public int generate(int n, EquationChecker checker)
    {
        while (equations.size()<n)
        {


                E=equa.getEquationRandom();


            if(checker.check(E)) {
                E.calculate(E.getFirst(),E.getSecond());
                equations.add( E);



            }
        }
        Iterator<AbstractEquation> iterator=equations.iterator();

        while (iterator.hasNext())
        {
            i++;
            IEqualtion next=iterator.next();
            System.out.println(next);
            try {
                String s=map.writerWithDefaultPrettyPrinter().writeValueAsString(next);
                System.out.println(s);
                map.writeValue(new File("result.json"), s);

            } catch (JsonProcessingException e)
            {
                e.printStackTrace();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        return i;

    }


private EquationCollection()
{}
    public static EquationCollection getEquationCollection()
    {
        return instance;
    }
}
