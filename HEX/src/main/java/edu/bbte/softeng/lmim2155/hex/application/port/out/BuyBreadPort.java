package edu.bbte.softeng.lmim2155.hex.application.port.out;

import edu.bbte.softeng.lmim2155.hex.application.domain.entity.Bread;
import java.util.Optional;

public interface BuyBreadPort {
    Optional<Bread> buyById(Long id);
}
