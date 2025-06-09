package tuti.desi.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tuti.desi.accesoDatos.FamiliaRepo;
import tuti.desi.entidades.Familia;

import java.time.LocalDate;

@Service
public class FamiliaAltaServiceImpl implements FamiliaAltaService {

    @Autowired
    private FamiliaRepo familiaRepo;

    @Override
    public void guardar(Familia familia) {
        // Asignar fecha de alta si no viene definida
        if (familia.getFechaRegistro() == null) {
            familia.setFechaRegistro(LocalDate.now());
        }

        // Activar la familia (alta implica familia activa)
        familia.setActiva(true);

        // Guardar en base de datos
        familiaRepo.save(familia);
    }
}
