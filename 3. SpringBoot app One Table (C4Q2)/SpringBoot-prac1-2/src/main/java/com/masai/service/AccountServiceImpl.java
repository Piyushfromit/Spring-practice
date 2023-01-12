package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dao.AccountDao;
import com.masai.exception.AccountException;
import com.masai.exception.InsufficientFundException;
import com.masai.model.Account;
import com.masai.model.AccountDTO;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountDao dao;

	@Override
	public Account openAccount(Account acc) throws AccountException {
		// TODO Auto-generated method stub
		if (acc == null) {
			throw new AccountException("account not found");
		}

		dao.save(acc);
		return acc;
	}

	@Override
	public Account closeAccount(Integer accno) throws AccountException {
		// TODO Auto-generated method stub
		Optional<Account> acc = dao.findById(accno);

		if (acc.isPresent()) {
			dao.delete(acc.get());
		} else {
			throw new AccountException("account not found");
		}
		return acc.get();
	}

	@Override
	public Account depositAmount(Integer accno, Integer amount) throws AccountException {
		// TODO Auto-generated method stub
		Optional<Account> acc = dao.findById(accno);
		Account e = null;
		if (acc.isPresent()) {
			e = acc.get();
			e.setBalance(e.getBalance() + amount);
			dao.save(e);
		} else {
			throw new AccountException("account not found");
		}
		return e;
	}

	@Override
	public Account withdrawAmount(int accno, Integer amount) throws AccountException, InsufficientFundException {
		// TODO Auto-generated method stub

		Optional<Account> acc = dao.findById(accno);
		Account e = null;
		if (acc.isPresent()) {
			e = acc.get();
			if (e.getBalance() < amount) {
				throw new InsufficientFundException("insufficent balance");
			} else {
				e.setBalance(e.getBalance() - amount);
				dao.save(e);
			}

		} else {
			throw new AccountException("account not found");
		}

		return null;
	}

	@Override
	public String transferAmount(AccountDTO dto) throws AccountException, InsufficientFundException {
		// TODO Auto-generated method stub
		String str="not transfer";
		Optional<Account> srcacc = dao.findById(dto.getSrcAccno());
		Optional<Account> desacc = dao.findById(dto.getDesAccno());
		if (srcacc.isEmpty() || desacc.isEmpty()) {
			throw new AccountException("account not found");
		} else {
          
		Account sr=	srcacc.get();
		Account dr=desacc.get();
		
		if(dr.getBalance()<dto.getAmount()) {
			throw new InsufficientFundException("balance insufficent");
		}else {
			sr.setBalance(sr.getBalance()+dto.getAmount());
			dr.setBalance(dr.getBalance()-dto.getAmount());
			dao.save(sr);
			dao.save(dr);
			str="transfer succesfully";
			
		}
		
			
		}

		return str;
	}

}
