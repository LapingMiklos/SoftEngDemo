package edu.bbte.softeng.lmim2155.ml.mapper;

import edu.bbte.softeng.lmim2155.ml.model.domain.Bread;
import edu.bbte.softeng.lmim2155.ml.model.dto.in.BreadInDto;
import edu.bbte.softeng.lmim2155.ml.model.dto.out.BreadOutDto;
import java.util.Collection;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface BreadMapper {
    @Mapping(target = "id", ignore = true)
    Bread toDomain(BreadInDto bread);

    BreadOutDto toOutDto(Bread bread);

    @IterableMapping(elementTargetType = BreadOutDto.class)
    Collection<BreadOutDto> toOutDtoS(Iterable<Bread> breads);
}
