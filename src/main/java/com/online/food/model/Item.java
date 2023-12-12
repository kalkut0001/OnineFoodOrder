package com.online.food.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer itemId;
	
	@NotNull(message = "Name is require")
	private String itemName;
	
	@NotNull(message = "Category is require")
	@ManyToOne
	private Category category;

	private Integer quantity;
	private Double cost;

	@JsonIgnore
	@ManyToMany(targetEntity = Restaurant.class)
	private List<Restaurant> restaurants = new ArrayList<>();

}
