package it.proactivity;

import java.time.LocalDate;

public class Predicate {
    public static Boolean intervalDate(LocalDate operation, LocalDate from, LocalDate to) {
    if (operation.isBefore(to) && operation.isEqual(to) && operation.isAfter(from) && operation.isEqual(from)) {
        return true;
    }
    return false;
}

    public static Boolean initialName(BankAccountOperation operation, String initial) {
        String[] arrayOfStrings = operation.getOperationDetail().split(" ");
        if (arrayOfStrings[arrayOfStrings.length -1].startsWith(initial)) {
            return true;
        }
        return false;
    }
}
