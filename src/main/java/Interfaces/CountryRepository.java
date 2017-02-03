package Interfaces;

import java.util.Optional;

import Domain.Country;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;
//import java.util.Optional;

/**
 * Created by Usuario on 03/02/2017.
 */
public interface CountryRepository extends BaseRepository<Country, Integer>{
    @Query("select T.name from Country T where T.ID = :id")
    String findTitleById(@Param("id") int id);
}