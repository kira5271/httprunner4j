package vip.lematech.httprunner4j.core.enums;

/**
 * @author lematech@foxmail.com
 * @version 1.0.0
 * website http://lematech.vip/
 */
public interface BusinessCode {
    /**
     * 获取响应提示信息
     *
     * @return 提升信息
     */
    String getMessage();

    /**
     * 获取响应码
     *
     * @return 响应码
     */
    String getCode();
}
