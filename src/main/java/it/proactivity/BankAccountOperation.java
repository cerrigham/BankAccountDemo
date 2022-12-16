package it.proactivity;

import java.time.LocalDate;
import java.util.Objects;

public class BankAccountOperation {

    private Long id;
    private LocalDate operationDate;
    private BankAccountOpertionEnum operationType;
    private String operationDetail;
    private Float amount;

    public BankAccountOperation() {

    }

    public BankAccountOperation(Long id, LocalDate operationDate, BankAccountOpertionEnum operationType,
                                String operationDetail, Float amount) {
        this.id = id;
        this.operationDate = operationDate;
        this.operationType = operationType;
        this.operationDetail = operationDetail;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(LocalDate operationDate) {
        this.operationDate = operationDate;
    }

    public BankAccountOpertionEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(BankAccountOpertionEnum operationType) {
        this.operationType = operationType;
    }

    public String getOperationDetail() {
        return operationDetail;
    }

    public void setOperationDetail(String operationDetail) {
        this.operationDetail = operationDetail;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccountOperation that = (BankAccountOperation) o;
        return Objects.equals(id, that.id) && Objects.equals(operationDate, that.operationDate)
                && operationType == that.operationType && Objects.equals(operationDetail, that.operationDetail)
                && Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, operationDate, operationType, operationDetail, amount);
    }

    @Override
    public String toString() {
        return "BankAccountOperation{" +
                "id=" + id +
                ", operationDate=" + operationDate +
                ", operationType=" + operationType +
                ", operationDetail='" + operationDetail + '\'' +
                ", amount=" + amount +
                '}';
    }
}
