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
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer categoryId;
	
	@NotNull(message = "Name is mandatory")
	private String categoryName;

	@JsonIgnore
	@OneToMany(targetEntity = Item.class, cascade = CascadeType.ALL, mappedBy = "category")
	List<Item> itemList = new ArrayList<>();
}
