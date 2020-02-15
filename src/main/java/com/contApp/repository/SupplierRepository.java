package com.contApp.repository;

import com.contApp.model.Supplier;
import org.springframework.data.repository.CrudRepository;

public interface SupplierRepository extends CrudRepository<Supplier, Integer> {
}
