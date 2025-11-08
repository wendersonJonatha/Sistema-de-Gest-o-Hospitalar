package Sistema.de.Gestao.Hospitalar.service;

import Sistema.de.Gestao.Hospitalar.model.Consulta;
import Sistema.de.Gestao.Hospitalar.repository.ConsultaRepository;

import java.util.List;
import java.util.Optional;

public class ConsultaService {
    private final ConsultaRepository consultaRepository;

    public ConsultaService(ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;
    }

    public List<Consulta> listarTodos(){
        return consultaRepository.findAll();
    }
    public Optional<Consulta> buscarPeloId(Long id){
        return  consultaRepository.findById(id);
    }

    public Consulta salvar(Consulta consulta){
        return consultaRepository.save(consulta);
    }
    public void cancelar(Long id){
        consultaRepository.deleteById(id);
    }

}



