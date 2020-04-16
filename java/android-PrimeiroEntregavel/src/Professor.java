public abstract class Professor {
    private String
                nome,
                sobrenome;
    private Integer
                tempoDeCasa,
                codigoProfessor;

    public Professor() {
    }

    public Professor(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoProfessor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoDeCasa = tempoDeCasa;
        this.codigoProfessor = codigoProfessor;
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

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public Integer getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(Integer codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    @Override
    public boolean equals(Object umProfessor){
        if(umProfessor instanceof Professor){
            Professor qualquer = (Professor) umProfessor;
            return this.getCodigoProfessor().equals(qualquer.getCodigoProfessor());
        }else {
            return false;
        }
    }
}
