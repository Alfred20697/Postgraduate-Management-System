/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jets;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author alfre
 */
public class Jets {
    public static String UserID = "";
    public static String UserType = "";
    public static String UserName = "";
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
         
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserLogin().setVisible(true);
            }
        });
    }
    
}
