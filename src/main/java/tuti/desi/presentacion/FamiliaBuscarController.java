package tuti.desi.presentacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tuti.desi.servicios.FamiliaBuscarService;

@Controller
@RequestMapping("/familias")
public class FamiliaBuscarController {

	  @Autowired
	    private FamiliaBuscarService familiaBuscarService;

	    @GetMapping("/buscar")
	    public String mostrarListado(Model modelo) {
	        modelo.addAttribute("familias", familiaBuscarService.buscarActivas());
	        return "familias/listado";
	    }
}
