package com.avatar_api.api.controllers;
import java.util.List;
import com.avatar_api.api.models.Character;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avatar_api.api.repositories.CharacterRepository;

@RestController
@RequestMapping("/api/v1/characters")
public class CharacterController {
	
	@Autowired
	private CharacterRepository characterRepository;
	
	@GetMapping
	public ResponseEntity<?> getAllCharacters() {
		try {
			List<Character> characters = characterRepository.findAllCharactersNative();
			return ResponseEntity.ok(characters);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
								 .body("An unexpected error occured. Please try again later.");
		}
	}
}
