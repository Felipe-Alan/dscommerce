package com.alandev.dscommerceproject.dto;

import com.alandev.dscommerceproject.entities.Payment;
import jakarta.persistence.Column;

import java.time.Instant;

public class PaymentDTO {

    private Long id;

    private Instant moment;

    public PaymentDTO(Long id, Instant moment) {
        this.id = id;
        this.moment = moment;
    }

    public PaymentDTO(Payment entity) {
        id = entity.getId();
        moment = entity.getMoment();
    }

    public Long getId() {
        return id;
    }

    public Instant getMoment() {
        return moment;
    }
}
