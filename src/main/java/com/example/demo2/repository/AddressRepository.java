package com.example.demo2.repository;

import com.example.demo2.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address, String> {
    Optional<Address> findAddressByCity(String city);

    Optional<Address> findAddressByDistrict(String district);
   // Optional<Address> findMatch(String city_name, String district);

    //public Address findAddressByDistrict(String district);
}
