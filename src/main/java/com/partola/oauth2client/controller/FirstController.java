package com.partola.oauth2client.controller;

import com.partola.oauth2client.dto.BookDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping("/")
	public BookDto getBook() {
		return new BookDto("stringId");
	}
}
