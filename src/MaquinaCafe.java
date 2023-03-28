import java.util.Scanner;

public class MaquinaCafe {

    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

    public MaquinaCafe() {
        this.agua = 5000;
        this.cafe = 1000;
        this.crema = 1500;
        this.vasos = 50;
    }

    public MaquinaCafe(int agua, int cafe, int crema, int vasos) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        this.crema = crema;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    public void estado() {
        System.out.println("Estado actual de la cafetera:");
        System.out.println("Agua: " + agua + " ml");
        System.out.println("Café: " + cafe + " g");
        System.out.println("Crema: " + crema + " ml");
        System.out.println("Vasos: " + vasos);
    }

    public boolean puedePrepararCafe(int aguaRequerida, int cafeRequerido, int cremaRequerida) {
        return agua >= aguaRequerida && cafe >= cafeRequerido && crema >= cremaRequerida && vasos > 0;
    }

    public void americano() {
        if (puedePrepararCafe(180, 15, 0)) {
            agua -= 180;
            cafe -= 15;
            vasos--;
            System.out.println("Aquí está su café americano.");
        } else {
            System.out.println("Ingredientes Insuficientes");
        }
    }

    public void expreso() {
        if (puedePrepararCafe(120, 20, 0)) {
            agua -= 120;
            cafe -= 20;
            vasos--;
            System.out.println("Aquí está su café expreso.");
        } else {
            System.out.println("Ingredientes Insuficientes");
        }
    }

    public void capuchino() {
        if (puedePrepararCafe(100, 14, 70)) {
            agua -= 100;
            cafe -= 14;
            crema -= 70;
            vasos--;
            System.out.println("Aquí está su capuchino.");
        } else {
            System.out.println("Ingredientes Insuficientes");
        }
    }
}
