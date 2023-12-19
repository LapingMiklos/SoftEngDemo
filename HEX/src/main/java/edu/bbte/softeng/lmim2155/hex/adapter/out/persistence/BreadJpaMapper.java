package edu.bbte.softeng.lmim2155.hex.adapter.out.persistence;

import edu.bbte.softeng.lmim2155.hex.application.domain.entity.Bread;
import java.util.Collection;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BreadJpaMapper {
    BreadJpaEntity toJpaEntity(Bread bread);

    Bread toDomain(BreadJpaEntity jpaEntity);

    @IterableMapping(elementTargetType = Bread.class)
    Collection<Bread> toDomain(Iterable<BreadJpaEntity> breads);
}
