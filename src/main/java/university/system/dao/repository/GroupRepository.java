package university.system.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import university.system.model.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
