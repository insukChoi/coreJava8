package ch5.exercise;

public enum ex4ExceptionCode {
    IO_EXEPTION_CODE(800, "The request is invalid"),
    NUMBERFORMAT_EXEPTION_CODE(801, "Required query parameter is missing");

    private final int id;
    private final String msg;

    ex4ExceptionCode(int id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    public int getId() {
        return this.id;
    }

    public String getMsg() {
        return this.msg;
    }
}