package com.online.food.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer billId;
	
	@NotNull(message = "Date time required")
	private LocalDateTime billDate;
	
	@NotNull(message = "Total cost required")
	private Double totalCost;
	
	@NotNull(message = "Total item required")
	private Integer totalItem;
	
	@OneToOne
	private OrderDetails order;

}