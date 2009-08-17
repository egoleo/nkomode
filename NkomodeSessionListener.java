import java.awt.Toolkit;

import javax.swing.JTextArea;

import ymsg.network.LoginRefusedException;
import ymsg.network.event.SessionChatEvent;
import ymsg.network.event.SessionConferenceEvent;
import ymsg.network.event.SessionErrorEvent;
import ymsg.network.event.SessionEvent;
import ymsg.network.event.SessionExceptionEvent;
import ymsg.network.event.SessionFileTransferEvent;
import ymsg.network.event.SessionFriendEvent;
import ymsg.network.event.SessionListener;
import ymsg.network.event.SessionNewMailEvent;
import ymsg.network.event.SessionNotifyEvent;

public class NkomodeSessionListener implements SessionListener 
{
	private Nkomode yahooClient;

	public NkomodeSessionListener()
	{
		//this.yahooClient = yahooClientIncoming;
	}
	
	public void buzzReceived(SessionEvent ev)
	{		 
		Toolkit.getDefaultToolkit().beep();
		//yahooClient.updateMessagingPanel("BUZZ!!!\n");
		

	}
	public void chatConnectionClosed(SessionEvent ev)
	{
	}
	public void chatLogoffReceived(SessionChatEvent ev) 
	{
	}
	public void chatLogonReceived(SessionChatEvent ev) 
	{
	}
	public void chatMessageReceived(SessionChatEvent ev)
	{ 
	}
	public void chatUserUpdateReceived(SessionChatEvent ev)
	{	 
	}
	public void conferenceInviteReceived(SessionConferenceEvent ev) 
	{
		
	}
	public void conferenceLogoffReceived(SessionConferenceEvent ev) 
	{
	}
	public void conferenceLogonReceived(SessionConferenceEvent ev)
	{
		 
	}
	public void conferenceMessageReceived(SessionConferenceEvent ev) 
	{
	}
	public void connectionClosed(SessionEvent ev) 
	{
	    System.out.println("Connection Closed");
	    //yahooClient.handleConnectionClosed();
	}
	public void contactRejectionReceived(SessionEvent ev) 
	{
	}
	public void contactRequestReceived(SessionEvent ev)
	{
	}
	public void errorMessageReceived(SessionErrorEvent ev) 
	{
		System.out.println("Error Message Received");
	}
	public void fileTransferReceived(SessionFileTransferEvent ev) 
	{
	}
	public void friendAddedReceived(SessionFriendEvent ev) 
	{
	}
	public void friendRemovedReceived(SessionFriendEvent ev) 
	{
	}
	public void friendsUpdateReceived(SessionFriendEvent ev)
	{
	}
	public void inputExceptionThrown(SessionExceptionEvent ev)
	{
		System.out.println("Input Exception Thrown");
	} 
	public void listReceived(SessionEvent ev) 
	{
	}
	public void messageReceived(SessionEvent ev)
	{
		Toolkit.getDefaultToolkit().beep();
		//yahooClient.updateMessagingPanel(ev.getFrom() + ": " + ev.getMessage()+'\n');
		
	}
	public void newMailReceived(SessionNewMailEvent ev) 
	{
	}
	public void notifyReceived(SessionNotifyEvent ev)
	{
	}
	public void offlineMessageReceived(SessionEvent ev)
	{
		 
	}
	public void errorPacketReceived(SessionErrorEvent sev)
	{
		System.out.println("Error Packet Received");
	}
	public void  chatCaptchaReceived(ymsg.network.event.SessionChatEvent e){
	}
	public void  conferenceInviteDeclinedReceived(ymsg.network.event.SessionConferenceEvent e){
	}
	

}
