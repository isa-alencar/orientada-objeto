public class Aritmetica {
     private String nome;

    //Metodos
    public static int mdc(int x, int y) {
      if(x<0 || y<0){
         throw new RuntimeException("Devem ser não negativos.");
      }        
        int temp = x % y;
        int mdc;

        if (temp == 0){
            mdc = y;
        }
        else{
            mdc = mdc(y,temp);
        }

        return mdc;
    }
}
