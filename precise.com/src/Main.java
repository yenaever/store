import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sr=new Scanner(System.in);
        int t;

        System.out.println("请输入你想打印的习题数以及每行的算式个数:");
        t= sr.nextInt();//总的习题数

        EquationCollection e=EquationCollection.getEquationCollection();
        EquationChecker n=new EquationCheckerOfRange(0,100);
        e.generate(t,n);

        Class<?> user=Class.forName("AddEquation");
        Method[] ms=user.getMethods();
        System.out.println(Arrays.toString(ms));
        Field[] fs=user.getFields();
        System.out.println(Arrays.toString(fs));
        Constructor<?>[] con= user.getDeclaredConstructors();
        System.out.println(Arrays.toString(con));


    }
}