import org.junit.jupiter.api.Test;

import java.util.Objects;

public abstract class AbstractEquation implements IEqualtion,java.io.Serializable{
    private short first ;
    private short second ;
    private char oper ;

    public AbstractEquation(short first,short second,char oper)
    {
        this.first=first;
        this.second=second;
        this.oper=oper;
    }
    public AbstractEquation(short first,short second)
    {
        this.first=first;
        this.second=second;

    }
    public AbstractEquation()
    {

    }
    @Override
    public void setFirst(short first) {
        this.first=first;
    }

    @Override
    public void setSecond(short second) {
        this.second=second;
    }

    @Override
    public void setOper(char oper) {
        this.oper=oper;
    }

    @Override
    public short getFirst() {
        return first;
    }

    @Override
    public short getSecond() {
        return second;
    }

    @Override
    public char getOper() {
        return oper;
    }
    public boolean equals(AbstractEquation obj)
    {
        if (this.first==obj.first&&this.second==obj.second&&this.oper==obj.oper)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int hashCode(){
        return Objects.hash(first,second,oper);
    }
    public String toString()
    {
        if(oper=='+')
        {
            return first+"+"+second+"="+calculate(first,second);
        }
        else
        {
            return first+"-"+second+"="+calculate(first,second);
        }

    }
    @Override
    public abstract short calculate(short first, short second) ;
}
