package edu.bbte.softeng.lmim2155.hex.application.port.in;

import edu.bbte.softeng.lmim2155.hex.application.domain.entity.Bread;
import java.util.Optional;

public interface BuyBreadUseCase {
    Optional<Bread> buyById(Long id);
}
