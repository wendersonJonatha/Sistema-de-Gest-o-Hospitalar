package Sistema.de.Gestao.Hospitalar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Medicos")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Medico;

    @Column(nullable = false, length = 100)
    private  String nome_Medico;

    @Column(nullable = false, length = 50)
    private String crm;

    @Column(nullable = false, length = 50)
    private String especialidade;

    @Column(nullable = false, length = 50)
    private String telefone;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<Consulta> consultas;

}
