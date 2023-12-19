package edu.bbte.softeng.lmim2155.hex.application.port.out;

import edu.bbte.softeng.lmim2155.hex.application.domain.entity.Bread;
import java.util.Collection;
import java.util.Optional;

public interface FindBreadPort {
    Collection<Bread> findAll();

    Optional<Bread> findById(Long id);
}
