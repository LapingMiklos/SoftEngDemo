package edu.bbte.softeng.lmim2155.hex.adapter.in.web;

import edu.bbte.softeng.lmim2155.hex.adapter.in.web.dto.BreadInDto;
import edu.bbte.softeng.lmim2155.hex.adapter.in.web.dto.BreadOutDto;
import edu.bbte.softeng.lmim2155.hex.application.port.in.BuyBreadUseCase;
import edu.bbte.softeng.lmim2155.hex.application.port.in.CreateBreadUseCase;
import edu.bbte.softeng.lmim2155.hex.application.port.in.FindBreadUseCase;
import jakarta.validation.Valid;
import java.util.Collection;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
@RestController
@RequestMapping("/breads")
@RequiredArgsConstructor
public class BreadController {
    private final CreateBreadUseCase createBreadUseCase;
    private final FindBreadUseCase findBreadUseCase;
    private final BuyBreadUseCase buyBreadUseCase;
    private final BreadDtoMapper breadDtoMapper;

    @PostMapping
    public BreadOutDto create(
        @RequestBody @Valid BreadInDto breadInDto
    ) {
        return breadDtoMapper.toOutDto(
            createBreadUseCase.create(
                breadDtoMapper.toDomain(breadInDto)
            )
        );
    }

    @GetMapping
    public Collection<BreadOutDto> findAll() {
        return breadDtoMapper.toOutDtoS(findBreadUseCase.findAll());
    }

    @GetMapping("/{id}")
    public BreadOutDto findById(
        @PathVariable Long id
    ) {
        return findBreadUseCase
            .findById(id)
            .map(breadDtoMapper::toOutDto)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}/buy")
    public BreadOutDto buyById(
        @PathVariable Long id
    ) {
        return buyBreadUseCase
            .buyById(id)
            .map(breadDtoMapper::toOutDto)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
