public class AddEquation extends AbstractEquation{

public int k;


    private AddEquation(AddEquationBuilder bulier) {
        super(bulier.first, bulier.second,bulier.oper);


        this.setFirst(bulier.first);
        this.setSecond(bulier.second);
        this.setOper(bulier.oper);
    }

    private AddEquation() {

    }




    @Override
    public short calculate(short first, short second) {
        return (short) (first+second);
    }



    public static class AddEquationBuilder
    {
        private final short first;
        private final  short second;
        private final char oper;
        public AddEquationBuilder(short first,short second, char oper)
        {
        this.first=first;
        this.second=second;
        this.oper=oper;
        }

        public AddEquation build() {
            AddEquation user =  new AddEquation(this);
            validateUserObject(user);
            return user;
        }
        private void validateUserObject(AddEquation user) {
            //Do some basic validations to check
            //if user object does not break any assumption of system
            user.setFirst(first);
            user.setOper(oper);
            user.setSecond(second);
        }
    }

}
