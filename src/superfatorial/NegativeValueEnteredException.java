package superfatorial;

public class NegativeValueEnteredException extends InputException {
    private static final String NEGATIVE_EXCEPTION = "Números negativos não têm fatorial";

    public NegativeValueEnteredException() {
        super(NEGATIVE_EXCEPTION);
    }
}