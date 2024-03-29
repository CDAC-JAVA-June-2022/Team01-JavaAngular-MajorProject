package com.cybage.food.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "complaint")
public class Complaint {
	@Id
	@GeneratedValue
	private int complaintId;
	@OneToOne
	@JoinColumn(name = "order_id")
	private UserOrder userOrder;
	private String complaintStatus;
	private String complaintMessage;
	private LocalDateTime complaintDate;

	public Complaint() {
		super();
	}

	public Complaint(int complaintId, UserOrder userOrder, String complaintStatus, String complaintMessage,
			LocalDateTime complaintDate) {
		super();
		this.complaintId = complaintId;
		this.userOrder = userOrder;
		this.complaintStatus = complaintStatus;
		this.complaintMessage = complaintMessage;
		this.complaintDate = complaintDate;
	}

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public UserOrder getUserOrder() {
		return userOrder;
	}

	public void setUserOrder(UserOrder userOrder) {
		this.userOrder = userOrder;
	}

	public String getComplaintStatus() {
		return complaintStatus;
	}

	public void setComplaintStatus(String complaintStatus) {
		this.complaintStatus = complaintStatus;
	}

	public String getComplaintMessage() {
		return complaintMessage;
	}

	public void setComplaintMessage(String complaintMessage) {
		this.complaintMessage = complaintMessage;
	}

	public LocalDateTime getComplaintDate() {
		return complaintDate;
	}

	public void setComplaintDate(LocalDateTime complaintDate) {
		this.complaintDate = complaintDate;
	}

	@Override
	public String toString() {
		return "Complaint [complaintId=" + complaintId + ", userOrder=" + userOrder + ", complaintStatus="
				+ complaintStatus + ", complaintMessage=" + complaintMessage + ", complaintDate=" + complaintDate + "]";
	}

}
