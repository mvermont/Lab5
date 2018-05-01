package pkgCore;

import pkgEnum.eAction;
import pkgEnum.eGameType;
import java.io.Serializable;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement
public class Action implements Serializable {

	@XmlElement
	private eAction eAction;

	@XmlElement
	private Player ActPlayer;
	
	@XmlElement
	private eGameType eGameType;
	
	public Action()
	{
		
	}
	public Action(eAction eAction, Player player, eGameType eGameType) {
		super();
		this.eAction = eAction;
		this.ActPlayer = player;
		this.eGameType = eGameType;
	}
	public eAction geteAction() {
		return eAction;
	}
	public void seteAction(eAction eAction) {
		this.eAction = eAction;
	}
	public Player getActPlayer() {
		return ActPlayer;
	}
	public void setActPlayer(Player actPlayer) {
		ActPlayer = actPlayer;
	}
	public eGameType geteGameType() {
		return eGameType;
	}


	

	
}