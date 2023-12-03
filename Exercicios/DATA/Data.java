import java.util.Calendar;
import java.util.GregorianCalendar;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (dataEhValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }

    public int compara(Data outraData) {
        if (this.ano < outraData.ano) {
            return -1;
        } else if (this.ano > outraData.ano) {
            return 1;
        } else {
            if (this.mes < outraData.mes) {
                return -1;
            } else if (this.mes > outraData.mes) {
                return 1;
            } else {
                if (this.dia < outraData.dia) {
                    return -1;
                } else if (this.dia > outraData.dia) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public String getMesExtenso() {
        String[] mesesExtenso = {
            "Janeiro", "Fevereiro", "Março", "Abril",
            "Maio", "Junho", "Julho", "Agosto",
            "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        return mesesExtenso[mes - 1];
    }

    public int getAno() {
        return ano;
    }

    public boolean isBissexto() {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public Data clone() {
        return new Data(this.dia, this.mes, this.ano);
    }

    private boolean dataEhValida(int dia, int mes, int ano) {
        Calendar cal = new GregorianCalendar();
        cal.setLenient(false);
        cal.set(ano, mes - 1, dia);

        try {
            cal.getTime();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}