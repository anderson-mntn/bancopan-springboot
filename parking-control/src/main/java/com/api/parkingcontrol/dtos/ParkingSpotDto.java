package com.api.parkingcontrol.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ParkingSpotDto {
    @NotBlank
    private String parkingSpotNumber;
    @NotBlank
    @Size(max = 7)
    private String carPlateLicense;
    @NotBlank
    private String carBrand;
    @NotBlank
    private String carModel;
    @NotBlank
    private String carColor;
    @NotBlank
    private String ownerName;
    @NotBlank
    private String apartment;
    @NotBlank
    private String apBlock;
}
