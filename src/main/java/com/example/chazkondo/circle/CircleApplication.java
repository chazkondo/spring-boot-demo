package com.example.chazkondo.circle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;


import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Controller
@SpringBootApplication
public class CircleApplication {
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping("/api")
	@ResponseBody
	public Map<String, String> home() {
		HashMap<String, String> map = new HashMap<>();

		Random obj1 = new Random();
		Random obj2 = new Random();

		int rand_num1 = obj1.nextInt(0xffffff + 1);
		int rand_num2 = obj2.nextInt(0xffffff + 1);

		String colorCode1 = String.format("#%06x", rand_num1);
		String colorCode2 = String.format("#%06x", rand_num2);

		map.put("color1", colorCode1);
		map.put("color2", colorCode2);
		return map;
	}

	public static void main(String[] args) {
		SpringApplication.run(CircleApplication.class, args);
	}
}