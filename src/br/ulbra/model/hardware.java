package br.ulbra.model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson
 */
public class hardware {

    public ArrayList<String> hardware = new ArrayList();

    public void adicionar(String C) {
        hardware.add(C.toUpperCase());
        JOptionPane.showMessageDialog(null, "O Item " + C
                + " foi adicionado com sucesso!!");
    }

    public String listarTimes() {
        //30 iguais e 7 espaços vazios no  inicio
        String rel = "       Relação de Item\n ==============================\n";
        if (!hardware.isEmpty()) {
            for (int i = 0; i < hardware.size(); i++) {
                rel += (i + 1) + " - " + hardware.get(i) + "\n";
            }
        } else {
            rel = "Relação de Item vazia!!";
        }
        return rel;
    }

    public void eliminar() {
        if (!hardware.isEmpty()) {
            if (JOptionPane.showConfirmDialog(null, "Os dados serão eliminados de "
                    + "forma permanente, tem certeza que deseja fazer isso??",
                    "Eliminar Base <cuidado>",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                hardware.clear();
                JOptionPane.showMessageDialog(null, "Os dados foram todos eliminados!");
            } else {
                JOptionPane.showMessageDialog(null, "Ação Cancelada com sucesso!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A base se encontra vazia...");
        }
    }

    public boolean retornarVazio() {
        return hardware.isEmpty();
    }

    public int pesquisar(String nome) {
        boolean achou = false;
        int i, ind;
        ind = -1;
        i = 0;
        while (i < hardware.size() && !(achou)) {
            if (hardware.get(i).equals(nome.toUpperCase())) {
                achou = true;
                ind = i;
            }
            i++;
        }

        return ind;
    }

    public void excluir(int i) {
     
        hardware.remove(i);
    }
    public void editar(int i, String novoNome){
        hardware.set(i, novoNome);
    }
}
