package tabling.domain;

import tabling.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="recepts", path="recepts")
public interface ReceptRepository extends PagingAndSortingRepository<Recept, Long>{


}
