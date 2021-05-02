package hazel.tyrfing.spring.repos;

import hazel.tyrfing.models.utility.Area;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaRepository extends CrudRepository<Area, Long> {
}
