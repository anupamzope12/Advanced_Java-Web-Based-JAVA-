package com.app.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass // mandatory anno to tell hibernate , following is common super class ,
				 // containing common fields , with no table associated with it !
public class BaseEntity {
	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto generation of ids : auto_increment
	private Long id;


	

}
