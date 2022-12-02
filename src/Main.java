import classes.BankAccount;
import classes.Person;
import classes.Terminal;
import enams.Bank;
import enams.Mobile;
import services.impl.BankAccountImpl;
import services.impl.PersonImpl;
import services.impl.TerminalImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(Bank.KYRGYZSTAN_BANK, 2345.67, "3456", "2332");
        BankAccount bankAccount2 = new BankAccount(Bank.OPTIMA_BANK, 2345.67, "5678", "2332");
        BankAccount bankAccount3 = new BankAccount(Bank.AIYL_BANK, 2345.67, "1234", "2332");
        BankAccount bankAccount4 = new BankAccount(Bank.RSK_BANK, 2345.67, "8765", "2332");
        BankAccount bankAccount5 = new BankAccount(Bank.BAKAY_BANK, 2345.67, "3567", "2332");
        ArrayList<BankAccount> bankAccounts = new ArrayList<>(Arrays.asList(
                bankAccount1, bankAccount2, bankAccount3, bankAccount4, bankAccount5
        ));
        Terminal terminal1 = new Terminal(Mobile.O, "Pink");
        Terminal terminal2 = new Terminal(Mobile.BEELINE, "Yellow");
        Terminal terminal3 = new Terminal(Mobile.MEGACOM, "Green");
        ArrayList<Terminal> terminals = new ArrayList<>(Arrays.asList(terminal1, terminal2, terminal3));


        Person person1 = new Person("Eliza", "Abdimitalipovvna", "eliza@gmail.com", "+996225171735", "2332", bankAccount1);
        Person person2 = new Person("Nuriza", "Muratova", "nuriza@gmail.com", "+99622345678", "4554", bankAccount2);
        Person person3 = new Person("Kuban", "Kelsinbekov", "kuban@gmail.com", "+99655748392", "4554", bankAccount3);
        Person person4 = new Person("Alibek", "Altynbek u", "alibek@gmail.com", "+99677896543", "6776", bankAccount3);
        Person person5 = new Person("Adil", "Aitbaev", "adil@gmail.com", "+99622234567890", "7887", bankAccount5);
        ArrayList<Person> people = new ArrayList<>(Arrays.asList(person1, person2, person3, person4, person5));

        try {
            BankAccountImpl bank = new BankAccountImpl();
            PersonImpl person = new PersonImpl();
            TerminalImpl terminal = new TerminalImpl();
            while (true) {
                int number = new Scanner(System.in).nextInt();
                if (number == 1)
                    System.out.println(bank.createBankAccount(bankAccount1, bankAccount2, bankAccount3));
                else if (number == 2) System.out.println(bank.getAllBankAccount());
                else if (number == 3) {
                    System.out.println(  bank.credit(person1, Bank.BAKAY_BANK, 10, 1000));
                    System.out.println(person1);
                } else if (number == 4)
                    System.out.println(person.createPerson(person1, person2, person3, person4, person5));
                else if (number == 5) System.out.println(person.getAllPeople());
                else if (number == 6) System.out.println(terminal.creatTerminal(terminal1, terminal2, terminal3));
                else if (number == 7) System.out.println(terminal.getAllTerminal());
                else if (number == 8) {
                    System.out.println(terminal.transferToCard(person2, "4554", 2000));
                    System.out.println(person2);
                } else if (number == 9) {
                    System.out.println(terminal.transferToPhoneNumber(person3, "1234", 1000));
                    System.out.println(person3);
                } else throw new Exception("Wrong input!");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

