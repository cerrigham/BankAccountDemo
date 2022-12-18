package it.proactivity;

import java.time.LocalDate;
import java.util.List;

public class PredicateUtility {
    public static Boolean filterBetweenInterval(LocalDate operation, LocalDate from, LocalDate to) {
        if ((operation.isBefore(to)|| operation.isEqual(to)) && (operation.isAfter(from) || operation.isEqual(from))) {
            return true;
        }else {
            return false;
        }
    }

    public static Boolean filterInitialLetter(BankAccountOperation bankAccountOperation, String initial) {

        String[] array = bankAccountOperation.getOperationDetail().split(" ");
        if (array[array.length - 1].startsWith(initial)) {
            return true;
        }else {
            return false;
        }
    }
}
