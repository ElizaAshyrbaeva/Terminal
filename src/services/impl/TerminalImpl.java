package services.impl;

import classes.Person;
import classes.Terminal;
import services.TerminalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TerminalImpl implements TerminalInterface {
    private List<Terminal> terminals = new ArrayList<>();
    @Override
    public String creatTerminal(Terminal... terminal) {
       terminals.addAll(Arrays.asList(terminal));

        return  "Created Terminals!";
    }

    @Override
    public List<Terminal> getAllTerminal() {
        return terminals;
    }

    @Override
    public String transferToCard(Person person, String cardNumber, double summa) {
        try {
            if(summa < 0)throw new Exception("Negative numbers!");
            if (person.getBankAccount().getCardNumber().equals(cardNumber)) {
                String s = person.getBankAccount().getCardNumber() + summa;
            }
        }catch (Exception e){
            e.printStackTrace();
        }return "You money successfully added";
    }

    @Override
    public String transferToPhoneNumber(Person person, String phoneNumber, double summa) {
        if(person.getPhoneNumber().equals(phoneNumber)){
            double s = person.getBankAccount().getBalance()-summa;
            }
        return "You money successfully added";

    }
}
