package com.DiegoCasemiroFS.events.domain.event;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "events")
public class Events {

    @Id
    @GeneratedValue/*(strategy = GenerationType.IDENTITY)*/
    private UUID id;
    private String title;
    private String imageUrl;
    private String eventUrl;
    private Boolean remote;
    private Date date;
}
