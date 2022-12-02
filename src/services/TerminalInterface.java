package services;

import classes.Person;
import classes.Terminal;

import java.util.ArrayList;
import java.util.List;

public interface TerminalInterface {
       String creatTerminal(Terminal... terminal);
        List<Terminal> getAllTerminal();
      String transferToCard(Person person, String cardNumber, double summa);
      String transferToPhoneNumber(Person person, String phoneNumber, double summa);

}
