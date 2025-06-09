package tuti.desi.presentacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import tuti.desi.servicios.FamiliaBajaService;

@Controller
@RequestMapping("/familias")
public class FamiliaBajaController {

    @Autowired
    private FamiliaBajaService familiaBajaService;

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        familiaBajaService.darDeBaja(id);
        return "redirect:/familias";
    }
}
