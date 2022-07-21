package com.seminario.serviceImplent;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seminario.model.Producto;
import com.seminario.repository.IProductoRepository;
import com.seminario.service.IProductoService;
@Service
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	private IProductoRepository iProductoRepository;

	@Override
	public ArrayList<Producto> getAll() {
		return (ArrayList<Producto>) iProductoRepository.findAll();
	}

	@Override
	public void addProducto(Producto producto) {
	iProductoRepository.save(producto);
		
	}
	

	

}
