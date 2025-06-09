package tuti.desi.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tuti.desi.accesoDatos.FamiliaRepo;
import tuti.desi.entidades.Familia;

@Service
public class FamiliaBajaServiceImpl implements FamiliaBajaService {

    @Autowired
    private FamiliaRepo familiaRepo;

    @Override
    public void darDeBaja(Long id) {
        Familia familia = familiaRepo.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Familia no encontrada con ID: " + id));

        // Eliminación lógica
        familia.setActiva(false);

        // Guardar el cambio
        familiaRepo.save(familia);
    }
}
