package edu.bbte.softeng.lmim2155.ml.service.impl;

import edu.bbte.softeng.lmim2155.ml.mapper.BreadMapper;
import edu.bbte.softeng.lmim2155.ml.model.domain.Bread;
import edu.bbte.softeng.lmim2155.ml.model.dto.in.BreadInDto;
import edu.bbte.softeng.lmim2155.ml.model.dto.out.BreadOutDto;
import edu.bbte.softeng.lmim2155.ml.repository.BreadRepository;
import edu.bbte.softeng.lmim2155.ml.service.BreadService;
import java.util.Collection;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BreadServiceImpl implements BreadService {
    private final BreadRepository breadRepository;
    private final BreadMapper breadMapper;

    @Override
    public BreadOutDto create(BreadInDto breadInDto) {
        return breadMapper.toOutDto(
            breadRepository.save(breadMapper.toDomain(breadInDto))
        );
    }

    @Override
    public Collection<BreadOutDto> findAll() {
        return breadMapper.toOutDtoS(
            breadRepository.findAll()
        );
    }

    @Override
    public Optional<BreadOutDto> findById(Long id) {
        return breadRepository
            .findById(id)
            .map(breadMapper::toOutDto);
    }

    @Override
    public Optional<BreadOutDto> buyById(Long id) {
        Optional<Bread> bread = breadRepository.findById(id);
        bread.ifPresent(breadRepository::delete);
        return bread.map(breadMapper::toOutDto);
    }
}
