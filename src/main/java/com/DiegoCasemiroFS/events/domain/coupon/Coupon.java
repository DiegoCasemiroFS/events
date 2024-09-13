package com.DiegoCasemiroFS.events.domain.coupon;

import com.DiegoCasemiroFS.events.domain.event.Events;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "coupon")
public class Coupon {

    @Id
    @GeneratedValue
    private UUID id;
    private Integer discount;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Events events;
}
