package com.apiceno.Residuos.ImplServ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiceno.Residuos.dao.ResiduoDao;
import com.apiceno.Residuos.entity.Residuo;

@Service
public class ResiduoImpl {
	@Autowired
	private ResiduoDao dao;
	
	public boolean insert(Residuo residuo) {
		
		return dao.insert(residuo);
	}
}
