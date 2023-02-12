package Util;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Serviços {

    public static String retornar_Data(String data) {
        DateFormat formatUS = new SimpleDateFormat("yyyy-MM-dd");
        formatUS.setLenient(false); // assim não aceita datas inválidas
        Date data_att = null;
        try {
            data_att = formatUS.parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Serviços.class.getName()).log(Level.SEVERE, null, ex);
        }

        DateFormat formatBR = new SimpleDateFormat("dd/MM/yyyy");
        formatBR.setLenient(false);
        return formatBR.format(data_att);
    }

    public static String levar_Data(String data) {
        DateFormat formatBR = new SimpleDateFormat("dd/MM/yyyy");
        formatBR.setLenient(false);
        Date data_att = null;
        try {
            data_att = formatBR.parse(data);
        } catch (ParseException ex) {
            Component parentComponent = null;
            JOptionPane.showMessageDialog(parentComponent, "A data informada nao existe!");
            return null;
        }

        DateFormat formatUS = new SimpleDateFormat("yyyy-MM-dd");
        formatUS.setLenient(false); // assim não aceita datas inválidas
        return formatUS.format(data_att);
    }

    public static String colocar_cnpj(String cnpj) {
        cnpj = cnpj.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
        return cnpj;
    }

    public static String colocar_telefone(String telefone) {
        telefone = telefone.replaceAll("(\\d{0})(\\d{2})(\\d{1})(\\d{4})", "$1($2)$3.$4-");
        return telefone;
    }

    public static String sexo(Integer sexo) {
        if (null == sexo) {
            return "Outro";
        } else {
            return switch (sexo) {
                case 1 ->
                    "Masculino";
                case 2 ->
                    "Feminino";
                default ->
                    "Outro";
            };
        }
    }

    public static String cargo(Integer cargo) {
        if (null == cargo) {
            return null;
        } else {
            return switch (cargo) {
                case 2 ->
                    "Vendedor";
                case 3 ->
                    "Gerente";
                default ->
                    "Gerente Geral";
            };
        }
    }

}
