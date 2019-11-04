package com.poo.controller;

import com.poo.dao.AlunoDAO;
import com.poo.model.Aluno;

public class AlunoController {
	
	public void create(Aluno aluno)
	{
		try {
			AlunoDAO dao = new AlunoDAO();
			dao.create(aluno);
			
		}
		finally {
			System.out.println("Fim inserção!");
		}
		
	}

}
