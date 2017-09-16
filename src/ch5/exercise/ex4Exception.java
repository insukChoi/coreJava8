package ch5.exercise;

public class ex4Exception extends Exception {
    private int errorCode;
    private String errorMsg;

    public ex4Exception(ex4ExceptionCode code) {
        this.errorMsg = code.getMsg();
        this.errorCode = code.getId();
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
