package models;

public class Data {

    private int dia;
    private int mes;
    private int ano;
    private static final String[] meses = {null, "Janeiro", "Fevereiro", "Março", "Abril", "Maio"
            , "Junho", "Julho", "Agosto", "Setembro", "outubro", "Novembro", "Dezembro"
    };

    public Data() {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public Data(int mes, int ano) {
        setMes(mes);
        setAno(ano);
    }

    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public Data(int ano) {
        this.dia = 1;
        this.mes = 1;
        this.ano = ano;
    }

    public Data(String data) {
        String[] a = data.split("/");

        setDia(Integer.parseInt(a[0]));
        setMes(Integer.parseInt(a[1]));
        setAno(Integer.parseInt(a[2]));
    }

    public boolean bissexto() {
        return this.ano % 400 == 0 || (this.ano % 4 == 0 && this.ano % 100 != 0);
    }

    public Data clone() {
        return new Data(this.dia, this.mes, this.ano);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia % 1 == 0 && dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {
            this.dia = 1;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes % 1 == 0 && mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            this.mes = 1;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano % 1 == 0 && ano >= 0) {
            this.ano = ano;
        } else {
            this.ano = 1;
        }
    }

    public String getMesExtenso() {
        return meses[this.mes];
    }

    public String getAno2Dig() {
        int a = ano % 100;
        String b = String.valueOf(a);
        if (b.length() < 2) {
            b = "0" + b;
        }
        return b;
    }

    @Override
    public String toString() {
        return String.format("%02d" + "/" + "%02d" + "/" + "%04d", dia, mes, ano);
    }
}