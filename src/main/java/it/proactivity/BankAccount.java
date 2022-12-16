package it.proactivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BankAccount {

    private String iban;
    private String ownerName;
    private String ownerSurname;
    private List<BankAccountOperation> bankAccountOperationList = new ArrayList<>();

    public BankAccount() {}

    public BankAccount(String iban, String ownerName, String ownerSurname) {
        this.iban = iban;
        this.ownerName = ownerName;
        this.ownerSurname = ownerSurname;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerSurname() {
        return ownerSurname;
    }

    public void setOwnerSurname(String ownerSurname) {
        this.ownerSurname = ownerSurname;
    }

    public List<BankAccountOperation> getBankAccountOperationList() {
        return bankAccountOperationList;
    }

    public void setBankAccountOperationList(List<BankAccountOperation> bankAccountOperationList) {
        this.bankAccountOperationList = bankAccountOperationList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Objects.equals(iban, that.iban) && Objects.equals(ownerName, that.ownerName)
                && Objects.equals(ownerSurname, that.ownerSurname)
                && Objects.equals(bankAccountOperationList, that.bankAccountOperationList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iban, ownerName, ownerSurname, bankAccountOperationList);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "iban='" + iban + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", ownerSurname='" + ownerSurname + '\'' +
                ", bankAccountOperationList=" + bankAccountOperationList +
                '}';
    }
}
