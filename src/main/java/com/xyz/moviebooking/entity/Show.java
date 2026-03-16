package com.xyz.moviebooking.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long showId;

    private Long movieId;
    private Long theatreId;
    private LocalDateTime showTime;
}