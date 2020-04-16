public class ProfessorTitular extends Professor {
    private String especialidade;

    public ProfessorTitular() {
    }

    public ProfessorTitular(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoProfessor, String especialidade) {
        super(nome, sobrenome, tempoDeCasa, codigoProfessor);
        this.especialidade = especialidade;
    }

    public ProfessorTitular(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoProfessor) {
        super(nome, sobrenome, tempoDeCasa, codigoProfessor);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
