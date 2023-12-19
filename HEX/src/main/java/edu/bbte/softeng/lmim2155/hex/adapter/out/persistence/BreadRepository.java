package edu.bbte.softeng.lmim2155.hex.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreadRepository extends JpaRepository<BreadJpaEntity, Long> {
}
