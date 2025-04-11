package com.csc.exchangeservice1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Exchange {

	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="eid")
	    private int eid;

	    private String customerName;
	    private String email;
	    private String phone;
	    private String address;
	    private String productName;
	    private String reason;
	    private int productId;

	    // Getters and Setters
	    public int getEid() {
	        return eid;
	    }

	    public void setEid(int eid) {
	        this.eid = eid;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public void setCustomerName(String customerName) {
	        this.customerName = customerName;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public String getProductName() {
	        return productName;
	    }
	    
	    public int getProductId() {
	        return productId;
	    }

	    public void setProductId(int productId) {
	        this.productId = productId;
	    }


	    public void setProductName(String productName) {
	        this.productName = productName;
	    }

	    public String getReason() {
	        return reason;
	    }

	    public void setReason(String reason) {
	        this.reason = reason;
	    }

	    @Override
	    public String toString() {
	        return "Exchange [eid=" + eid + ", customerName=" + customerName + ", email=" + email + ", phone=" + phone + ", address=" + address + ", productId=" + productId +", productName=" + productName + ", reason=" + reason + "]";
	    }
}
