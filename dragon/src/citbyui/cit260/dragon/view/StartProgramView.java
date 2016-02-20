/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.dragon.view;

/**
 *
 * @author Karina
 */
public class StartProgramView {
    private String promptMessage;
    
    public StartProgramView() {
    // promptMessage = "Please enter your name"
    this.promptMessage = "\nPlease enter your name: ";  
    this.displayBanner();
    }    

    private void displayBanner() {
       System.out.println(
       "\n*****************************************************"
     + "\n*                                                   *"
     + "\n* This game about a dragon that was lost by his mom.*"
     + "\n* She was flying with the egg to another island and *"
     + "\n* accidentally dropped it. She was so sad and       *"
     + "\n* thought that egg was broken and her baby died.    *"
     + "\n* She of course spend some time to find it, but it  *"
     + "\n* was in vain. Mother-dragon left to the new island *"
     + "\n* alone, the whole way she was crying. But this     *"
     + "\n* little egg was so lucky. He fell in the water and *"
     + "\n* didn't broke. Anyways, now his adventures just    *"
     + "\n* started. So, you have to help this little dragon  *"
     + "\n* to grow up properly and be able fly away to find  *"
     + "\n* his mom. You need to feed him right food in right *"
     + "\n* amount, train him to certain level, wash him,     *"
     + "\n* teach him, play with him, heal him if he getting  *"
     + "\n* sick. He really need you! Remember, he lost his   *"
     + "\n* own mom and now someone need to take care about   *"
     + "\n* him. This little dragon was so lucky to find you! *"
     + "\n* So, try to do your best and help him!             *"
     + "\n* You can do it!                                    *"
     + "\n*                                                   *"
     + "\n*****************************************************"          
       );
    }
    
}
