package edu.bbte.softeng.lmim2155.hex;

import edu.bbte.softeng.lmim2155.hex.application.domain.entity.Bread;
import edu.bbte.softeng.lmim2155.hex.application.port.in.CreateBreadUseCase;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class Main {
    private final CreateBreadUseCase createBreadUseCase;

    @PostConstruct
    public void fill() {
        createBreadUseCase.create(new Bread("baget", 1f, 2f, 3L));
        createBreadUseCase.create(new Bread("kifli", 1f, 2f, 3L));
        createBreadUseCase.create(new Bread("boulle", 1f, 2f, 3L));
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
