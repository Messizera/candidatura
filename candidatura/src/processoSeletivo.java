import java.util.concurrent.ThreadLocalRandom;

public class processoSeletivo {
    static String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO","MIRELA","DANIELA", "JORGE"};

    public static void main(String[] args) throws Exception {
        System.out.println("Processo seletivo");
        selecaoCandidatos();
        imprimirarSelecioandos();
        for (String candidato: candidatos) {
            entrandemcontato(candidato);
        }
    }

    static void entrandemcontato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu= atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while(continuarTentando && tentativasRealizadas<3);

        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " +candidato+ " NA " +tentativasRealizadas+ "ª TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " +candidato+ ". NUMERO MAXIMO DE TENTATIVAS REALIZADAS");
    }

    static boolean atender() {
        return ThreadLocalRandom.current().nextInt(3)==1;
    }

    static void imprimirarSelecioandos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice= 0; indice < candidatos.length;indice++) {
            System.out.println("O candidato de n° " +(indice+1)+ " é " + candidatos[indice]);
        }
        System.out.println("Forma abreviada for each");
        for(String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato );
        }
    }

    static void selecaoCandidatos(){
        int candidatosSelecionado = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.00;
        while(candidatosSelecionado <5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou esse valor de salário: " +salarioPretendido);
            if (salarioBase >= salarioPretendido){
                candidatosSelecionado++;
                System.out.println("O candidato "+ candidato+ " foi selecionado para a vaga");
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido (){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase==salarioPretendido)
            System.out.println("Ligar para o candidato com contra proposta");
        else
            System.out.println("Aguardando demais candidatos");
    }
}
