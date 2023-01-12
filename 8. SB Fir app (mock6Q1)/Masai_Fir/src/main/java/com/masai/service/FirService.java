package com.masai.service;

import com.masai.entity.Fir;
import com.masai.exception.FirException;

public interface FirService {
	
	public Fir addfir( Integer u_id,Fir fir)throws FirException;

}
