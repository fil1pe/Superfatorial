package superfatorial;

import java.math.BigInteger;

public class SuperFatorialFile extends SuperFatorial {
    public static final String RANDOM_FILE = "resource/sfatorial.csv";
    public static final String FILE = RANDOM_FILE;
    
    @Override
    public BigInteger getSuperFatorial(int numero) throws InputException {
        BigInteger resultado;
        
        SFatorialFileReader io = new SFatorialRandomAccessIO();
        try {
            io.reader(FILE, numero);
            resultado = io.getValue();
        } catch (Exception e1) {
            resultado = super.getSuperFatorial(numero);
            try {
                io.writer(FILE, numero, resultado);
            } catch (Exception e2) {
                System.err.println(e2.getMessage());
            }
        }
        return resultado;
    }
}
