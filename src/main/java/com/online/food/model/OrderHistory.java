package com.online.food.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderHistoryId;

	@NotNull(message = "Customer id required")
	private Integer customerId;

	@OneToOne(targetEntity = Bill.class)
	private Bill bill;

}
