import ecosistema.Biosenosis;
import ecosistema.Biotopo;
import ecosistema.SistemaBiologico;
import ecosistema.biosenosis.SerVivo;

public class Main {
    public static void main(String[] args) {
        SistemaBiologico sistemaBiologico = new SistemaBiologico("Arbol");
        System.out.print(sistemaBiologico);

        Biotopo biotopo = new Biotopo("Hojas");
        biotopo.setElSistemaBiologico(sistemaBiologico);
        sistemaBiologico.getLosBiotopos().add(biotopo);

        System.out.print(sistemaBiologico);

        Biosenosis biosenosis = new Biosenosis("Insectos");
        biosenosis.setElSistemaBiologico(sistemaBiologico);
        sistemaBiologico.getLasBiosenosis().add(biosenosis);

        System.out.print(sistemaBiologico);

        SerVivo serVivo = new SerVivo("Pepe Grillo");
        serVivo.setLaBiosenosis(biosenosis);
        biosenosis.getLosSeresVivos().add(serVivo);

        System.out.print(sistemaBiologico);
    }
}
