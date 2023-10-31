import java.util.Arrays;

public class IndianTeam {
	private int tno;
	private String tname;
	private IndianPlayers captain;
	private IndianPlayers[]plist;
	public IndianTeam() {
		System.out.println("In Default Constructor");
		}

	public IndianTeam(int tno, String tname, IndianPlayers captain, IndianPlayers[] plist) {
		super();
		this.tno = tno;
		this.tname = tname;
		this.captain = captain;
		this.plist = plist;
	}

	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public IndianPlayers getCaptain() {
		return captain;
	}
	public void setCaptain(IndianPlayers captain) {
		this.captain = captain;
	}
	public IndianPlayers[] getPlist() {
		return plist;
	}
	public void setPlist(IndianPlayers[] plist) {
		this.plist = plist;
	}
	@Override
	public String toString() {
		return "IndianTeam [tno=" + tno + ", tname=" + tname + ", captain=" + captain + ", plist="
				+ Arrays.toString(plist) + "]";
	}
	
	
	

}
