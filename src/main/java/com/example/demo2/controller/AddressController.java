package com.example.demo2.controller;

import com.example.demo2.domain.Address;
import com.example.demo2.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AddressController {

    @Autowired
    private AddressService service;

    @GetMapping("/")
    public String viewIndexPage(/*Model model*/){
       /* List<Address> listAddress = service.listAll();
        model.addAttribute("listAddress", listAddress);
        */System.out.println("Get / ");
        return "index";
    }

    @GetMapping("/new")
    public String add(Model model){
        model.addAttribute("address", new Address());
        return "new";
    }

    @GetMapping("/table")
    public String viewTable(Model model){
        List<Address> listAddress = service.listAll();
        model.addAttribute("listAddress", listAddress);
        System.out.print("Get / ");
        return "table";
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String saveAddress(@ModelAttribute("address") Address addr){
        service.save(addr);
        return "redirect:/table";
    }



  /*  @GetMapping("/table")
    public String viewTable(Model model){
        List<Address> listAddress = service.listAll();
        model.addAttribute("listAddress", listAddress);
        return "table";
    }*/
}
