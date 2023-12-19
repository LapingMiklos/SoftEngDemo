package edu.bbte.softeng.lmim2155.hex.application.domain.service;

import edu.bbte.softeng.lmim2155.hex.application.domain.entity.Bread;
import edu.bbte.softeng.lmim2155.hex.application.port.in.BuyBreadUseCase;
import edu.bbte.softeng.lmim2155.hex.application.port.in.CreateBreadUseCase;
import edu.bbte.softeng.lmim2155.hex.application.port.in.FindBreadUseCase;
import edu.bbte.softeng.lmim2155.hex.application.port.out.BuyBreadPort;
import edu.bbte.softeng.lmim2155.hex.application.port.out.CreateBreadPort;
import edu.bbte.softeng.lmim2155.hex.application.port.out.FindBreadPort;
import java.util.Collection;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BreadService implements CreateBreadUseCase, FindBreadUseCase, BuyBreadUseCase {
    private final BuyBreadPort buyBreadPort;
    private final CreateBreadPort createBreadPort;
    private final FindBreadPort findBreadPort;

    @Override
    public Optional<Bread> buyById(Long id) {
        return buyBreadPort.buyById(id);
    }

    @Override
    public Bread create(Bread bread) {
        return createBreadPort.create(bread);
    }

    @Override
    public Collection<Bread> findAll() {
        return findBreadPort.findAll();
    }

    @Override
    public Optional<Bread> findById(Long id) {
        return findBreadPort.findById(id);
    }
}
