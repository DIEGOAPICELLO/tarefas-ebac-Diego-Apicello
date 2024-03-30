package exceptions;

public class TipoChaveNaoEncontradaException {
    private static final long serialVersionUID = 1389494676398525746L;
    public TipoChaveNaoEncontradaException(String msg) {
        this(msg, null);
    }

    public TipoChaveNaoEncontradaException(String msg, Throwable e) {
        super();
    }
}
