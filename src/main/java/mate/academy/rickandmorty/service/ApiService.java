package mate.academy.rickandmorty.service;

import mate.academy.rickandmorty.dto.external.CharacterResponseDto;

import java.util.List;

public interface ApiService {
    List<CharacterResponseDto> fetchDataFromApi();
}
