package com.seminario.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.seminario.model.Producto;
@Repository
public interface IProductoRepository extends CrudRepository<Producto, Long>{

}
