package com.lozanobautista.examenParcial.validator;

import java.text.SimpleDateFormat;

import com.lozanobautista.examenParcial.entity.Denuncia;
import com.lozanobautista.examenParcial.exceptions.ValidateServiceException;

public class DenunciaValidator {
	public static void save(Denuncia denuncia) {
		if (denuncia.getDni()==null || denuncia.getDni().isEmpty()) {
			throw new ValidateServiceException("El Dni es Requerido");
		}
		if (denuncia.getDni().length()>8) {
			throw new ValidateServiceException("El Dni es muy largo");
		}
		if (denuncia.getFecha() == null) {
            throw new ValidateServiceException("La fecha es requerida");
        }
        // Validar formato de fecha
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dateFormat.format(denuncia.getFecha());
        } catch (Exception e) {
            throw new ValidateServiceException("Formato de fecha inválido");
        }
		if (denuncia.getTitulo()==null|| denuncia.getTitulo().isEmpty()) {
			throw new ValidateServiceException("El ruc es muy corto");
		}
		if (denuncia.getTitulo().length()>30){
			throw new ValidateServiceException("El ruc es Requerido");
		}
		if (denuncia.getDireccion()==null || denuncia.getDireccion().isEmpty()) {
			throw new ValidateServiceException("La Direccion es Requerido");
		}
		if (denuncia.getDireccion().length()>200) {
			throw new ValidateServiceException("La Direccion es muy largo");
		}
		if (denuncia.getDescripcion()==null || denuncia.getDireccion().isEmpty()) {
			throw new ValidateServiceException("La Direccion es Requerido");
		}
		if (denuncia.getDescripcion().length()>250) {
			throw new ValidateServiceException("La Direccion es muy largo");
		}
	}
}
