package gui;

import ecosistema.Biosenosis;
import ecosistema.Biotopo;
import ecosistema.SistemaBiologico;
import ecosistema.biosenosis.SerVivo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcosistemaGUI extends JDialog {
    private SistemaBiologico sistemaBiologico;
    private JPanel contentPane;
    private JButton buttonAdd;
    private JButton buttonSetup;
    private JTabbedPane tabbedPaneEcosistema;
    private JPanel jPanelEcosistema;

    public EcosistemaGUI() {
        sistemaBiologico = new SistemaBiologico("Mi ecosistema");
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonAdd);
        buttonSetup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Biotopo biotopo = new Biotopo("Hojas");
                biotopo.setElSistemaBiologico(sistemaBiologico);
                sistemaBiologico.getLosBiotopos().add(biotopo);

                System.out.print(sistemaBiologico);

                Biosenosis biosenosis = new Biosenosis("Insectos");
                biosenosis.setElSistemaBiologico(sistemaBiologico);
                sistemaBiologico.getLasBiosenosis().add(biosenosis);

                System.out.print(sistemaBiologico);
            }
        });
        buttonAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SerVivo serVivo = new SerVivo("Pepe Grillo");

                serVivo.setLaBiosenosis(sistemaBiologico.getLasBiosenosis().get(0));
                sistemaBiologico.getLasBiosenosis().get(0).getLosSeresVivos().add(serVivo);

                System.out.print(sistemaBiologico);
            }
        });
    }

    public static void main(String[] args) {
        EcosistemaGUI dialog = new EcosistemaGUI();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
