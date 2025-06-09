package tuti.desi.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tuti.desi.accesoDatos.FamiliaRepo;
import tuti.desi.entidades.Familia;

@Service
public class FamiliaBuscarServiceImpl implements FamiliaBuscarService {

    @Autowired
    private FamiliaRepo familiaRepo;

    @Override
    public List<Familia> buscarActivas() {
        return familiaRepo.findByActivaTrue();
    }
}
