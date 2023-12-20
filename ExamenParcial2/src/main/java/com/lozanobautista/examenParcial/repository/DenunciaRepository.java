package com.lozanobautista.examenParcial.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.lozanobautista.examenParcial.entity.Denuncia;

public interface DenunciaRepository extends JpaRepository<Denuncia,Integer>{
	List<Denuncia> findByDniContaining(String dni,Pageable page);
	Denuncia findByDni(String dni);
}
