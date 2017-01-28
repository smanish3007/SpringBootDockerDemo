package hello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class MyHelloWorld {
	public static void main(String args[])
	{
		SpringApplication.run(MyHelloWorld.class, args);
	}
	@RequestMapping("/")
	public String displayResult()
	{
		return("Hello Manish, It is spring boot docker again");
	}

}
