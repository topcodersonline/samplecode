package x.x;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@RestController
public class StudentRestController {

	@GetMapping("/data")
	public String showData(
			@RequestParam Integer id,
			@RequestParam String code
			) 
	{
		
		return "Data is : " + id + "-" + code;
	}
}
