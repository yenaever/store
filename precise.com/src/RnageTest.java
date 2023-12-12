import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Set;
import java.util.HashSet;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

// https://assertj.github.io/doc/



public class RnageTest {
    EquationCollection t=EquationCollection.getEquationCollection();
    AbstractEquation e= new SubEquation.SubEquationBuilder((short) 4,(short) 4,'-').build();
    AbstractEquation f= new AddEquation.AddEquationBuilder((short) 4,(short) 4,'+').build();
    EquationCheckerOfRange ch=new EquationCheckerOfRange(0,100);
    @Test
    public void checkTest()
    {
        AbstractEquation e= new SubEquation.SubEquationBuilder((short) 4,(short) 4,'-').build();


EquationCheckerOfRange r=new EquationCheckerOfRange(0,100);
        assertEquals(true,r.check(e));
    }
    @ParameterizedTest(name = "using CsvSource")
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3"
    })
    public void addTest(int i,int k,int t)
    {
        assertEquals(t,f.calculate((short) i,(short) k), "1 + 1 should equal 2");
    }
    @ParameterizedTest(name = "using CsvSource")
    @CsvSource({
            "0, 1, -1",
            "1, 2, -1"
    })
    public void subTest(int i,int k,int t)
    {
        assertEquals(t,e.calculate((short) i,(short) k), "1 + 1 should equal 2");
    }

@Test

    public  void iterTest()
{
    assertEquals(3,t.generate(3,ch));
}

}
