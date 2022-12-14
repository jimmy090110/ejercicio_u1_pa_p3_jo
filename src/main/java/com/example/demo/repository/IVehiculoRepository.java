package com.example.demo.repository;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoRepository {
	public Vehiculo buscar(String placa);
	
	public void insertar(Vehiculo v);


	public void actualizar(Vehiculo v);

	public void eliminar(String placa);
}
