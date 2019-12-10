package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    ArrayList<BankAccount> ourBank = new ArrayList<>();

    public void removeBankAccountByIndex(Integer indexNumber) {
        ourBank.remove(indexNumber);
    }

    public void addBankAccount(BankAccount bankAccount) {
        ourBank.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        if (ourBank.contains(bankAccount)){
            return true;
        }
        return false;
    }
}
