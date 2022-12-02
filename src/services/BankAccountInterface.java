package services;

import classes.BankAccount;
import classes.Person;
import enams.Bank;

import java.util.List;

public interface BankAccountInterface {
     String createBankAccount(BankAccount... bankAccount);
     List<BankAccount> getAllBankAccount();
     double credit(Person person, Bank bank, int deposit, double summa) ;
}
