package com.example.chazkondo.circle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@SpringBootApplication
public class CircleApplication {

	@RequestMapping("/api")
	@ResponseBody
	public Map<String, String> home() {
		HashMap<String, String> map = new HashMap<>();
		map.put("color1", "#123456");
		map.put("color2", "#ABCDEF");
		return map;
	}

	public static void main(String[] args) {
		SpringApplication.run(CircleApplication.class, args);
	}
}