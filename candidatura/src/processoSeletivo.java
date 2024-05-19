public class processoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo seletivo");
            analisarCandidato(1900.00);
            analisarCandidato(2200.00);
            analisarCandidato(2000.00);


    }
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase==salarioPretendido)
        System.out.println("Ligar para o candato com contra proposta");
        else{System.out.println("Aguardando demais candidatos");}
    }
}
