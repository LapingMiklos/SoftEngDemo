package edu.bbte.softeng.lmim2155.hex.application.port.out;

import edu.bbte.softeng.lmim2155.hex.application.domain.entity.Bread;

public interface CreateBreadPort {
    Bread create(Bread bread);
}
