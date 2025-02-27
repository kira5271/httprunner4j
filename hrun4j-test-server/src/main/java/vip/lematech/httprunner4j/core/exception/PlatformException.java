package vip.lematech.httprunner4j.core.exception;


import vip.lematech.httprunner4j.core.enums.BusinessCode;

/**
 * @author lematech@foxmail.com
 * @version 1.0.0
 * website http://lematech.vip/
 */
public class PlatformException extends RuntimeException {
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String code;
    private String msg;
    private BusinessCode businessCode;

    public PlatformException(BusinessCode businessCode) {
        super(businessCode.getMessage());
        this.code = businessCode.getCode();
        this.businessCode = businessCode;
    }

    public PlatformException(String message) {
        super(message);
        this.msg = message;
    }

    public PlatformException(Throwable cause) {
        super(cause.getMessage());
    }

}
