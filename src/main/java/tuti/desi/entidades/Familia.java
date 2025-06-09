package tuti.desi.entidades;

import java.time.LocalDate;

import java.util.List;

import jakarta.persistence.Id;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;

@Entity
public class Familia {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private LocalDate fechaRegistro;
    private Integer nroFamilia;

    @OneToMany(mappedBy = "familia", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Asistido> integrantes;

    

    @OneToMany(mappedBy = "familia")
    private List<EntregaAsistencia> entregas;
    
    private boolean activa = true;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Integer getNroFamilia() {
		return nroFamilia;
	}

	public void setNroFamilia(Integer nroFamilia) {
		this.nroFamilia = nroFamilia;
	}

    public boolean isActiva() { 
    	return activa; 
    	}
    public void setActiva(boolean activa) { 
    	this.activa = activa; 
    	}
    public List<Asistido> getIntegrantes() {
    	return integrantes; }
    
    public void setIntegrantes(List<Asistido> integrantes) { 
    	this.integrantes = integrantes; }

    public List<EntregaAsistencia> getEntregas() {
    	return entregas; }
    public void setEntregas(List<EntregaAsistencia> entregas) {
    	this.entregas = entregas; }

	public Long getId() {
		return null;
	}
}
