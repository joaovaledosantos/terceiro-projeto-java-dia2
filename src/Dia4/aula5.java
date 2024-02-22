package Dia4;

public class aula5 {
    public static void main(String[] args) {
        boolean temEmprego = true;
        boolean temEmpresa = false;
        boolean tem50k = false;
        boolean podeFinaciar = (temEmprego || temEmpresa) && tem50k;
        System.out.println(podeFinaciar);
    }
}
