import java.util.HashMap;
import java.util.Map;

public class Curso {
    private String nome;
    private Integer codigoCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private Integer qtdMaximaAlunos;
    private Map<Integer,Aluno> listaAlunos = new HashMap<>();

    public Curso() {
    }

    public Curso(String nome, Integer codigoCurso, ProfessorTitular professorTitular, ProfessorAdjunto professorAdjunto, Integer qtdMaximaAlunos) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
        this.qtdMaximaAlunos = qtdMaximaAlunos;
    }

    public Curso( Integer codigoCurso, ProfessorTitular professorTitular, ProfessorAdjunto professorAdjunto) {
        this.codigoCurso = codigoCurso;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
    }

    public Curso(String nome, Integer codigoCurso, Integer qtdMaximaAlunos) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.qtdMaximaAlunos = qtdMaximaAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Integer getQtdMaximaAlunos() {
        return qtdMaximaAlunos;
    }

    public void setQtdMaximaAlunos(Integer qtdMaximaAlunos) {
        this.qtdMaximaAlunos = qtdMaximaAlunos;
    }

    public Map<Integer,Aluno> getListaAlunos() {

         return listaAlunos;
    }

    public void setListaAlunos(Aluno... variosAlunos) {
                for (Aluno aluno : variosAlunos) {
            listaAlunos.put(aluno.getCodigoAluno(), aluno);
            System.out.println("Aluno adicionado na lista do curso.");
        }
    }

    @Override
    public boolean equals(Object umCurso) {
        if (umCurso instanceof Curso) {
            Curso qualquer = (Curso) umCurso;
            return this.getCodigoCurso().equals(qualquer.getCodigoCurso());
        } else {
            return false;
        }
    }

    public boolean adicionarUmAluno(Aluno umAluno){
        if(getListaAlunos().containsKey(umAluno.getCodigoAluno())){
            return false;
        }else{
            if(getListaAlunos().size() < getQtdMaximaAlunos()){
                return true;
            }else {
                return false;
            }
        }


    }

    public void excluirAluno(Aluno umAluno){
        if(listaAlunos.containsKey(umAluno.getCodigoAluno())){
            listaAlunos.remove(umAluno.getCodigoAluno());
            System.out.println("O Aluno " + umAluno.getNome() + " foi removido da lista do curso.");
        }else{
            System.out.println("Este aluno não está na lista do curso e não foi removido.");
        }
    }


}
