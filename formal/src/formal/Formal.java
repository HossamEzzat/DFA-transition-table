/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formal;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Formal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     //   System.out.println("Please enter the number of states: ");
        String numberOfState = JOptionPane.showInputDialog("Please enter the number of states: ");
        int nums=Integer.parseInt(numberOfState);
        
       // System.out.println("Please enter the number of varibles: ");
        String numberOfVariables = JOptionPane.showInputDialog("Please enter the number of varibles: ");
        int numv=Integer.parseInt(numberOfVariables);
      //  System.out.println("please enter the final state: ");
        String finalState = JOptionPane.showInputDialog("please enter the final state: ");

        //نبدا في انشاء الجدول بتاعنا
        String Table[][] = new String[nums+1][numv+1];

    //    System.out.println("please enter the transition table");
    JOptionPane.showMessageDialog(null,"please enter the transition table" );
        for (int i = 0; i <= nums; i++) {
           // System.out.println("Row: " + i);
           JOptionPane.showMessageDialog(null,"row"+i);
            for (int j = 0; j <= numv; j++) {
               // System.out.println("Col: " + j);
               JOptionPane.showMessageDialog(null,"column"+j);
                Table[i][j] = JOptionPane.showInputDialog(i,j);
            }
        }
       // System.out.println("please enter string");
        String checkInput = JOptionPane.showInputDialog("please enter string");

        int flag = 0; // للتاكد ان الجملة مقبولة ولا كرفوضة
        int stringCount = 0;
        char c;  // لتسجيل حرف الجملة
        int state = 1;  //  لتسجيل رقم ال state 
        String currentState = Table[1][0];

        while (stringCount < checkInput.length()) {

            c = checkInput.charAt(stringCount);
            System.out.println("String= " + checkInput.charAt(stringCount));
            int variable = 1;
            while (variable <= numv) {
                if (Table[0][variable].compareTo(Character.toString(c)) == 0) {
                    currentState = Table[state][variable];
                    for (int e = 1; e <= nums; e++) {
                        if (Table[e][0].compareTo(currentState) == 0) 
                            state = e;
                    }
                    break;
                }
                        
                    
                
                variable++;
            }
            if (variable > numv) {
                flag = 1;
                break;
            }

         //   System.out.println("currentstate" + currentState);
         JOptionPane.showMessageDialog(null, "currentstate" + currentState);
            stringCount++;

        }
        if (flag == 0 && currentState.compareTo(finalState) == 0) {
            JOptionPane.showMessageDialog(null, " for (int i = 0; i <= numberOfState; i++) {\\n\" +\n" +
"\"            System.out.println(\\\"Row: \\\" + i);\\n\" +\n" +
"\"            for (int j = 0; j <= numberOfVariables; j++) {\\n\" +\n" +
"\"                System.out.println(\\\"Col: \\\" + j);\\n\" +\n" +
"\"                Table[i][j] = s.next();\\n\" +\n" +
"\"            }\\n\" +\n" +
"\"        }\\n\" +\n" +
"\"        System.out.println(\\\"please enter string\\\");\\n\" +\n" +
"\"        String checkInput = s.next();\\n\" +\n" +
"\"\\n\" +\n" +
"\"        int flag = 0; // للتاكد ان الجملة مقبولة ولا كرفوضة\\n\" +\n" +
"\"        int stringCount = 0;\\n\" +\n" +
"\"        char c;  // لتسجيل حرف الجملة\\n\" +\n" +
"\"        int state = 1;  //  لتسجيل رقم ال state \\n\" +\n" +
"\"        String currentState = Table[1][0];\\n\" +\n" +
"\"\\n\" +\n" +
"\"        while (stringCount < checkInput.length()) {\\n\" +\n" +
"\"\\n\" +\n" +
"\"            c = checkInput.charAt(stringCount);\\n\" +\n" +
"\"            System.out.println(\\\"String= \\\" + checkInput.charAt(stringCount));\\n\" +\n" +
"\"            int variable = 1;\\n\" +\n" +
"\"            while (variable <= numberOfVariables) {\\n\" +\n" +
"\"                if (Table[0][variable].compareTo(Character.toString(c)) == 0) {\\n\" +\n" +
"\"                    currentState = Table[state][variable];\\n\" +\n" +
"\"                    for (int e = 1; e <= numberOfState; e++) {\\n\" +\n" +
"\"                        if (Table[e][0].compareTo(currentState) == 0) \\n\" +\n" +
"\"                            state = e;\\n\" +\n" +
"\"                    }\\n\" +\n" +
"\"                    break;\\n\" +\n" +
"\"                }\\n\" +\n" +
"\"                        \\n\" +\n" +
"\"                    \\n\" +\n" +
"\"                \\n\" +\n" +
"\"                variable++;\\n\" +\n" +
"\"            }");
        } else {
            JOptionPane.showMessageDialog(null, "rejected");
        }

    }

}
