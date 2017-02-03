package Interfaces;


import Domain.State;
import Domain.Weather;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Usuario on 03/02/2017.
 */
public interface WeatherRepository extends CrudRepository<Weather, Integer> {
    void delete(Weather deleted);

    List<Weather> findAll();

    Weather findOne(int id);
    //Optional<Country> findOne(int id);

    Weather save(State persisted);
}
