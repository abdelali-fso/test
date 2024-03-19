package mon.group.mvcprojet.service.impl;

import lombok.AllArgsConstructor;
import mon.group.mvcprojet.dto.ClubDto;
import mon.group.mvcprojet.model.Club;
import mon.group.mvcprojet.repository.ClubRepository;
import mon.group.mvcprojet.service.ClubService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ClubServiceImpl implements ClubService {

    private final ClubRepository clubRepository;

    @Override
    public List<ClubDto> findAllClubs() {
        List<Club> clubs =  clubRepository.findAll();
        return clubs.stream().map(this::mapToClubDto).collect(Collectors.toList());
    }

    private ClubDto mapToClubDto(Club club){
        return ClubDto.builder()
                .idClub(club.getIdClub())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())
                .createdOn(club.getCreatedOn())
                .updatedOn(club.getUpdatedOn())
                .build();
    }
}
