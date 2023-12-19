package edu.bbte.softeng.lmim2155.hex.adapter.out.persistence;

import edu.bbte.softeng.lmim2155.hex.application.domain.entity.Bread;
import edu.bbte.softeng.lmim2155.hex.application.port.out.BuyBreadPort;
import edu.bbte.softeng.lmim2155.hex.application.port.out.CreateBreadPort;
import edu.bbte.softeng.lmim2155.hex.application.port.out.FindBreadPort;
import java.util.Collection;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BreadPersistenceAdapter implements CreateBreadPort, FindBreadPort, BuyBreadPort {
    private final BreadRepository breadRepository;
    private final BreadJpaMapper breadJpaMapper;

    @Override
    public Optional<Bread> buyById(Long id) {
        Optional<BreadJpaEntity> bread = breadRepository.findById(id);
        bread.ifPresent(breadRepository::delete);
        return bread.map(breadJpaMapper::toDomain);
    }

    @Override
    public Bread create(Bread bread) {
        return breadJpaMapper.toDomain(
            breadRepository.save(breadJpaMapper.toJpaEntity(bread))
        );
    }

    @Override
    public Collection<Bread> findAll() {
        return breadJpaMapper.toDomain(
            breadRepository.findAll()
        );
    }

    @Override
    public Optional<Bread> findById(Long id) {
        return breadRepository
            .findById(id)
            .map(breadJpaMapper::toDomain);
    }
}
