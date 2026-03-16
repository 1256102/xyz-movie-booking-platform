package com.xyz.moviebooking.repository;

import com.xyz.moviebooking.entity.ShowSeatInventory;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatInventoryRepository
extends JpaRepository<ShowSeatInventory,Long>{

    @Modifying
    @Query("""
        UPDATE ShowSeatInventory s
        SET s.status='LOCKED',
        s.lockedBy=:userId,
        s.lockTime=CURRENT_TIMESTAMP
        WHERE s.showId=:showId
        AND s.seatNumber IN :seats
        AND s.status='AVAILABLE'
    """)
    int lockSeats(Long showId, List<String> seats, Long userId);
}