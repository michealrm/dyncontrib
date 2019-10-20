package com.dyncontrib.beaconrest;

import com.dyncontrib.beaconrest.util.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class BeaconRESTApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeaconRESTApplication.class, args);
	}

}
