package com.tinet.clink.openapi.model;

/**
 * 满意度调查返回对象
 *
 * @author huwk
 * @date 2018/09/25
 **/
public class CdrInvestigationModel {

    /**
     * 热线号码
     */
    private String hotline;

    /**
     * 中继号
     */
    private String numberTrunk;

    /**
     * 队列号
     */
    private String queue;

    /**
     * 客户号码
     */
    private String customerNumber;

    /**
     * 呼叫类型
     */
    private String callType;

    /**
     * 座席工号
     */
    private String cno;

    /**
     * 座席名称
     */
    private String clientName;

    /**
     * 转移
     */
    private String transfer;

    /**
     * 咨询
     */
    private String consult;

    /**
     * 开始时间
     */
    private Long startTime;

    /**
     * 结束时间
     */
    private Long endTime;

    /**
     * 满意度按键值；当键值为 null 时，说明用户无按键操作
     */
    private Integer keys;

    public String getHotline() {
        return hotline;
    }

    public void setHotline(String hotline) {
        this.hotline = hotline;
    }

    public String getNumberTrunk() {
        return numberTrunk;
    }

    public void setNumberTrunk(String numberTrunk) {
        this.numberTrunk = numberTrunk;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getTransfer() {
        return transfer;
    }

    public void setTransfer(String transfer) {
        this.transfer = transfer;
    }

    public String getConsult() {
        return consult;
    }

    public void setConsult(String consult) {
        this.consult = consult;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Integer getKeys() {
        return keys;
    }

    public void setKeys(Integer keys) {
        this.keys = keys;
    }
}
