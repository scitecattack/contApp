package com.contApp.repository;

import com.contApp.model.Firm;
import org.springframework.data.repository.CrudRepository;

public interface FirmRepository extends CrudRepository<Firm, Integer> {
}
