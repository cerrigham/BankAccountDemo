package it.proactivity;

import java.time.LocalDate;
import java.util.List;

public class BankAccountFunction {

    // create a new BankAccount
    public static BankAccount createBanckAccount(String iban, String ownerName, String ownerSurname) {
        return new BankAccount(iban, ownerName, ownerSurname);
    }

    // total BankAccount operation
    public static long totalBankAccountOperation(BankAccount bankAccount) {
        return 0l;
    }

    // total BankAccount operation type Balance
    public static long totalBankAccountBalanceOperation(BankAccount bankAccount) {
        return 0l;
    }

    // total of the amount of BankAccount operation type Transfer
    public static Float totalAmountOfMoneyTransfer(BankAccount bankAccount) {
        return 0f;
    }

    // list of BankAccountOperationSummary from all BankAccountOperation
    public static List<BankAccountOperationSummary> bankAccountOperationSummaryList(BankAccount bankAccount) {
        return null;
    }

    // list of BankAccountOperationSummary from all BankAccountOperation with interval date
    public static List<BankAccountOperationSummary> bankAccountOperationSummaryListBetweenInterval(
            BankAccount bankAccount, LocalDate from, LocalDate to) {
        return null;
    }

    // list of BankAccountOperationSummary from all money transfer to people wich name start by nameStart
    public static List<BankAccountOperationSummary> moneyTransferToPeopleWithInitialNameStart(
            BankAccount bankAccount, String nameStart) {
        return null;
    }
}
