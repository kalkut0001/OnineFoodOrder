package com.online.food.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	private String buildingName;
	private String streetNo;
	private String area;
	private String city;
	private String state;
	private String country;
	private String pincode;

	@JsonIgnore
	@OneToMany(targetEntity = Restaurant.class, cascade = CascadeType.ALL, mappedBy = "address")
	List<Restaurant> restaurantList = new ArrayList<>();
}
