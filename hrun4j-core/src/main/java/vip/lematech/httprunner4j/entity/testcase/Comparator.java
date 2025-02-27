package vip.lematech.httprunner4j.entity.testcase;

import lombok.Data;

import java.util.Objects;

/**
 * website http://lematech.vip/
 * @author lematech@foxmail.com
 * @version 1.0.0
 */
@Data
public class Comparator {
    private Object check;
    private String comparator;
    private Object expect;

    /**
     * set comparator defualt is equalTo
     *
     * @param comparator comparator object
     */
    public void setComparator(String comparator) {
        if (Objects.isNull(this.comparator)) {
            this.comparator = "equalTo";
        }
        this.comparator = comparator;
    }
}
