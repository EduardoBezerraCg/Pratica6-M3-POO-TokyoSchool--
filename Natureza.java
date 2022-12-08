public class Natureza {
    public static String animais = "Gato";
    public static int QtdPatas = 4;
    public static String bacterias;

    public Natureza(String animais, int QtdPatas){
        this.animais = animais;
        this.QtdPatas = QtdPatas;
    }

    public void info(){
        System.out.printf("Nome: \n", this.animais);
        System.out.printf("Quantidade de patas: \n", this.QtdPatas);
    }

}
