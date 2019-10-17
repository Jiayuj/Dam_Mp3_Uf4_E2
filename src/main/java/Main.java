import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n"+"      1   "+"\n");

        List<Llapis> llapisList = new ArrayList<Llapis>();
        for (int i = 0; i < 10 ; i++) {
            Llapis llapis = new Llapis();
            llapis.setColor(new Random().nextInt(10)+1);
            llapis.setGruix(new Random().nextInt(10)+1);
            llapisList.add(llapis);
        }
        System.out.println("Comparable-color");
        Collections.sort(llapisList);
        for (Llapis llapis : llapisList){
            System.out.println("color: "+llapis.getColor()+"   gruix: "+llapis.getGruix());
        }
        Collections.sort(llapisList, new LlapissosCompartor());
        System.out.println("Comparator-gruix");
        for (Llapis llapis : llapisList){
            System.out.println("color: "+llapis.getColor()+"   gruix: "+llapis.getGruix());
        }

        System.out.println("\n"+"      2   "+"\n");

        System.out.println("llipis originar");
        System.out.println(llapisList);
        System.out.println("llapis eleminada igual");
        Set<Llapis> llapisSet = new HashSet<Llapis>(llapisList);
        System.out.println(llapisSet);


        System.out.println("\n"+"      3   "+"\n");

        Map<Integer,String> jugadores = new HashMap<Integer, String>();
        for (int i = 0; i < 16 ; i++) {
            Jugador jugador = new Jugador();
            jugador.setClau(new Random().nextInt(24)+1);
            jugador.setNom();
            jugadores.put(jugador.clau,jugador.nom);
        }
        Set<Map.Entry<Integer,String> > st = jugadores.entrySet();
        for (Map.Entry<Integer,String> me : st){
            if ((me.getKey()%2)!=0){
                System.out.println("\""+me.getValue() + " "+ me.getKey()+"\"");
            }
        }

    }

}
