public class Deposito {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;
    public Deposito() {
        this.agua = 5000;
        this.cafe = 1000;
        this.crema = 1500;
        this.vasos = 50;
    }

    public Deposito(int agua, int cafe, int crema, int vasos) {
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

    @Override
    public String toString() {
        return "Deposito{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                '}';
    }
    //hacer cafecito
    public void americano() {
        if (agua >= 180 && cafe >= 15 && vasos > 0) {
            agua -= 180;
            cafe -= 15;
            vasos--;//quitamos uno
            System.out.println("Completado, disfrute\n");
        } else {
            System.out.println("Ingredientes Insuficientes");
        }
    }

    public void expreso() {
        if (agua >= 120 && cafe >= 20 && vasos > 0) {
            agua -= 120;
            cafe -= 20;
            vasos--;
            System.out.println("Completado, disfrute\n");
        } else {
            System.out.println("Ingredientes Insuficientes");
        }
    }

    public void capuchino() {
        if (agua >= 100 && cafe >= 14 && crema >= 70 && vasos > 0) {
            agua -= 100;
            cafe -= 14;
            crema -= 70;
            vasos--;
            System.out.println("Completado, disfrute\n");
        } else {
            System.out.println("Ingredientes Insuficientes");
        }
    }
    //estado de deposito
    public void estado() {
        System.out.println("Estado Deposito: ");
        System.out.println("Agua: " + agua + " ml");
        System.out.println("Café: " + cafe + " g");
        System.out.println("Crema: " + crema + " ml");
        System.out.println("Vasos disponibles: " + vasos);
    }
}