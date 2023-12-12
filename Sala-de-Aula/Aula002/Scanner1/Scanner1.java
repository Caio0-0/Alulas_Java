package Scanner1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;




public class Scanner1 {
    public static void main(String[] args) {
        Scanner ler = new  Scanner(System.in);
    
        ArrayList<String> agenda = new ArrayList();

        agenda.add("lucas paqueta;21 2313-1231");
        agenda.add("neymar;32 3324-4332");
        agenda.add("gabriel jesus;32 4324-4243");
        agenda.add("pombo;42 2342-3424");
     
        int i;

        System.out.println("Procure o ArrayList (usando o indice)\n");
        int n = agenda.size();

        for(i =0;i<n;i++ ){
            System.out.printf("Posição %d-%s",i,agenda.get(i));
        
        }
        System.out.printf("\nInforme a posição a ser excluida:\n");
        i = ler.nextInt();

        try{
            agenda.remove(i);
        }catch(IndexOutOfBoundsException e){
            System.out.printf("\nErro:Posição invalida (%s)",e.getMessage());

        }
        System.out.printf("\nPercorendo o ArrayList (Usando for-Each)");

        i = 0;

        for(String contato:agenda){
            System.out.printf("Posição %d -%s\n", i,contato);
        }

        System.out.printf("\nPercorrendo o ArrayList (usando interador)");

        i = 0;

        Iterator<String> iterator = agenda.iterator();
        while(iterator.hasNext()){
            System.out.printf("Posição %d- %s\n",i,iterator.next());
            i++;
        }
    }
}

