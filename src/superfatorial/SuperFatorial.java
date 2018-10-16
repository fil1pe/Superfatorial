package superfatorial;

import java.math.BigInteger;

public class SuperFatorial implements ISuperFatorial {
    
    @Override
    public BigInteger getSuperFatorial(int numero) throws InputException {
        if(numero == 0)
            return BigInteger.ONE;
        else if(numero < 0)
            throw new NegativeValueEnteredException();
        return getFatorial(numero).multiply( getSuperFatorial(numero-1) );
    }
    
    protected BigInteger getFatorial(int numero) throws InputException {
        if(numero == 0)
            return BigInteger.ONE;
        else if(numero < 0)
            throw new NegativeValueEnteredException();
        return BigInteger.valueOf(numero).multiply(getFatorial(numero-1));
    }
}
