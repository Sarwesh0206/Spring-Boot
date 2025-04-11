package com.csc.paymentservice;


import java.util.List;

public class PaymentRequest {

    private Payment payment;
    private List<Long> courseIds;

    // Getters and setters

    public Payment getPayment() { return payment; }
    public void setPayment(Payment payment) { this.payment = payment; }

    public List<Long> getCourseIds() { return courseIds; }
    public void setCourseIds(List<Long> courseIds) { this.courseIds = courseIds; }
}
