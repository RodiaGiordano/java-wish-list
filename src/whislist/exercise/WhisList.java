package whislist.exercise;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WhisList {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wishList = new ArrayList<>();

        File file = new File("./resources/wishList.txt");
       if(file.exists() && file.length() > 0){

           try( Scanner reader = new Scanner(file)){

                System.out.println("Questa è l'attuale lista:");
                while(reader.hasNext()){

                    wishList.add(reader.nextLine());

                }
               System.out.println(wishList);
           }catch(IOException e){
                   System.out.println(e.getMessage());
           }
       }

        boolean addGift = true;

       try(FileWriter fileWriter = new FileWriter(file, true)) {
           while (addGift) {
               System.out.println("Inserisci il nome del regalo");
               String chosenGift = scanner.nextLine();


               wishList.add(chosenGift);
               fileWriter.write(chosenGift + System.lineSeparator());

               System.out.println("Length: " + wishList.size());

               System.out.println("Vuoi inserire un'altro regalo? si/no");
               String keepAdding = scanner.nextLine();

               if (!keepAdding.equals("si")) {
                   addGift = false;
               }
           }
       }catch(IOException e){
           System.out.println(e.getMessage());
       }
        scanner.close();

        Collections.sort(wishList);

       /* try( FileWriter fileWriter = new FileWriter(file, true)){

            for(String element: wishList){
                fileWriter.write(element + System.lineSeparator());
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        } */


        System.out.println(wishList);

    }
}
