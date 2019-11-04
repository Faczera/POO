package com.poo.view;

import java.util.Scanner;

import com.poo.controller.AlunoController;
import com.poo.model.Aluno;

public class AlunoView {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		AlunoController controller = new AlunoController();
		
		System.out.println("Entre com a matricula:");
		aluno.setMatricula(sc.nextLine());
		
		System.out.println("Entre com o nome:");
		aluno.setNome(sc.nextLine());
		
		controller.create(aluno);
	}
	
	

}
