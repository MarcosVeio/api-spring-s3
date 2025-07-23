package com.eventostec.api.service;

import com.eventostec.api.domain.address.Address;
import com.eventostec.api.domain.event.Event;
import com.eventostec.api.domain.event.EventRequestDTO;
import com.eventostec.api.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

@Service
public class AddressService {
    @Autowired
    private AddressRepository repository;


    public Address createAddress(EventRequestDTO data, Event event){

        Address newAddress = new Address();
        newAddress.setUf(data.state());
        newAddress.setCity(data.city());
        newAddress.setEvent(event);


        repository.save(newAddress);

        return newAddress;
    }

    public Optional<Address> findByEventId(UUID eventId){
        return this.repository.findByEventId(eventId);
    }
}
