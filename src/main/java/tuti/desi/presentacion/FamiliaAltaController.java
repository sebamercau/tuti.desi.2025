package tuti.desi.presentacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import tuti.desi.entidades.Familia;
import tuti.desi.servicios.FamiliaAltaService;

@Controller
@RequestMapping("/familias/alta")
public class FamiliaAltaController {

    @Autowired
    private FamiliaAltaService familiaAltaService;

    @GetMapping
    public String mostrarFormularioAlta(Model modelo) {
        modelo.addAttribute("familia", new Familia());
        return "familias/altafamilia";
    }

    @PostMapping
    public String procesarAlta(@ModelAttribute("familia") Familia familia) {
        familiaAltaService.guardar(familia);
        return "redirect:/familias";
    }
}
