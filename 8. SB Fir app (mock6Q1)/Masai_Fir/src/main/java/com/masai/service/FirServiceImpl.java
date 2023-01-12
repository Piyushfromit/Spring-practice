package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entity.Fir;
import com.masai.entity.User;
import com.masai.exception.FirException;
import com.masai.repo.FirDao;
import com.masai.repo.UserDao;

@Service
public class FirServiceImpl implements FirService {
	
	@Autowired
	private FirDao fdao;
	
	@Autowired
	private UserDao udao;

	@Override
	public Fir addfir( Integer u_id,Fir fir) throws FirException {
		// TODO Auto-generated method stub
	      User user=udao.findById(u_id).get();
	
		if(user==null) {
			throw new FirException("user not found ..");
		}
		
		if(fir==null) {
			throw new FirException("add valid fir...");
		}
		fdao.save(fir);
		return fir;
	}

}
