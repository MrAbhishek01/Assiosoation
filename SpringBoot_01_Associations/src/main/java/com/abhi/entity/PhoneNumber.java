package com.abhi.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
public class PhoneNumber implements Serializable{
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "REG_NO_SEQ", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer regNo;
	@NonNull
	private Long phoneNo;
	@NonNull
	@Column(length = 20)
	private String serviceProvider;
	@NonNull
	@Column(length = 20)
	private String numberType;
	@ManyToOne(targetEntity = Person.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "Person_Id", referencedColumnName = "pid")

	private Person personinfo;
}
