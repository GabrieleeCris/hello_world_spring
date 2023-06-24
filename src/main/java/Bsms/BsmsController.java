package Bsms;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsms")
public class BsmsController {

	@GetMapping
	public String bsms() {

	return "Mentalidades:"
	"Responsabilidade pessoal,\n"
	"Mentalidade de crescimento\n"
	"Orientação ao futuro\n"
	"Persistência\n" 

	"Habilidades Comportamentais\n"
	"Comunicação\n"
	"Orientação aos detalhes\n" 
	"Trabalho em equipe\n" 
	"Proatividade\n" ; 

}
}