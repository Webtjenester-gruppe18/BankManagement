package dtu.ws.fastmoney;

import javax.inject.Singleton;

public class BankSingleton {
    private static BankService bank;

    public static BankService getBank() {
        if (bank == null) {
            synchronized (Singleton.class) {
                if (bank == null) {
                    bank = new BankServiceService().getBankServicePort();
                }
            }

        }
        return bank;
    }

}
