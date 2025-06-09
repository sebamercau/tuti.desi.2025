package tuti.desi.presentacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tuti.desi.servicios.RecetaService;


@Controller
public class RecetaEditarController {

	@Autowired
	private RecetaService servicioRecetas;
	
}
