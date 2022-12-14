package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Propietario;
import com.example.demo.repository.IPropietarioRepository;
@Service
public class PropietarioServiceImpl implements IPropietarioService {
	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	
	@Override
	public void registrarPropietario(Propietario p) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.insertar(p);
	}



}
