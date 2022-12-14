package com.example.demo.repository;

import java.time.LocalDateTime;

import com.example.demo.modelo.Matricula;

public interface IMatriculaRepository {
	public void insertarMatricula(Matricula m);

	public Matricula buscar(LocalDateTime fechaMatricula);

	public void actualizar(Matricula m);

	public void eliminar(LocalDateTime fechaMatricula);
}
