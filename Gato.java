public class Gato extends Natureza {
    public Gato(String animais, int QtdPatas) {
        super(animais, QtdPatas);
    }

    public void info(){
        super.info();
        System.out.printf("Nome: \n", this.animais);
        System.out.printf("Quantidade de patas: \n", this.QtdPatas);
    }

}
