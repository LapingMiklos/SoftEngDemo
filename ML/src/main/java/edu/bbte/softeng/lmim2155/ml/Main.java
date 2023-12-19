package edu.bbte.softeng.lmim2155.ml;

import edu.bbte.softeng.lmim2155.ml.model.dto.in.BreadInDto;
import edu.bbte.softeng.lmim2155.ml.service.BreadService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class Main {
    private final BreadService breadService;

    @PostConstruct
    public void fill() {
        breadService.create(new BreadInDto("baget", 1f, 2f, 3L));
        breadService.create(new BreadInDto("kifli", 1f, 2f, 3L));
        breadService.create(new BreadInDto("boulle", 1f, 2f, 3L));
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
