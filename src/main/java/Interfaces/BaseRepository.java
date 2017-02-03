package Interfaces;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;


/**
 * Created by Usuario on 03/02/2017.
 */
@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends Repository<T, ID>{

    void delete(T deleted);

    List<T> findAll();

    T findOne(int id);
    //Optional<C> findOne(ID id);

    T save(T persisted);

}
