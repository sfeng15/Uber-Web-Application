package com.ross.spring.uber.service.impl;

import com.ross.spring.uber.domain.Location;
import com.ross.spring.uber.domain.LocationRepository;
import com.ross.spring.uber.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService{

    private LocationRepository locationRepository;

    @Autowired
    public LocationServiceImpl(LocationRepository locationRepository){
        this.locationRepository=locationRepository;
    }

    @Override
    public List<Location> saveCarLocations(List<Location> carLocations) {
        return locationRepository.save(carLocations);
    }

    @Override
    public void deleteAll() {
        locationRepository.deleteAll();
    }

    @Override
    public Page<Location> findByVehicleMovementType(String movementType, Pageable pageable) {
        return locationRepository.findByVehicleMovementType(Location.VehicleMovementType.valueOf(movementType),pageable);
    }

    @Override
    public Page<Location> findByVin(String vin, Pageable pageable) {
        return locationRepository.findByUnitInfoUnitVin(vin,pageable);
    }
}
