package edu.bbte.softeng.lmim2155.ml.controller;

import edu.bbte.softeng.lmim2155.ml.model.dto.in.BreadInDto;
import edu.bbte.softeng.lmim2155.ml.model.dto.out.BreadOutDto;
import edu.bbte.softeng.lmim2155.ml.service.BreadService;
import jakarta.annotation.PostConstruct;
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
    private final BreadService breadService;

    @PostMapping
    public BreadOutDto create(
        @RequestBody @Valid BreadInDto breadInDto
    ) {
        return breadService.create(breadInDto);
    }

    @GetMapping
    public Collection<BreadOutDto> findAll() {
        return breadService.findAll();
    }

    @GetMapping("/{id}")
    public BreadOutDto findById(
        @PathVariable Long id
    ) {
        return breadService
            .findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}/buy")
    public BreadOutDto buyById(
        @PathVariable Long id
    ) {
        return breadService
            .buyById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostConstruct
    public void fill() {
        breadService.create(new BreadInDto("baget", 1f, 2f, 3L));
        breadService.create(new BreadInDto("kifli", 1f, 2f, 3L));
        breadService.create(new BreadInDto("boulle", 1f, 2f, 3L));
    }
}
