package dtu.service;


import dtu.ws.fastmoney.Account;
import dtu.ws.fastmoney.BankServiceException_Exception;
import dtu.ws.fastmoney.BankSingleton;
import dtu.ws.fastmoney.User;
import model.DTUPayUser;

import java.math.BigDecimal;

public class BankService implements IBankService {

    private dtu.ws.fastmoney.BankService bank = BankSingleton.getBank();

    @Override
    public String createAccountWithBalance(DTUPayUser user, BigDecimal initialBalance) throws BankServiceException_Exception {

        User fastMoneyUser = new User();

        fastMoneyUser.setCprNumber(user.getCprNumber());
        fastMoneyUser.setFirstName(user.getFirstName());
        fastMoneyUser.setLastName(user.getLastName());

        return this.bank.createAccountWithBalance(fastMoneyUser, initialBalance);
    }

    @Override
    public Account getAccount(String accountNumber) throws BankServiceException_Exception {
        return this.bank.getAccount(accountNumber);
    }

    @Override
    public Account getAccountByCpr(String cpr) throws BankServiceException_Exception {
        return this.bank.getAccountByCprNumber(cpr);
    }

    @Override
    public void retireAccount(String accountNumber) throws BankServiceException_Exception {
        this.bank.retireAccount(accountNumber);
    }

    @Override
    public void transferMoneyFromTo(String fromAccountNumber, String toAccountNumber, BigDecimal amount, String description) throws BankServiceException_Exception {
        this.bank.transferMoneyFromTo(fromAccountNumber, toAccountNumber, amount, description);
    }
}