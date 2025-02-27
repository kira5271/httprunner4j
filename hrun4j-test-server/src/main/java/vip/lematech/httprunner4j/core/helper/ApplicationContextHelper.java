package vip.lematech.httprunner4j.core.helper;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
/**
 * @author lematech@foxmail.com
 * @version 1.0.0
 * website http://lematech.vip/
 */
public class ApplicationContextHelper {
    public static HttpServletRequest getHttpServletRequest() {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (servletRequestAttributes == null) {
            throw new RuntimeException("ServletRequestAttributes object is null");
        }
        return servletRequestAttributes.getRequest();
    }
}
