package mon.group.mvcprojet.repository;

import mon.group.mvcprojet.model.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<Operation,Long> {
}
