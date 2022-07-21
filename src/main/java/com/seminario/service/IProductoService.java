package com.seminario.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.seminario.model.Producto;

public interface IProductoService {
	ArrayList<Producto> getAll();
	void addProducto(Producto producto);

}
