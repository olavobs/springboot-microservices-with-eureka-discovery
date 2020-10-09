package com.pluralsight.springdataoverview;

import com.pluralsight.springdataoverview.entity.Flight;
import com.pluralsight.springdataoverview.repository.FlightRepository;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
class CrudTests {

    @Autowired
    private FlightRepository flightRepository;

    Flight flight;

    @Before
    public void setUp() {
        flight = new Flight();

        flight.setDestination("New York");
        flight.setOrigin("Amsterdam");
        flight.setScheduledAt(LocalDateTime.parse("2011-12-13T12:12:00"));
    }

    @Test
    public void verifyFlightsCanBeSaved() {
        flightRepository.save(flight);

        Assertions.assertThat(flightRepository.findAll())
                .hasSize(1)
                .first()
                .isEqualToComparingFieldByField(flight);
    }

    @Test
    public void verifyFlightsCanBeDeleted(){
        flightRepository.save(flight);

        flightRepository.delete(flight);

        Assertions.assertThat(flightRepository.findAll())
                .hasSize(0);
    }

}
