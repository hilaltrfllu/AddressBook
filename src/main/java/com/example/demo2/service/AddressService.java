package com.example.demo2.service;

import com.example.demo2.domain.Address;
import com.example.demo2.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service //provides functionalities
public class AddressService {

    private final AddressRepository repo;

    @Autowired // enables to inject the object dependency implicitly
    public AddressService(AddressRepository repo) {
        this.repo = repo;
    }

    public List<Address> listAll(){ //get
        return repo.findAll();
    }

    public String getCity(Address address){
        Optional<Address> districtOptional = repo.findAddressByDistrict(address.getDistrict());
        if(!districtOptional.isPresent())
            throw new IllegalStateException("Address does not exist.");
        return address.getCity();
    }

    @Transactional
    public void save(Address address){
       Optional<Address> cityOptional = repo.findAddressByCity(address.getCity());
        Optional<Address> districtOptional = repo.findAddressByDistrict(address.getDistrict());
        //Optional<Address> matchOptional = repo.findMatch(address.getCity(),address.getDistrict());

        if(cityOptional.isPresent() && districtOptional.isPresent())
            throw new IllegalStateException("Match exists");

        if(districtOptional.isPresent())
            throw new IllegalStateException("Address already exists.");
        /*if(matchOptional.isPresent())
            throw new IllegalStateException("Match exists");*/
        repo.save(address);
    }

}
