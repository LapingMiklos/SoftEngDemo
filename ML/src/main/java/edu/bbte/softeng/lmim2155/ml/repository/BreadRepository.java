package edu.bbte.softeng.lmim2155.ml.repository;

import edu.bbte.softeng.lmim2155.ml.model.domain.Bread;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreadRepository extends JpaRepository<Bread, Long> {
}
