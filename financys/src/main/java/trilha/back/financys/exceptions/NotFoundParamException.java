package trilha.back.financys.exceptions;

import java.io.Serializable;

public class NotFoundParamException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 1L;

    public NotFoundParamException(String msg){
        super(msg);
    }
}
