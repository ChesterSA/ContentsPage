/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contentspage;

import java.util.Scanner;

/**
 *
 * @author s6089488
 */
public class ContentsPage
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Page Width: ");
        int pageWidth = userInput.nextInt();
        
        System.out.print("Chapter Title: ");
        String title = userInput.next();
        
        System.out.print("Page Number: ");
        int number = userInput.nextInt();
        
        int pageNumberLength = (int)(Math.log10(number) + 1);
        int numberOfSpaces = pageWidth - title.length() - pageNumberLength;
        String dots = new String(new char[numberOfSpaces]).replace('\0', ' ');
        String fullString = title + dots + number;
        
        
        System.out.println(fullString);
        
        //String fullString = title + String.format("%"+numberOfSpaces+"s", "") + number;
        //System.out.println(title + String.format("%"+(pageWidth - title.length() - (int)(Math.log10(number) + 1))+"s", "") + number);
    }
    
}
