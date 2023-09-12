import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;


public class Processo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo seletivo");
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        String [] selecionados = new String[5];
        int count = 0;        
        for (int i = 0; i < candidatos.length ; i++){
            if (valorPretendido() <= 2000.00){
                selecionados[count] = candidatos[i];
                count++;
            }
            if (count == 5)
                break;
        }

        if (count == 1){
            System.out.printf("%d candidato foi selecionados.\n",count);
        } else {
            System.out.printf("%d candidatos foram selecionados.\n",count);
        }
        
        for(int i = 0; i < selecionados.length ; i++){
            if (selecionados[i] != null){
                System.out.printf("Candidato %s foi selecionado(a)\n",selecionados[i]);
            }
        }

        for (int i = 0; i < selecionados.length; i++){
            if (selecionados[i] != null){
                ligar(selecionados[i]);
            }
        }

    }

    public static void ligar(String candidato){
        boolean atendido = false;
        int tentativas = 1;
        for (; tentativas <= 3; tentativas++){
            int atendeu = new Random().nextInt(3);
            if (atendeu > 0){
                atendido = true;
                break;
            }
        }
        if (atendido){
            System.out.printf("\nCONSEGUIMOS CONTATO COM %s APÓS %d TENTATIVAS",candidato, tentativas);
        }else{
            System.out.printf("\nNÃO CONSEGUIMOS CONTATO COM %s",candidato);
        }
        
    }
    
    // Método que simula o valor pretendido
    public static double valorPretendido() {
         return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


}
