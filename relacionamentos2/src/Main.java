import br.univali.poo.exerciciosM2.exer01.*;

public class Main {
    public static void main(String[] args) {
        Piloto p = new Piloto("Ana", "não importa");
        Aviao a1 = new Aviao("Tigre", "AZL");
        Aviao a2 = new Aviao("Jaguar", "VRD");

        a1.assinarPiloto(p);
        a2.assinarPiloto(p);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(p);
    }
}
