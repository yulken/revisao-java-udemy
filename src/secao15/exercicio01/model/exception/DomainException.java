package secao15.exercicio01.model.exception;

public class DomainException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    
    public DomainException(String str) {
        super(str);
    }

}