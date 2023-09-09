/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.texteditor;

/**
 *
 * @author User
 */
public class Tools {
// Word Count Method
    static int on = 1;
    static int off = 0;
    public static int wordCount(String str)
    {
        int status = on;
        int word = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t')
            {
            status = on;
            }
            else if (status == on)
            {
            status = off;
            word++;
            }
        }
        return word;
    }
    //Character Count Method
    public static int characterCount(String str)
    {
        int chr = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t')
            {
            }
            else
            {
                chr++;
            }
        }
        return chr;
    }
}

