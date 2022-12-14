package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Propietario;

@Repository
public class PropietorioRepositoryImpl implements IPropietarioRepository{
	

	@Override
	public Propietario consultar(String cedula) {
		// TODO Auto-generated method stub
		Propietario propi = new Propietario();
		propi.setNombre("Jimmy");
		propi.setApellido("Ortega");
		propi.setCedula("31241241");
		return propi;
	}

	@Override
	public void insertar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base el propietario: " + p);
	}
	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el propietario con cedula: " + cedula);
	}
	

}
