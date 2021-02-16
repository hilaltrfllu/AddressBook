package com.example.demo2.domain;

import com.example.demo2.repository.AddressRepository;
import com.example.demo2.service.AddressService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AddressTest {

    @Autowired
    private AddressRepository repo;

    @Test
    @Rollback(false)
    public void testCreateAddress(){
        Address address = new Address("Balikesir","Merkez", 10);
        Address savedAddress = repo.save(address);
        assertNotNull(savedAddress);
    }

    @Test
    public void testFindAddressByDistrict() throws Exception{
        Address address = new Address("Balikesir","Altieylül",10);
        repo.save(address);
        AddressService mock = mock(AddressService.class);
        when(mock.getCity(address)).thenReturn(String.valueOf(true));
        /*Optional<Address> checkDistrict = repo.findAddressByDistrict("Merkez");
        assertThat(checkDistrict, is(equalTo(address)));*/

       /* when(repo.findAddressByDistrict(district).isPresent() && repo.findAddressByDistrict(district).equals(address.getCity_name()))
                .thenReturn(true);*/
    }
}
