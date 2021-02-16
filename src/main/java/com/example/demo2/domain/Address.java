package com.example.demo2.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String city;
    private String district;
    private Integer plaka_no;

    public Address(){ }

    public Address(Integer id, String city, String district, Integer plaka_no){
        this.id = id;
        this.city = city;
        this.district = district;
        this.plaka_no = plaka_no;
    }
    public Address(String city, String district, Integer plaka_no){
        this.city = city;
        this.district = district;
        this.plaka_no = plaka_no;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getPlaka_no() {
        return plaka_no;
    }

    public void setPlaka_no(Integer plaka_no) { this.plaka_no = plaka_no; }
}
