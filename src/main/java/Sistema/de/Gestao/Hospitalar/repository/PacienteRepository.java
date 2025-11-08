package Sistema.de.Gestao.Hospitalar.repository;

import Sistema.de.Gestao.Hospitalar.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
