package superfatorial;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigestForSFatorial {

    public static final String FILE = "resource/sfatorial_resumo.txt";

    /**
     * Gera resumo e o grava em arquivo
     *
     * @throws NoSuchAlgorithmException
     */
    public void fazResumo() throws NoSuchAlgorithmException, IOException {
        StringBuffer conteudo = leArquivo(SuperFatorialFile.FILE);
        byte[] resumo = calculaResumo(conteudo);
        gravaResumo(resumo);
    }

    /**
     * Verifica igualdade entre resumos
     *
     * @return igualdade entre resumos salvo e novo
     * @throws NoSuchAlgorithmException
     */
    public boolean verificaResumo() throws NoSuchAlgorithmException, IOException {
        StringBuffer conteudo = leArquivo(SuperFatorialFile.FILE);
        StringBuffer resumo = new StringBuffer();
        byte[] resumoBytes = calculaResumo(conteudo);
        for (byte bytes : resumoBytes) {
            resumo.append(String.format("%02x", bytes & 0xff));
        }
        
        StringBuffer resumoGravado = leArquivo(FILE);
        
        return resumo.toString().equals(resumoGravado.toString());
    }

    /**
     * @param conteudo
     * @return bytes de resumo
     * @throws NoSuchAlgorithmException
     */
    private byte[] calculaResumo(StringBuffer conteudo) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        messageDigest = MessageDigest.getInstance("SHA-512");
        messageDigest.update(conteudo.toString().getBytes());
        return messageDigest.digest();
    }

    /**
     * Grava resumo em arquivo
     *
     * @param resumo
     */
    private void gravaResumo(byte[] resumo) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte bytes : resumo) {
            stringBuffer.append(String.format("%02x", bytes & 0xff));
        }
        gravaArquivo(stringBuffer, FILE);
    }

    /**
     * Lê arquivo
     *
     * @return conteúdo de arquivo
     */
    private StringBuffer leArquivo(String arquivo) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(arquivo));
        String conteudo = new String(encoded, "ISO-8859-1");
        return new StringBuffer(conteudo);
    }

    /**
     * Grava em arquivo
     * 
     * @param stringBuffer
     */
    private void gravaArquivo(StringBuffer stringBuffer, String arquivo) throws IOException {
        BufferedWriter bwr = new BufferedWriter(new FileWriter(new File(arquivo)));
        bwr.write(stringBuffer.toString());
        bwr.flush();
        bwr.flush();
    }

}
