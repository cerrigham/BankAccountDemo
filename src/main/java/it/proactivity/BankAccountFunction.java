package it.proactivity;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import static it.proactivity.Predicate.initialName;
import static it.proactivity.Predicate.intervalDate;

public class BankAccountFunction {

    // create a new BankAccount
    public static BankAccount createBankAccount(String iban, String ownerName, String ownerSurname) {
        return new BankAccount(iban, ownerName, ownerSurname);
    }

    // total BankAccount operation
    public static long totalBankAccountOperation(BankAccount bankAccount) {

        return bankAccount.getBankAccountOperationList()
                .stream()
                .count();
    }

    // total BankAccount operation type Balance
    public static long totalBankAccountBalanceOperation(BankAccount bankAccount) {

        return bankAccount.getBankAccountOperationList()
                .stream()
                .map(BankAccountOperation::getOperationType)
                .distinct()
                .count();
    }

    // total of the amount of BankAccount operation type Transfer
    public static Float totalAmountOfMoneyTransfer(BankAccount bankAccount) {

        List<Float> totalList = bankAccount.getBankAccountOperationList()
                .stream()
                .filter(f -> f.getOperationType().equals(BankAccountOpertionEnum.Transfer))
                .map(BankAccountOperation::getAmount)
                .collect(Collectors.toList());
        Float total = 0f;
        return total;
    }

    // list of BankAccountOperationSummary from all BankAccountOperation
    public static List<BankAccountOperationSummary> bankAccountOperationSummaryList(BankAccount bankAccount) {
        return bankAccount.getBankAccountOperationList()
                .stream()
                .map(m -> new BankAccountOperationSummary(m.getOperationDate(), m.getOperationType(), m.getAmount()))
                .collect(Collectors.toList());
    }

    // list of BankAccountOperationSummary from all BankAccountOperation with interval date
    public static List<BankAccountOperationSummary> bankAccountOperationSummaryListBetweenInterval(
            BankAccount bankAccount, LocalDate from, LocalDate to) {
        return  bankAccount.getBankAccountOperationList()
                .stream()
                .filter(f -> intervalDate(f.getOperationDate(), from, to))
                .map(f -> new BankAccountOperationSummary(f.getOperationDate(), f.getOperationType(), f.getAmount()))
                .collect(Collectors.toList());
    }

    // list of BankAccountOperationSummary from all money transfer to people wich name start by nameStart
    public static List<BankAccountOperationSummary> moneyTransferToPeopleWithInitialNameStart(
            BankAccount bankAccount, String nameStart) {
        return bankAccount.getBankAccountOperationList()
                .stream()
                .filter(f -> initialName(f, nameStart))
                .map(f -> new BankAccountOperationSummary(f.getOperationDate(), f.getOperationType(), f.getAmount()))
                .collect(Collectors.toList());
    }
}
