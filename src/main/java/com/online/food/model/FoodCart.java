package com.online.food.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class FoodCart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cartId;

	@OneToOne(targetEntity = Customer.class, mappedBy = "cart")
	private Customer customer;

	@OneToMany(targetEntity = Item.class)
	private List<Item> itemList = new ArrayList<>();
	
	
}
