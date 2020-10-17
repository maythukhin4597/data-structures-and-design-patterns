package behavioral.chainOfResponsibility.journaldev;

public interface DispenseChain {
    void setChain(DispenseChain dispenseChain);

    void dispense(Currency currency);
}
