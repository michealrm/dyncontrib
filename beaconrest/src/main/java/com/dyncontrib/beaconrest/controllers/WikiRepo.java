package com.dyncontrib.beaconrest.controllers;

import com.dyncontrib.beaconrest.models.Wiki;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface WikiRepo extends PagingAndSortingRepository<Wiki, Long> {

}
