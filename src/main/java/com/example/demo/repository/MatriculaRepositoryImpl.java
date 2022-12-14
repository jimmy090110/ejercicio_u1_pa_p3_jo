package com.example.demo.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{
	
	@Override
	public void insertarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base la matricula: " + m);
	}

	public Matricula buscar(LocalDateTime fechaMatricula) {
		Matricula mat = new Matricula();

		if( mat.getFechaMatricula() == fechaMatricula) {
			System.out.println("Se ha buscado en la base la matricula con fecha: " + fechaMatricula);	
			return  mat;
		}
		else 
			
			System.out.println("Fecha no encontrada");
		return null;
	
	}

	@Override
	public void actualizar(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado de la base la matricula: " + m);
	}

	@Override
	public void eliminar(LocalDateTime fechaMatricula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la matricula con fecha: " + fechaMatricula);
	}


}
