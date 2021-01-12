package com.apiceno.Residuos.dao;

import java.util.List;

import com.apiceno.Residuos.entity.Residuo;

public interface ResiduoDao {
	public boolean insert(Residuo residuo);
	public boolean delete(Residuo residuo);
	public boolean update(Residuo residuo);
	
	public List<Residuo> read();
}
