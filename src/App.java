import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        String[] array1 = {"maçã", "banana", "laranja", "uva", "abacaxi"};
        String[] array2 = {"pêra", "banana", "abacaxi", "manga", "uva"};
  
        // como parâmetros nos dois loops for temos a sintaxe "variável : array" que denota que a variável em questão
        // vai assumir o valor de cada elemento do array a cada interação do for
        for (String fruta1 : array1) {
           for (String fruta2 : array2) {
              if (fruta1.equals(fruta2)) {
                 System.out.println("Item em comum: " + fruta1);
              }
           }
        }
        
    }
}
