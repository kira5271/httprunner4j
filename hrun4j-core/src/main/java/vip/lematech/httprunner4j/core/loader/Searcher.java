package vip.lematech.httprunner4j.core.loader;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import vip.lematech.httprunner4j.base.TestBase;
import vip.lematech.httprunner4j.common.Constant;
import vip.lematech.httprunner4j.common.DefinedException;
import vip.lematech.httprunner4j.config.RunnerConfig;
import vip.lematech.httprunner4j.helper.LogHelper;
import vip.lematech.httprunner4j.helper.FilesHelper;
import lombok.Data;

import java.io.File;
import java.net.URL;
import java.util.Objects;

/**
 * seracher file by file path
 *
 * website http://lematech.vip/
 * @author lematech@foxmail.com
 * @version 1.0.0
 */
@Data
public class Searcher {

    /**
     * run mode
     * supports cli 、api integration
     */
    private RunnerConfig.RunMode runMode;

    /**
     * work directory
     */
    private String workDirectory;


    public Searcher() {
        runMode = RunnerConfig.getInstance().getRunMode();
        workDirectory = RunnerConfig.getInstance().getWorkDirectory().getAbsolutePath();
    }

    /**
     * quickly search file by file path
     * @param filePath The file path
     * @return File object
     */
    public File quicklySearchFile(String filePath) {
        if (StrUtil.isEmpty(filePath)) {
            String exceptionMsg = String.format("FilePath can not null or empty");
            throw new DefinedException(exceptionMsg);
        }
        if (StrUtil.isEmpty(FileUtil.extName(filePath))) {
            filePath = filePath + Constant.DOT_PATH + RunnerConfig.getInstance().getTestCaseExtName();
        }
        File searchFile = null;
        if (runMode == RunnerConfig.RunMode.CLI) {
            if (FileUtil.isAbsolutePath(filePath)) {
                searchFile = new File(filePath);
            } else {
                searchFile = new File(workDirectory, FilesHelper.filePathDecode(filePath));
            }
        } else if (runMode == RunnerConfig.RunMode.POM) {
            if (!filePath.startsWith(File.separator)) {
                filePath = File.separator + filePath;
            }
            URL url = TestBase.class.getResource(filePath);
            if (Objects.isNull(url)) {
                String exceptionMsg = String.format("The file %s was not found under the resources", filePath);
                throw new DefinedException(exceptionMsg);
            }
            searchFile = new File(FilesHelper.filePathDecode(url.getPath()));
        }
        if (Objects.isNull(searchFile)) {
            String exceptionMsg = String.format("File %s is not exist", filePath);
            throw new DefinedException(exceptionMsg);
        }
        if (!searchFile.exists() || !searchFile.isFile()) {
            String exceptionMsg = String.format("The file %s was not found in the current path %s", searchFile.getName(), FileUtil.getAbsolutePath(searchFile.getParentFile()));
            throw new DefinedException(exceptionMsg);
        }
        LogHelper.debug("Run mode: {}, Test case path {}", runMode, FileUtil.getAbsolutePath(searchFile));
        return searchFile;
    }

    /**
     * @param dataFileType  The data file type
     * @param directoryName The directory name
     * @return file path of splice
     */
    public String spliceFilePath(String dataFileType, String directoryName) {
        if (!dataFileType.startsWith(directoryName + File.separator) &&
                !dataFileType.startsWith(File.separator + directoryName + File.separator)) {
            dataFileType = directoryName + File.separator + dataFileType;
        }
        if (FileUtil.isAbsolutePath(dataFileType)) {
            dataFileType = Constant.DOT_PATH + dataFileType;
        }
        if (StrUtil.isEmpty(FileUtil.extName(dataFileType))) {
            dataFileType = dataFileType + Constant.DOT_PATH + RunnerConfig.getInstance().getTestCaseExtName();
        }
        return dataFileType;
    }


}
