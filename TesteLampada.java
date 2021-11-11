public class TesteLampada {
    

    public static void main (String[]args){
        Lampada  l = new Lampada();

        l.ligar();

        if(l.isSituacaolampada()){
            System.out.println("lampada ligada !");
        }
        else{
            System.out.println("Lampada desligada!");
        }
    }
}
