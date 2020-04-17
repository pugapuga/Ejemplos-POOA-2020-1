package ecosistema.biosenosis;

import ecosistema.*;

public class SerVivo {
	private String name;
	private Biosenosis laBiosenosis;

	public SerVivo(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Biosenosis getLaBiosenosis() {
		return laBiosenosis;
	}

	public void setLaBiosenosis(Biosenosis laBiosenosis) {
		this.laBiosenosis = laBiosenosis;
	}

	@Override
	public String toString() {
		return "SerVivo{" +
				"name='" + name + '\'' +
				'}';
	}
}