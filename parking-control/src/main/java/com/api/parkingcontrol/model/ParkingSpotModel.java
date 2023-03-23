package com.api.parkingcontrol.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.*;

@Entity
@Table(name ="TB_PARKING_SPOT")
public class ParkingSpotModel implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 20)
    private String parkingSpotNumber;
    @Column(nullable = false, unique = true, length = 7)
    private String carPlateLicense;
    @Column(nullable = false, length = 70)
    private String carBrand;
    @Column(nullable = false, length = 70)
    private String carModel;
    @Column(nullable = false, length = 70)
    private String carColor;
    @Column(nullable = false)
    private LocalDateTime registrationDate;
    @Column(nullable = false, length = 130)
    private String ownerName;
    @Column(nullable = false, length = 10)
    private String apartment;
    @Column(nullable = false, length = 20)
    private String apBlock;

    
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }
    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }
    public String getCarPlateLicense() {
        return carPlateLicense;
    }
    public void setCarPlateLicense(String carPlateLicense) {
        this.carPlateLicense = carPlateLicense;
    }
    public String getCarBrand() {
        return carBrand;
    }
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
    public String getCarModel() {
        return carModel;
    }
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
    public String getCarColor() {
        return carColor;
    }
    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }
    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getApartment() {
        return apartment;
    }
    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
    public String getApBlock() {
        return apBlock;
    }
    public void setApBlock(String apBlock) {
        this.apBlock = apBlock;
    }
    
    
    
}
