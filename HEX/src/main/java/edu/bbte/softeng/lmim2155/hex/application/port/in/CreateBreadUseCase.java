package edu.bbte.softeng.lmim2155.hex.application.port.in;

import edu.bbte.softeng.lmim2155.hex.application.domain.entity.Bread;

public interface CreateBreadUseCase {
    Bread create(Bread bread);
}
