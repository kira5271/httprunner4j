package vip.lematech.httprunner4j.core.entity;

import lombok.Data;

/**
 * @author lematech@foxmail.com
 * @version 1.0.0
 * website http://lematech.vip/
 */
@Data
public class User {
    private Integer uid;
    private String name;
    private String password;
}
