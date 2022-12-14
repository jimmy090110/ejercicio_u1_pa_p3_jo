package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.service.IMatriculaGestorService;
import com.example.demo.service.IPropietarioService;
import com.example.demo.service.IVehiculoService;


@SpringBootApplication
public class EjercicioU1PaP3JoApplication implements CommandLineRunner  {
	
	@Autowired
	private Propietario propietario;

	@Autowired
	private Vehiculo vehiculo;

	@Autowired
	private IMatriculaGestorService iMatriculaGestorService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IVehiculoService iVehiculoService;

	

	public static void main(String[] args) {
		SpringApplication.run(EjercicioU1PaP3JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}


}
