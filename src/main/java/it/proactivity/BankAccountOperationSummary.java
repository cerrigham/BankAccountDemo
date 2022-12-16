package it.proactivity;

import java.time.LocalDate;
import java.util.Objects;

public class BankAccountOperationSummary {

    private LocalDate operationDate;
    private BankAccountOpertionEnum operationType;
    private Float amount;

    public BankAccountOperationSummary() {

    }

    public BankAccountOperationSummary(LocalDate operationDate, BankAccountOpertionEnum operationType, Float amount) {
        this.operationDate = operationDate;
        this.operationType = operationType;
        this.amount = amount;
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
        BankAccountOperationSummary that = (BankAccountOperationSummary) o;
        return Objects.equals(operationDate, that.operationDate) && operationType == that.operationType
                && Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationDate, operationType, amount);
    }

    @Override
    public String toString() {
        return "BankAccountOperationSummary{" +
                "operationDate=" + operationDate +
                ", operationType=" + operationType +
                ", amount=" + amount +
                '}';
    }
}
