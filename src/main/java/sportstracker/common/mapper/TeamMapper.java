package sportstracker.common.mapper;

import sportstracker.dao.entity.Team;
import sportstracker.model.TeamDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
/**
 * Map team to teamDto
 *
 * @author dntvo
 */
@Mapper(componentModel = "spring")
public interface TeamMapper {

    TeamMapper INSTANCE = Mappers.getMapper(TeamMapper.class);

    TeamDto teamToTeamDto(Team team);

    @Mapping(target = "teamId", ignore = true)
    void updateTeamFromTeamDto(TeamDto teamDto, @MappingTarget Team team);
}
