import java.util.Objects;

public class Aluno {
    private String
                nome,
                sobrenome;
    private Integer codigoAluno;

    public Aluno(){

    }

    public Aluno(String nome, String sobrenome, Integer codigoAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoAluno = codigoAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(Integer codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    @Override
    public boolean equals(Object umAluno) {
      if(umAluno instanceof Aluno){
          Aluno qualquer = (Aluno) umAluno;
          return this.getCodigoAluno().equals(qualquer.getCodigoAluno());
      }else{
          return false;
      }
    }

}
