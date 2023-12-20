package com.lozanobautista.examenParcial.entity;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "denuncias")
@EntityListeners(AuditingEntityListener.class)
public class Denuncia {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name= "dni", nullable = false, length = 8 , unique = false)
	private String dni;
	@Column(name= "fecha", nullable = false, length = 50 , unique = false)
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date fecha;
	@Column(name= "titulo", nullable = false, length = 30 , unique = false)
	private String titulo;
	@Column(name= "direccion", nullable = false, length = 200 , unique = false)
	private String direccion;
	@Column(name= "descripcion", nullable = false, length = 250 , unique = false)
	private String descripcion;
	@Column(name = "created_at", nullable= false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdAt;
	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updatedAt;
}
