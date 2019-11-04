package com.poo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.poo.jdbc.ConnectionFactory;
import com.poo.model.Aluno;

public class AlunoDAO {
	
	public void create(Aluno aluno)
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "insert into aluno values (?,?)";
		
		try{
			
			stmt = con.prepareStatement(sql);
			stmt.setString(1, aluno.getMatricula());
			stmt.setString(2, aluno.getNome());
			
			stmt.executeUpdate();
			System.out.println("");
			
		}
		
	catch(SQLException e)
		{
		e.printStackTrace();
		System.out.println("Erro ao tentar incluir aluno");
		
				}
		
		finally{
			ConnectionFactory.closeConnection(con,stmt);
		}
	}

}
