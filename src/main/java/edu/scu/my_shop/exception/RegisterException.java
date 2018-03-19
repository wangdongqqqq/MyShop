package edu.scu.my_shop.exception;

/**
 * 登录异常
 */
public class RegisterException extends RuntimeException{

    /**
     * 错误码
     */
    private Integer code = 101;

    public RegisterException(String message) {
        super(message);
    }

    public Integer getCode() {
        return code;
    }
}
