package com.online.food.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class OrderDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;
	private LocalDateTime orderDate;

	@OneToOne(targetEntity=FoodCart.class)
	private FoodCart foodCart;
	private String orderStatus;

}
