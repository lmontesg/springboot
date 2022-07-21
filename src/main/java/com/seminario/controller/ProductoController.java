package com.seminario.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.seminario.model.Producto;
import com.seminario.service.IProductoService;

@RestController
@RequestMapping
@CrossOrigin(origins="*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ProductoController {
	@Autowired
	private IProductoService iProductoService;
	
	
	@GetMapping("/productos")
	public ArrayList<Producto> getAllProductos(){
		return iProductoService.getAll();
	}
	@PostMapping("/producto")
	public void addProducto(@RequestBody Producto producto) {
		iProductoService.addProducto(producto);
	}
	

}
