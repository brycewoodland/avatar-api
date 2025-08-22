package com.avatar_api.api.dto;

import java.util.List;

import com.avatar_api.api.models.Character;

public class CharacterResponse {
	private String message;
	private List<Character> characters;
	
	public CharacterResponse(String message, List<Character> characters) {
		this.message = message;
		this.characters = characters;
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public List<Character> getCharacters() {
		return characters;
	}
	
	public void setCharacters(List<Character> characters) {
		this.characters = characters;
	}
}
