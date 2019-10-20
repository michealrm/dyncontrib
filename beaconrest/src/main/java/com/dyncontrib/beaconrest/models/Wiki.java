package com.dyncontrib.beaconrest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashMap;

@Entity
public class Wiki {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String domain;
    private String editEndpoint;
    private HashMap<String, String> params;

}
