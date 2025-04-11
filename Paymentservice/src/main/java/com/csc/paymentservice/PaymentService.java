package com.csc.paymentservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private EmailService emailService;

    public PaymentResponse createPayment(Payment payment, List<Long> courseIds) {
        Set<Course> courses = new HashSet<>(courseRepository.findAllById(courseIds));
        payment.setCourses(courses);
        payment.setPaymentStatus("SUCCESSFUL");  // Set status to "SUCCESSFUL"
        payment.setPaymentDate(java.time.LocalDateTime.now());

        // Save payment with the linked courses
        Payment savedPayment = paymentRepository.save(payment);

        // Send payment success email
        emailService.sendPaymentSuccessEmail(payment.getEmail(), payment.getStudentName(), payment.getAmount());

        // Extract course IDs for the response
        List<Long> savedCourseIds = savedPayment.getCourses()
                                                .stream()
                                                .map(Course::getId)
                                                .collect(Collectors.toList());

        return new PaymentResponse(
                savedPayment.getId(),
                savedPayment.getStudentName(),
                savedPayment.getAmount(),
                savedPayment.getCurrency(),
                savedPayment.getPaymentStatus(),
                savedPayment.getPaymentDate(),
                savedCourseIds
        );
    }
}
