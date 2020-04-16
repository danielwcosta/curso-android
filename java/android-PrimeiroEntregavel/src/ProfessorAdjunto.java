public class ProfessorAdjunto extends Professor {
    private Integer QtdHoras;

    public ProfessorAdjunto() {
    }

    public ProfessorAdjunto(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoProfessor, Integer qtdHoras) {
        super(nome, sobrenome, tempoDeCasa, codigoProfessor);
        this.QtdHoras = qtdHoras;
    }

    public ProfessorAdjunto(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoProfessor) {
        super(nome, sobrenome, tempoDeCasa, codigoProfessor);

    }


    public Integer getQtdHoras() {
        return QtdHoras;
    }

    public void setQtdHoras(Integer qtdHoras) {
        QtdHoras = qtdHoras;
    }
}
