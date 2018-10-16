package superfatorial;

import java.math.BigInteger;
import java.util.HashMap;

public class SuperFatorialCached extends SuperFatorial {
    private HashMap<Integer, BigInteger> cache1 = new HashMap<>();
    private HashMap<Integer, BigInteger> cache2 = new HashMap<>();
    
    @Override
    public BigInteger getSuperFatorial(int numero) throws InputException {
        if( !cache1.containsKey(numero) )
            cache1.put(numero, super.getSuperFatorial(numero) );
        return cache1.get(numero);
    }
    
    @Override
    protected BigInteger getFatorial(int numero) throws InputException {
        if( !cache2.containsKey(numero) )
            cache2.put(numero, super.getFatorial(numero));
        return cache2.get(numero);
    }
}
