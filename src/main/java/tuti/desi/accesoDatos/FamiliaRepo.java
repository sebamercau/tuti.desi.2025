package tuti.desi.accesoDatos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tuti.desi.entidades.Familia;

@Repository
public interface FamiliaRepo extends JpaRepository<Familia, Long> {
	 List<Familia> findByActivaTrue(); // para listar solo activas
}
