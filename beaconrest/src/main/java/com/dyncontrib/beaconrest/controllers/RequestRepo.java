package com.dyncontrib.beaconrest.controllers;

import com.dyncontrib.beaconrest.models.Request;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RequestRepo extends PagingAndSortingRepository<Request, Long> {

}
