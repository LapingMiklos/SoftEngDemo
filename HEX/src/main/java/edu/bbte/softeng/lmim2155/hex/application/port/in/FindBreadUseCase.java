package edu.bbte.softeng.lmim2155.hex.application.port.in;

import edu.bbte.softeng.lmim2155.hex.application.domain.entity.Bread;
import java.util.Collection;
import java.util.Optional;

public interface FindBreadUseCase {
    Collection<Bread> findAll();

    Optional<Bread> findById(Long id);
}
