/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forloops;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* FOR LOOP
        Execute code a CERTAIN amount of times
        'i' serves as a 'counter'
        1st part: initialise counter(initialsisation).
        2nd part: set limit(condition)
        3rd part: (update)
*/
        /*
        for(int i=10; i>0; i--){//'i++' to increment
            System.out.println(i);//'i--' to decrement
            
        }
        */
        
        /*
        for(int i=0; i<10; i+=2){//in this method we can icrement by
            System.out.println(i);//any numner of chaoice eg 'i+=3'
            //to icrement by 3

        }
*/
        
        /*
        //Personal Example below
        Scanner scanner = new Scanner(System.in);
        int reps;
        String word;
        
        
        System.out.print("Enter word of choice: ");
        word= scanner.nextLine();
        System.out.print("Enter reps: ");
        reps= scanner.nextInt();
        
        for(int i=0; i<=reps; i++){
            System.out.printf("Your word is %s\n", word);
        }
        */
        
        
        //Provided example
        int start= 10;
        
        for(int i= start; i>0;i--){
            System.out.println(i);   
        }
        System.out.printf("Happy new year!!!");
    }
    
}
