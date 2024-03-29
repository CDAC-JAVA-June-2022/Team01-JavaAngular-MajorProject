package com.cybage.food.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "restaurant")
public class Restaurant {
	@Id
	@GeneratedValue
	private int restaurantId;
	private String restaurantName;
	private String restaurantUserName;
	private String restaurantPassword;
	private String restaurantEmail;
	private String thumbnail;
	private int attemptCount;
	private String distance;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	@JsonManagedReference
	private Address address;

	@OneToMany(mappedBy = "restaurant" , fetch = FetchType.LAZY , cascade = CascadeType.REMOVE)
	@JsonIgnore
	private List<FoodItem> foodItems;
	@JsonIgnore
	@OneToMany(mappedBy = "restaurant", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	private List<UserOrder> userOrder;

	public Restaurant() {
		super();
	}

	public Restaurant(int restaurantId, String restaurantName, String restaurantUserName, String restaurantPassword,
			String restaurantEmail, String thumbnail, int attemptCount, String distance, Address address,
			List<FoodItem> foodItems, List<UserOrder> userOrder) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.restaurantUserName = restaurantUserName;
		this.restaurantPassword = restaurantPassword;
		this.restaurantEmail = restaurantEmail;
		this.thumbnail = thumbnail;
		this.attemptCount = attemptCount;
		this.distance = distance;
		this.address = address;
		this.foodItems = foodItems;
		this.userOrder = userOrder;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getRestaurantUserName() {
		return restaurantUserName;
	}

	public void setRestaurantUserName(String restaurantUserName) {
		this.restaurantUserName = restaurantUserName;
	}

	public String getRestaurantPassword() {
		return restaurantPassword;
	}

	public void setRestaurantPassword(String restaurantPassword) {
		this.restaurantPassword = restaurantPassword;
	}

	public String getRestaurantEmail() {
		return restaurantEmail;
	}

	public void setRestaurantEmail(String restaurantEmail) {
		this.restaurantEmail = restaurantEmail;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public int getAttemptCount() {
		return attemptCount;
	}

	public void setAttemptCount(int attemptCount) {
		this.attemptCount = attemptCount;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<FoodItem> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(List<FoodItem> foodItems) {
		this.foodItems = foodItems;
	}

	public List<UserOrder> getUserOrder() {
		return userOrder;
	}

	public void setUserOrder(List<UserOrder> userOrder) {
		this.userOrder = userOrder;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName
				+ ", restaurantUserName=" + restaurantUserName + ", restaurantPassword=" + restaurantPassword
				+ ", restaurantEmail=" + restaurantEmail + ", thumbnail=" + thumbnail + ", attemptCount=" + attemptCount
				+ ", distance=" + distance + ", address=" + address + ", foodItems=" + foodItems + ", userOrder="
				+ userOrder + "]";
	}

}
