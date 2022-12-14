package com.example.demo.repository;

import com.example.demo.modelo.Propietario;

public interface IPropietarioRepository {
	
	public Propietario consultar(String cedula);
	public void insertar(Propietario p);
	public void eliminar(String cedula);
	
}
