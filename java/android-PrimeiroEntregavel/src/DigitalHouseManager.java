import java.util.HashMap;
import java.util.Map;

public class DigitalHouseManager {
    private Map<Integer,Aluno> listaAlunos = new HashMap<>();
    private Map<Integer, Professor> listaProfessores = new HashMap<>();
    private Map<Integer,Curso> listaCurso = new HashMap<>();
    private Map<Integer,Matricula> listaMatricula = new HashMap<>();


    public DigitalHouseManager() {
    }


    public void registrarCurso(String nome, Integer codigoCurso, Integer qtdMaximaAlunos) {
        if(!listaCurso.containsKey(codigoCurso)) {

            Curso novoCurso = new Curso(nome, codigoCurso, qtdMaximaAlunos);
            registrarCurso(novoCurso);
        }else {            Main.print("Já existe um curso com este codigo.");
        }
    }

    public void registrarCurso(Curso novoCurso){
           listaCurso.put(novoCurso.getCodigoCurso(),novoCurso);
           System.out.println("Curso " + novoCurso.getNome() + " cadastrado com sucesso!");
            }

    public void excluirCurso(Integer codigoCurso){
        Curso curso = listaCurso.get(codigoCurso);
        if(curso !=null){
            Main.print(
                    "----- Curso encontrado -----" +"\n"+
                            "Curso: " + curso.getNome() + "\n" +
                            "curso sendo excluido da lista."
            );
            excluirCurso(curso);
        }else{
            Main.print("Este curso não está na lista do curso e não foi removido.");
        }
    }
    public void excluirCurso(Curso cursoSendoExcluido){
        if(listaCurso.containsKey(cursoSendoExcluido.getCodigoCurso())){
            listaCurso.remove(cursoSendoExcluido.getCodigoCurso());
            Main.print("O curso " + cursoSendoExcluido.getNome() + " foi removido da lista do curso.");
        }else{
            Main.print("Este curso não está na lista do curso e não pode removido.");
        }
    }

    public Map<Integer, Curso> getListaCurso() {
        return listaCurso;
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome,
                                          Integer codigoProfessor, Integer quantidadeDeHoras) {
        if(!listaProfessores.containsKey(codigoProfessor)) {
            ProfessorAdjunto novoProfessorAdjunto = new ProfessorAdjunto(nome, sobrenome, 0,
                    codigoProfessor, quantidadeDeHoras);
            listaProfessores.put(novoProfessorAdjunto.getCodigoProfessor(), novoProfessorAdjunto);
            Main.print("Professor Adjunto adicionado com sucesso!");
        }else {
            Main.print("Já existe um professor com este codigo.");
        }
    }

    public void registrarProfessorTitular(String nome, String
            sobrenome, Integer codigoProfessor, String especialidade){
        if(!listaProfessores.containsKey(codigoProfessor)){

            ProfessorTitular novoProfessorTitular = new ProfessorTitular(nome,sobrenome,0,
                                                                    codigoProfessor,especialidade);
        listaProfessores.put(novoProfessorTitular.getCodigoProfessor(),novoProfessorTitular);
        Main.print("Professor Titular adicionado com sucesso!");
        }else {
            Main.print("Já existe um professor com este codigo.");
        }

    }

    public void excluirProfessor(Integer codigoProfessor){
        if(listaProfessores.containsKey(codigoProfessor)){
            Main.print(
                    "----- professor encontrado -----" +"\n"+
                            "Professor: " + listaProfessores.get(codigoProfessor).getNome() + "\n" +
                            "Professor sendo excluido da lista...."
            );
            listaProfessores.remove(listaProfessores.get(codigoProfessor).getCodigoProfessor());
            Main.print("Professor ganhou um pé na bunda!!!");
        }else{
            Main.print("Este professor não está na lista e não pode ser removido.");
        }
    }

    public Map<Integer, Professor> getListaProfessores() {
        return listaProfessores;
    }

