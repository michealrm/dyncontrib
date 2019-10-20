package com.dyncontrib.beaconrest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String description;
    private String blockTemplate; // default is the html comment
    private String targetURL;
    // need a link to the generator
}
