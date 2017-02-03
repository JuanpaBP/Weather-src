package Interfaces;

import Domain.State;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Usuario on 03/02/2017.
 */
public interface StateRepository extends CrudRepository<State, Integer> {
    void delete(State deleted);

    List<State> findAll();

    State findOne(int id);
    //Optional<Country> findOne(int id);

    State save(State persisted);
}
