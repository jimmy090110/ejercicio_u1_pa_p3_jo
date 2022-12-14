package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IMatriculaRepository;
import com.example.demo.repository.IPropietarioRepository;
import com.example.demo.repository.IVehiculoRepository;
@Service
public class MatriculaGestorServiceImpl implements IMatriculaGestorService {
	@Autowired
	private IPropietarioRepository iPropietarioRepository;

	@Autowired
	private IVehiculoRepository iVehiculoRepository;

	@Autowired
	private IMatriculaService matriculaServicePesado;

	@Autowired
	private IMatriculaService matriculaServiceLiviano;
	
	@Autowired
	private IMatriculaRepository iMatriculaRepository;

	@Autowired
	private Propietario propietario;

	@Autowired
	private Vehiculo vehiculo;

	@Autowired
	private Matricula matricula;
	
	}


