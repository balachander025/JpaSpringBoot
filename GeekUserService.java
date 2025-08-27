package com.chander.jpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GeekUserService {
    @Autowired
    private GeekUserRepository geekUserRepository;
    public List<GeekUserRecord> getAllGeekUser() {
        List<GeekUserRecord> geekUserRecords = new ArrayList<>();
        geekUserRepository.findAll().forEach(geekUserRecords::add);
        return geekUserRecords;
    }
    public void addGeekUser(GeekUserRecord userRecord){
        geekUserRepository.save(userRecord);
    }

}
