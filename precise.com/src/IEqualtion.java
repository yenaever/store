public interface IEqualtion {

    public  abstract void setFirst(short first);
    public  abstract  void  setSecond(short second);
    public abstract void setOper(char oper);
    public abstract short getFirst();
    public abstract short getSecond();
    public abstract char getOper();


    public abstract short calculate(short first,short second);


}
