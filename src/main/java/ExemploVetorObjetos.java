public class ExemploVetorObjetos {
    public static void main(String[] args) {
        // Criando um vetor de objetos Aluno
        Aluno[] turma = new Aluno[3];

        // Inicializando os objetos no vetor
        turma[0] = new Aluno("Maria", 20);
        turma[1] = new Aluno("João", 22);
        turma[2] = new Aluno("Pedro", 21);

        // Percorrendo e imprimindo os dados
        for (Aluno aluno : turma) {
            System.out.println(aluno);
        }
    }

}
