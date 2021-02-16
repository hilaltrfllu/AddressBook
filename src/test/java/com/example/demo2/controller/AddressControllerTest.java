package com.example.demo2.controller;

import com.example.demo2.domain.Address;
import com.example.demo2.service.AddressService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.Mockito.when;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.assertEquals;

@WebMvcTest(AddressController.class)
class AddressControllerTest {

    @MockBean
    private AddressService addressService;

    private Address address;

    @Autowired
    private MockMvc mockMvc;

    /*@Test
    void viewIndexPage() throws Exception{
        RequestBuilder request = MockMvcRequestBuilders.get("/index");
        MvcResult result = mockMvc.perform(request).andReturn();
         assertEquals("Welcome\n" +
                         "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\n" +
                         "Click here to add data to city table"
                 ,result.getResponse().getContentAsString());
    }*/

   /* @Test
    void viewIndexPage() throws Exception{
        when(addressService.save()).thenReturn();

        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/new"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name(""))
                .andExpect(MockMvcResultMatchers.model().attributeExists(""))
                .andExpect(MockMvcResultMatchers.model().attribute("user",""));
    }*/

    /*@Test
    void add() throws Exception{
    }*/
}