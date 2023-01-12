package com.masai.service;

import com.masai.exception.AccountException;
import com.masai.exception.InsufficientFundException;
import com.masai.model.Account;
import com.masai.model.AccountDTO;

public interface AccountService {
	
	public Account openAccount(Account acc)throws AccountException;
	public Account closeAccount(Integer accno)throws AccountException;
	public Account depositAmount(Integer accno, Integer amount)throws
	AccountException;
	//after deposit amount return the updated Account object.
	public Account withdrawAmount(int accno, Integer amount)throws
	AccountException, InsufficientFundException;
	public String transferAmount(AccountDTO dto)throws AccountException,
	InsufficientFundException;
	 

}
