package com.api.parkingcontrol.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.parkingcontrol.model.ParkingSpotModel;

@Repository // declarei apenas pela questão de melhorar entedimento
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
    
}
