package hello.jdbc.repository.ex;

public class MyDuplicateKeyException extends MyDbException{ // extends MyDbException DB오류 카테고리로 묶을수 있음

    public MyDuplicateKeyException() {
    }

    public MyDuplicateKeyException(String message) {
        super(message);
    }

    public MyDuplicateKeyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyDuplicateKeyException(Throwable cause) {
        super(cause);
    }
}
