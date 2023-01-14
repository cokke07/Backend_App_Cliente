package cl.cokke.service;

import java.util.List;

import cl.cokke.models.Cliente;

public interface ClienteService {

	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public  Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
}
