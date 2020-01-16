package dtu.service;

import dtu.ws.fastmoney.Account;
import dtu.ws.fastmoney.BankServiceException_Exception;
import model.DTUPayUser;

import java.math.BigDecimal;

public interface IBankService {

    String createAccountWithBalance(DTUPayUser user, BigDecimal initialBalance) throws BankServiceException_Exception;
    Account getAccount(String accountNumber) throws BankServiceException_Exception;
    Account getAccountByCpr(String cpr) throws BankServiceException_Exception;
    void retireAccount(String accountNumber) throws BankServiceException_Exception;
    void transferMoneyFromTo(String fromAccountNumber, String toAccountNumber, BigDecimal amount, String description) throws BankServiceException_Exception;
}