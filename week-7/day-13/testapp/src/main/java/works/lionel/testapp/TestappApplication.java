package works.lionel.testapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// this is our springboot entrypoint
// we don't typically need to edit this in more sophisticated apps
// this simply serves as a typical java entry point
@SpringBootApplication
//@RestController
public class TestappApplication {

//	@GetMapping("/helloworld")
//	public String hello() {
//		return "Hello World";
//	}

	public static void main(String[] args) {

		SpringApplication.run(TestappApplication.class, args);
	}

}
