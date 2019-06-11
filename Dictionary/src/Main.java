import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Exercise 1.1
        Map<Integer, String> loteriaDosSonhos = new HashMap();

        loteriaDosSonhos.put(0, "Ovos");
        loteriaDosSonhos.put(1, "Água");
        loteriaDosSonhos.put(2, "Escopeta");
        loteriaDosSonhos.put(3, "Cavalo");
        loteriaDosSonhos.put(4, "Dentista");
        loteriaDosSonhos.put(5, "Fogo");

        System.out.println(loteriaDosSonhos);


        //Exercise 1.2
        Map<String, List<String>> apelidos = new HashMap<>();

        List<String> joao = new ArrayList<>();
        joao.add("Juan");
        joao.add("Fissura");
        joao.add("Maromba");
        apelidos.put("João", joao);

        List<String> miguel = new ArrayList<>();
        miguel.add("Night Watch");
        miguel.add("Bruce Wayne");
        miguel.add("Tampinha");
        apelidos.put("Miguel", miguel);

        List<String> maria = new ArrayList<>();
        maria.add("Wonder Woman");
        maria.add("Mary");
        maria.add("Marilene");
        apelidos.put("Maria", maria);

        List<String> lucas = new ArrayList<>();
        lucas.add("Lukinha");
        lucas.add("Jorge");
        lucas.add("George");
        apelidos.put("Lucas", lucas);

        for(String nome : apelidos.keySet()) {
            System.out.println(nome + " = " + apelidos.get(nome));
        }
    }
}
