import java.util.Scanner;

class Main {
   public static void main(String[] args) {
  Scanner o = new Scanner(System.in);
        System.out.println("Podaj wysokosc kwadratu");
        int height = o.nextInt();
  
  
        for (int i = 0; i< height; i++)
        {
            for (int j = 0; j< height; j++){
              if(i==0 || i== height-1 || j==0 ||j == height-1){ 
              System.out.print("*");
              } else {
            System.out.print(" ");
        }
            }
          System.out.println(" ");
        }
      
   }
}