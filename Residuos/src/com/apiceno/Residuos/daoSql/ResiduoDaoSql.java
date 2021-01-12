package com.apiceno.Residuos.daoSql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.apiceno.Residuos.dao.ResiduoDao;
import com.apiceno.Residuos.entity.Residuo;

@Component("ResiduoDaoSql")
public class ResiduoDaoSql implements ResiduoDao{
	
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Autowired
	private void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public boolean insert(Residuo residuo) {
		MapSqlParameterSource map = new MapSqlParameterSource();
		map.addValue("nombre", residuo.getNombre());
		map.addValue("quimico", residuo.getQuimico());
		map.addValue("degradacion", residuo.getDegradacionAnyo());
		return jdbcTemplate.update("INSERT INTO residuo (nombre, quimico, degradacion) VALUES (:nombre, :quimico, :degradacion)", map) == 1;
		
	}

	@Override
	public boolean delete(Residuo residuo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Residuo residuo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Residuo> read() {
		return jdbcTemplate.query("SELECT * FROM residuo", new RowMapper<Residuo>() {

			@Override
			public Residuo mapRow(ResultSet rs, int rowNum) throws SQLException {
				Residuo residuo = new Residuo();
				
				
				residuo.setNombre(rs.getString("nombre"));
				residuo.setQuimico(rs.getString("quimico"));
				residuo.setDegradacionAnyo(rs.getInt("degradacion"));
				
				return residuo;
			}
			
		});
	}

}
