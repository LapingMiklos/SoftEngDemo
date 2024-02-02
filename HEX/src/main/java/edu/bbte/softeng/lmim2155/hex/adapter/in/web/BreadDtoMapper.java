package edu.bbte.softeng.lmim2155.hex.adapter.in.web;

import edu.bbte.softeng.lmim2155.hex.adapter.in.web.dto.BreadInDto;
import edu.bbte.softeng.lmim2155.hex.adapter.in.web.dto.BreadOutDto;
import edu.bbte.softeng.lmim2155.hex.application.domain.entity.Bread;
import java.util.Collection;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface BreadDtoMapper {
    @Mapping(target = "id", ignore = true)
    Bread toDomain(BreadInDto bread);

    BreadOutDto toOutDto(Bread bread);

    @IterableMapping(elementTargetType = BreadOutDto.class)
    Collection<BreadOutDto> toOutDtoS(Iterable<Bread> breads);
}
