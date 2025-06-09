package tuti.desi.presentacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import tuti.desi.entidades.Familia;
import tuti.desi.servicios.FamiliaAltaService;

@Controller
@RequestMapping("/familias")
public class FamiliaAltaController {

    @Autowired
    private FamiliaAltaService familiaAltaService;

    @GetMapping("/alta")
    public String mostrarFormularioAlta(Model modelo) {
        modelo.addAttribute("familia", new Familia());
        return "familias/familiaAlta";
    }

    @PostMapping("/guardar")
    public String procesarAlta(@ModelAttribute("familia") Familia familia){
    	
        familiaAltaService.guardar(familia);
        return "redirect:/familias";
    }
}
