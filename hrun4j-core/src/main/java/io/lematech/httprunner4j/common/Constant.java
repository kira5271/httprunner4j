package io.lematech.httprunner4j.common;

/**
 * @author lematech@foxmail.com
 * @version 1.0.0
 * @className Constant
 * @description Constant definition
 * @created 2021/1/20 10:50 上午
 * @publicWechat lematech
 */
public class Constant {
    /**
     * self-defined environment variable
     */
    public static final String ENV_FILE_NAME = ".env";
    /**
     * root package name
     */
    public static final String SELF_ROOT_PKG_NAME = "io.lematech.httprunner4j";
    public static final String TEST_TEMPLATE_FILE_PATH = "testClass.vm";
    public static final String SUPPORT_TEST_CASE_FILE_EXT_JSON_NAME = "json";
    public static final String SUPPORT_TEST_CASE_FILE_EXT_YML_NAME = "yml";
    public static final String TEST_CASE_SCHEMA = "/schemas/testcase.json";
    public static final String API_MODEL_SCHEMA = "/schemas/api.json";
    public static final String REGEX_EXPRESSION = "(?<=\\$\\{).*?(?=})";
    public static final String REGEX_EXPRESSION_FLAG = "(.*)\\$\\{(.*?)\\}(.*)";
    public static final String REGEX_EXPRESSION_REPLACE = "\\$\\{.*?}";

    public static final String REGEX_PARAMETERIZE_EXPRESSION_FLAG = "(.*)(?<=\\$\\{)P\\((.*)\\)(?=})(.*)";
    public static final String REGEX_PARAMETERIZE_EXPRESSION = "(?<=\\$\\{P\\()(.*?)(?=\\)})";

    public static final String DOT_PATH = ".";
    public static final String UNDERLINE = "_";
    /**
     * CHARSET UTF-8
     */
    public static final String CHARSET_UTF_8 = "UTF-8";
    /**
     * Internationalization Support CN
     */
    public static final String I18N_CN = "CN";

    /**
     * Internationalization Support US
     */
    public static final String I18N_US = "US";
    /**
     * url regex expression
     */
    public static final String URL_REGEX = "http(s)?://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]";
    /**
     * testcase directory name
     */
    public static final String TEST_CASE_DIRECTORY_NAME = "testcases";

    /**
     * api define directory name
     */
    public static final String API_DEFINE_DIRECTORY_NAME = "apis";

    /**
     * api define directory name
     */
    public static final String TEST_SUITE_DIRECTORY_NAME = "testsuites";

    /**
     * request variable name
     */
    public static final String REQUEST_VARIABLE_NAME = "$REQUEST";
    /**
     * response variable name
     */
    public static final String RESPONSE_VARIABLE_NAME = "$RESPONSE";

    /**
     * assert check point
     */
    public static final String ASSERT_CHECK = "check";
    /**
     * assert expect value
     */
    public static final String ASSERT_EXPECT = "expect";

    public static final String DATA_EXTRACTOR_REGEX_START = "^";

    /**
     * data extractor regex end
     */
    public static final String DATA_EXTRACTOR_REGEX_END = "$";

    /**
     * data extractor regex end
     */
    public static final String TEST_JAR_END_SUFFIX = "jar";

    /**
     * data extractor jsonpath start
     */
    public static final String DATA_EXTRACTOR_JSONPATH_START = "$.";

    /**
     * data extractor jmespath headers start
     */
    public static final String DATA_EXTRACTOR_JMESPATH_HEADERS_START = "headers.";

    /**
     * data extractor jmespath content start
     */
    public static final String DATA_EXTRACTOR_JMESPATH_Content_START = "content.";

    /**
     * Parameter separator
     */
    public static final String PARAMETER_SEPARATOR = "-";

    public static final String CSV_FILE_PATH_KEY = "CVS_FILE_PATH";
}