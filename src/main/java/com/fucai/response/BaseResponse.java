package com.fucai.response;

/**
 * @author liaoyubo
 * @version 1.0 2016/8/19
 * @description
 */
public class BaseResponse {
    /**
     * 返回码
     */
    private int code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 根据需要返回的数据
     */
    private String backDataNeed;

    private String filePath;
    private String fileName;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getBackDataNeed() {
        return backDataNeed;
    }

    public void setBackDataNeed(String backDataNeed) {
        this.backDataNeed = backDataNeed;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}

