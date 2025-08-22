package com.avatar_api.api.repositories;

import com.avatar_api.api.models.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {

    @Query(value = "SELECT * FROM characters", nativeQuery = true)
    List<Character> findAllCharactersNative();
}