public class Main {

    static void print(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {

        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();
        Curso curso = new Curso();

        digitalHouseManager.registrarProfessorTitular("Fred","Prateado",1,"Android");
        digitalHouseManager.registrarProfessorTitular("Francisleine","Silva",5,"Full Stack");
        digitalHouseManager.registrarProfessorAdjunto("Joselito","de Jesus",13,23);
        digitalHouseManager.registrarProfessorAdjunto("Ilélia","de Souza",81,15);

        digitalHouseManager.registrarCurso("Full Stack",20001,3);
        digitalHouseManager.registrarCurso("Android",20002,2);

        digitalHouseManager.alocarProfessores(20001,1,13);
        digitalHouseManager.alocarProfessores(20002,5,81);

        digitalHouseManager.matricularAluno("Corona","Virus",9);
        digitalHouseManager.matricularAluno("Coronita","Beer",10);
        digitalHouseManager.matricularAluno(9,20001);
        digitalHouseManager.matricularAluno(10,20001);


        digitalHouseManager.matricularAluno("Mussum","Dede",11);
        digitalHouseManager.matricularAluno("Didi","Aragão",12);
        digitalHouseManager.matricularAluno("Zacarias","Santana",13);
        digitalHouseManager.matricularAluno(11,20002);
        digitalHouseManager.matricularAluno(12,20002);
        digitalHouseManager.matricularAluno(13,20002);



    }


}
