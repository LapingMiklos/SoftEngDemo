package edu.bbte.softeng.lmim2155.ml.service;

import edu.bbte.softeng.lmim2155.ml.model.dto.in.BreadInDto;
import edu.bbte.softeng.lmim2155.ml.model.dto.out.BreadOutDto;
import java.util.Collection;
import java.util.Optional;

public interface BreadService {
    BreadOutDto create(BreadInDto breadInDto);

    Collection<BreadOutDto> findAll();

    Optional<BreadOutDto> findById(Long id);

    Optional<BreadOutDto> buyById(Long id);
}
