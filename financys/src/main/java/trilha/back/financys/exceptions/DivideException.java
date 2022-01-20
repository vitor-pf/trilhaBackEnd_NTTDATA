package trilha.back.financys.exceptions;

import java.io.Serializable;

public class DivideException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 1L;

    public DivideException(String msg){
        super(msg);
    }
}
