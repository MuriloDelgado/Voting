import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VoteCounterPanel extends JPanel
{
   // Declaring variables
    private int countJoe, countSam;
    private JButton voteJoe, voteSam;
    private JLabel joe, sam;
    
    public VoteCounterPanel()
    {
        // Setting initial count values
        countJoe = 0;
        countSam = 0;
        
        // Setting up buttons
        voteJoe = new JButton("Vote for Joe");
        voteJoe.addActionListener(new ButtonListener());
        voteSam = new JButton("Vote for Sam");
        voteSam.addActionListener(new ButtonListener());
        
        // Setting up labels
        joe = new JLabel("Votes for Joe: " + countJoe);
        sam = new JLabel("Votes for Sam: " + countSam);
        
        // Adding components to frame
        add(voteJoe);
        add(joe);
        add(voteSam);
        add(sam);      
        
        setPreferredSize(new Dimension(300, 40));
    }
    
    private class ButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource()==voteJoe)
            {
                countJoe++;
                joe.setText("Votes for Joe: " + countJoe);
            }
            
            if(event.getSource()==voteSam)
            {
                countSam++;
                sam.setText("Votes for Sam: " + countSam);
            }
        }
    }
}