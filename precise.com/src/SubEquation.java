public class SubEquation extends AbstractEquation{

    private SubEquation(SubEquation.SubEquationBuilder bulier) {
        super(bulier.first, bulier.second,bulier.oper);


        this.setFirst(bulier.first);
        this.setSecond(bulier.second);
        this.setOper(bulier.oper);

    }
    @Override
    public short calculate(short first, short second) {
        return (short) (first-second);
    }
    public static class SubEquationBuilder
    {
        private final short first;
        private final  short second;
        private final char oper;

        public SubEquationBuilder(short first,short second ,char oper)
        {
            this.first=first;
            this.second=second;
            this.oper=oper;

        }
        public SubEquation build() {
            SubEquation user =  new SubEquation(this);
            validateUserObject(user);
            return user;
        }
        private void validateUserObject(SubEquation user) {
            //Do some basic validations to check
            //if user object does not break any assumption of system
        }
    }
}
