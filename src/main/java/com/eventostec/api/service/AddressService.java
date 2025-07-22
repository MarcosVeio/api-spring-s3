package com.eventostec.api.service;

import com.eventostec.api.domain.address.Address;
import com.eventostec.api.domain.address.AddressRequestDTO;
import com.eventostec.api.domain.event.Event;
import com.eventostec.api.domain.event.EventRequestDTO;
import com.eventostec.api.repositories.AddressRepository;
import com.eventostec.api.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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
}
