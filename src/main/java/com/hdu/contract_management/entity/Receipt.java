package com.hdu.contract_management.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 发票
 * </p>
 *
 * @author hyq
 * @since 2020-05-03
 */
public class Receipt extends Model<Receipt> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 发票号码
     */
    private Integer receiptNumber;

    /**
     * 发票代码
     */
    private Integer receiptCode;

    /**
     * 发票金额
     */
    private Integer amount;

    /**
     * 对方单位名称
     */
    @TableField("partyB")
    private String partyB;

    /**
     * 开票收票名称
     */
    private String receiptName;

    /**
     * 开收票日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate receiptDate;

    /**
     * 开票人员
     */
    private Integer operator;

    /**
     * 关联履行记录id
     */
    private Integer recordId;

    /**
     * 备注
     */
    private String notes;

    /**
     * 状态 0：未完成 1 已完成
     */
    private Boolean finish;

    /**
     * 第二审批人员，也就是部门负责人
     */
    private Integer secondOperator;

    /**
     * 0：开票 1：收票
     */
    private Integer type;

    /**
     * 合同经办人id
     */
    private Integer belong;
    /**
     * 归属合同ID
     */
    private Integer contractId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(Integer receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public Integer getReceiptCode() {
        return receiptCode;
    }

    public void setReceiptCode(Integer receiptCode) {
        this.receiptCode = receiptCode;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getPartyB() {
        return partyB;
    }

    public void setPartyB(String partyB) {
        this.partyB = partyB;
    }

    public String getReceiptName() {
        return receiptName;
    }

    public void setReceiptName(String receiptName) {
        this.receiptName = receiptName;
    }

    public LocalDate getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(LocalDate receiptDate) {
        this.receiptDate = receiptDate;
    }

    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Boolean getFinish() {
        return finish;
    }

    public void setFinish(Boolean finish) {
        this.finish = finish;
    }

    public Integer getSecondOperator() {
        return secondOperator;
    }

    public void setSecondOperator(Integer secondOperator) {
        this.secondOperator = secondOperator;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getBelong() {
        return belong;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public void setBelong(Integer belong) {
        this.belong = belong;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "id=" + id +
                ", receiptNumber=" + receiptNumber +
                ", receiptCode=" + receiptCode +
                ", amount=" + amount +
                ", partyB='" + partyB + '\'' +
                ", receiptName='" + receiptName + '\'' +
                ", receiptDate=" + receiptDate +
                ", operator=" + operator +
                ", recordId=" + recordId +
                ", notes='" + notes + '\'' +
                ", finish=" + finish +
                ", secondOperator=" + secondOperator +
                ", type=" + type +
                ", belong=" + belong +
                ", contractId=" + contractId +
                '}';
    }
}
