package mon.group.mvcprojet.service;

import mon.group.mvcprojet.dto.ClubDto;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
}
