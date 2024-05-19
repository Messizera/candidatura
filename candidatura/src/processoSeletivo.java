import java.util.concurrent.ThreadLocalRandom;

public class processoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo seletivo");
        selecaoCandidatos();
    }
    
    static void selecaoCandidatos(){
         String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO","MIRELA","DANIELA", "JORGE"};

        int candidatosoSelecionado = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.00;
        while(candidatosoSelecionado <5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou esse valor de salário: " +salarioPretendido);
            if (salarioBase >= salarioPretendido){
                candidatosoSelecionado++;
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
        else{System.out.println("Aguardando demais candidatos");}
    }
}
