import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Nkomode_MenuBar extends JMenuBar
{

  private JDesktopPane desktop;
  
  //buddies menu and submenu
  private JMenu buddiesMenu;
  private JMenuItem quitMenuItem;

  public Nkomode_MenuBar(JDesktopPane desk)
  {
    desktop = desk;

    buddiesMenu = new JMenu(" Buddies ");
    buddiesMenu.setMnemonic(KeyEvent.VK_B);

    quitMenuItem = new JMenuItem("  Quit  ");
    quitMenuItem.setMnemonic(KeyEvent.VK_Q);
    quitMenuItem.setActionCommand("exit");
    quitMenuItem.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ev)
      {
	if("exit".equals(ev.getActionCommand()))
	  quit();
      }
    });
    buddiesMenu.add(quitMenuItem);

    add(buddiesMenu);
  }

  public void quit()
  {
    System.exit(0);
  }
}
