package it.proactivity;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import static it.proactivity.PredicateUtility.filterBetweenInterval;

public class BankAccountFunction {

    // create a new BankAccount
    public static BankAccount createBanckAccount(String iban, String ownerName, String ownerSurname) {
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
        List<Float> floatList = bankAccount.getBankAccountOperationList()
                .stream()
                .filter(b -> b.getOperationType().equals(BankAccountOpertionEnum.Transfer))
                .map(BankAccountOperation::getAmount)
                .collect(Collectors.toList());
        Float result =0f;

        for (Float f : floatList) {
            result+= f;
        }
        return result;
    }

    // list of BankAccountOperationSummary from all BankAccountOperation
    public static List<BankAccountOperationSummary> bankAccountOperationSummaryList(BankAccount bankAccount) {
        return bankAccount.getBankAccountOperationList()
                .stream()
                .map(b -> new BankAccountOperationSummary(b.getOperationDate(),b.getOperationType(),b.getAmount()))
                .collect(Collectors.toList());
    }

    // list of BankAccountOperationSummary from all BankAccountOperation with interval date
    public static List<BankAccountOperationSummary> bankAccountOperationSummaryListBetweenInterval(
            BankAccount bankAccount, LocalDate from, LocalDate to) {
        return bankAccount.getBankAccountOperationList()
                .stream()
                .filter(b -> filterBetweenInterval(b.getOperationDate(),from,to))
                .map(b -> new BankAccountOperationSummary(b.getOperationDate(),b.getOperationType(),b.getAmount()))
                .collect(Collectors.toList());
    }

    // list of BankAccountOperationSummary from all money transfer to people wich name start by nameStart
    public static List<BankAccountOperationSummary> moneyTransferToPeopleWithInitialNameStart(
            BankAccount bankAccount, String nameStart) {

          return bankAccount.getBankAccountOperationList()
                .stream()
                .filter(b -> PredicateUtility.filterInitialLetter(b,nameStart))
                .map(b -> new BankAccountOperationSummary(b.getOperationDate(),b.getOperationType(),b.getAmount()))
                .collect(Collectors.toList());
    }
}
