import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.*;

public class Nkomode_Main extends JFrame
{
  private JDesktopPane desktop;
  private int inset;

  public Nkomode_Main()
  {
    inset = 50;
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    setBounds(inset, inset, screenSize.width - inset*2, screenSize.height-inset*2);

    //create GUI
    desktop = new JDesktopPane();
    desktop.setBackground(new Color(88, 87, 104));

    getContentPane().add(desktop);

    setJMenuBar(new Nkomode_MenuBar(desktop));

    desktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
  }

  private static void guiDisplay()
  {
    //make sure we have a nice look and free
    JFrame.setDefaultLookAndFeelDecorated(true);

    //create and set up the window
    Nkomode_Main frame = new Nkomode_Main();
    frame.setTitle("Nkomode");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.add(new JToolBar(), BorderLayout.PAGE_START);

    //display the window
    frame.setVisible(true);
    frame.setSize(290, 420);
  }
  
  public static void main(String args[])
  {
    javax.swing.SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {
	guiDisplay();
      }
    });
  }
}
