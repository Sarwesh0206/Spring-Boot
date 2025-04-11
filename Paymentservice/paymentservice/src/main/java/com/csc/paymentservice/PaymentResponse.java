package com.csc.paymentservice;



import java.time.LocalDateTime;
import java.util.List;

public class PaymentResponse {
    private Long id;
    private String studentName;
    private Double amount;
    private String currency;
    private String paymentStatus;
    private LocalDateTime paymentDate;
    private List<Long> courseIds;

   
    public PaymentResponse(Long id, String studentName, Double amount, String currency, 
                           String paymentStatus, LocalDateTime paymentDate, List<Long> courseIds) {
        this.id = id;
        this.studentName = studentName;
        this.amount = amount;
        this.currency = currency;
        this.paymentStatus = paymentStatus;
        this.paymentDate = paymentDate;
        this.courseIds = courseIds;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public String getPaymentStatus() { return paymentStatus; }
    public void setPaymentStatus(String paymentStatus) { this.paymentStatus = paymentStatus; }

    public LocalDateTime getPaymentDate() { return paymentDate; }
    public void setPaymentDate(LocalDateTime paymentDate) { this.paymentDate = paymentDate; }

    public List<Long> getCourseIds() { return courseIds; }
    public void setCourseIds(List<Long> courseIds) { this.courseIds = courseIds; }
}
