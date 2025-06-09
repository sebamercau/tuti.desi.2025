package tuti.desi.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tuti.desi.accesoDatos.FamiliaRepo;
import tuti.desi.entidades.Familia;

@Service
public class FamiliaEditarServiceImpl implements FamiliaEditarService {

    @Autowired
    private FamiliaRepo familiaRepo;

    
    public void actualizar(Familia familia) {
        Familia existente = familiaRepo.findById(familia.getId())
                .orElseThrow(() -> new IllegalArgumentException("Familia no encontrada con ID: " + familia.getId()));

        existente.setNombre(familia.getNombre());
        existente.setIntegrantes(familia.getIntegrantes()); // eliminación lógica si es necesario

        familiaRepo.save(existente);
    }
}