    public void matricularAluno(String nome, String sobrenome,
                                Integer codigoAluno){
        if(!listaAlunos.containsKey(codigoAluno)) {
            Aluno alunoMatriculado = new Aluno(nome, sobrenome, codigoAluno);
            matricularAluno(alunoMatriculado);
        }else {            Main.print("Já existe um aluno com este codigo.");
        }
    }

    public void matricularAluno(Aluno alunoMatriculado){
        listaAlunos.put(alunoMatriculado.getCodigoAluno(),alunoMatriculado);
        System.out.println("Aluno " + alunoMatriculado.getNome() + " matriculado com sucesso!");
    }

    public Map<Integer, Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void matricularAluno(Integer codigoAluno, Integer
            codigoCurso){
        Curso curso = listaCurso.get(codigoCurso);
        Aluno aluno = listaAlunos.get(codigoAluno);
        if(curso != null && aluno != null){
            Main.print(
                    "=============>  Curso Encontrado  <============= " + "\n" +
                            "Curso: " + curso.getNome() + "\n"
            );
            Main.print(
                    "=============>  Aluno Encontrado  <============= " + "\n" +
                            "Aluno: " + aluno.getNome() + "\n");
            System.out.println(curso.getQtdMaximaAlunos()+ "<------- qtdMaximaAluno   qtdAlunos ----->" + curso.getListaAlunos().size());

                if (curso.adicionarUmAluno(aluno)){
                curso.setListaAlunos(aluno);
                Matricula matriculaAluno = new Matricula(aluno,curso);
                listaMatricula.put(codigoCurso,matriculaAluno);
                Main.print(
                        "\n" +
                        "=============>  Matricula realizada com sucesso  <=============" + "\n" +
                                "O aluno " + aluno.getNome() +" foi matriculado no curso " + curso.getNome());
            }else{
                Main.print("****  Não foi possivel matricular o aluno " + aluno.getNome() + " porque não há vagas. ****" );
            };
        }else {
            Main.print("*************  Curso não cadastrado!  *************");
            Main.print("*************  Aluno não cadastrado! *************");
        }
    }

    public Map<Integer, Matricula> getListaMatricula() {
        return listaMatricula;
    }

    public void alocarProfessores(Integer codigoCurso, Integer
            codigoProfessorTitular, Integer codigoProfessorAdjunto){

        Curso curso = listaCurso.get(codigoCurso);
        Professor profTitular = listaProfessores.get(codigoProfessorTitular);
        Professor profAdjunto = listaProfessores.get(codigoProfessorAdjunto);

            if(curso != null){
                Main.print(
                        "=============>  Curso Encontrado  <============= " + "\n" +
                                "Curso: " + curso.getNome() + "\n"
                );

            }else {
                Main.print("Curso não cadastrado!");
            }

            if(curso != null && profTitular != null && profAdjunto!= null){
                Main.print(
                        "=============>  Professor Titular Encontrado  <============= " + "\n" +
                                "Professor Titular: " + profTitular.getNome() + "\n"
                );
                ProfessorTitular titular = new ProfessorTitular(profTitular.getNome(),profTitular.getSobrenome(),profTitular.getTempoDeCasa(),profTitular.getCodigoProfessor());
                Main.print(
                        "=============>  Professor Adjunto Encontrado  <============= " + "\n" +
                                "Professor Adjunto: " + profAdjunto.getNome() + "\n"
                );
                ProfessorAdjunto adjunto = new ProfessorAdjunto(profAdjunto.getNome(),profAdjunto.getSobrenome(),profAdjunto.getTempoDeCasa(),profAdjunto.getCodigoProfessor());
                curso.setProfessorTitular(titular);
                curso.setProfessorAdjunto(adjunto);
                Main.print(
                        "=============>  Professores alocados ao curso  " + curso.getNome() + "  <============= " + "\n" +
                                "Professor Titular: " + profTitular.getNome() + "\n" +
                                "Professor Adjunto: " + profAdjunto.getNome() + "\n"
                );
            }


    }


}


