package tabling.domain;

import tabling.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="seats", path="seats")
public interface SeatRepository extends PagingAndSortingRepository<Seat, Long>{


}
