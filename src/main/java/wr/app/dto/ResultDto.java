package wr.app.dto;

public class ResultDto {
    String resultCd;
    String resultMsg;
    Object resultData;

    public ResultDto(String resultCd, String resultMsg, Object resultObj) {
        this.resultCd = resultCd;
        this.resultMsg = resultMsg;
        this.resultData = resultObj;
    }
}
