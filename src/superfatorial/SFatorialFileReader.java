package superfatorial;

import java.io.IOException;
import java.math.BigInteger;

/**
 * Classe base para os programas de leitura
 *
 * @author udesc
 *
 */
public abstract class SFatorialFileReader {

    protected static final int KEY_INDEX = 0;
    protected static final int DATA_INDEX = 1;
    protected static final String SEPARATOR = ";";
    protected int key;
    protected BigInteger value;
    
    /**
     * Método que realiza a leitura dos arquivos
     *
     * @param nome
     * @throws IOException
     */
    public void reader(String nome) throws IOException {
        this.setKey(1);
        this.reader(nome, this.getKey());
    }

    /**
     * Método que realiza a leitura dos arquivos
     *
     * @param nome
     * @param key
     * @throws IOException
     */
    public abstract void reader(String nome, int key) throws IOException;
    
    /**
     * Método que realiza a escrita dos arquivos
     *
     * @param nome
     * @param key
     * @param data
     * @throws IOException
     */
    public abstract void writer(String nome, int key, BigInteger data) throws IOException;
    
    public int getKey() {
        return key;
    }
    
    public void setKey(int key) {
        this.key = key;
    }
    
    public BigInteger getValue() {
        return value;
    }

    void setValue(BigInteger value) {
        this.value = value;
    }
}
