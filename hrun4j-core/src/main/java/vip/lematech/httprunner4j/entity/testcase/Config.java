package vip.lematech.httprunner4j.entity.testcase;

import com.fasterxml.jackson.annotation.JsonProperty;
import vip.lematech.httprunner4j.entity.base.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * website http://lematech.vip/
 * @author lematech@foxmail.com
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class Config<T> extends BaseModel {
    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "base_url")
    private String baseUrl;
    @JsonProperty(value = "verify")
    private Boolean verify;
    /**
     * map<k,values>:
     * user_id: [1001, 1002, 1003, 1004]
     */
    private T parameters;
}
