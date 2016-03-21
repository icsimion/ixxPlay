package com.ixxus.service;

import com.ixxus.model.Personality;
import com.ixxus.repository.PersonalityRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by simion on 20/03/2016.
 */
public class PersonalityService {

    private final PersonalityRepository personalityRepository;

    @Autowired
    public PersonalityService(final PersonalityRepository personalityRepository) {
        this.personalityRepository= personalityRepository;
    }

    public Personality getPersonality(String answers) {
        return null;
    }
}
