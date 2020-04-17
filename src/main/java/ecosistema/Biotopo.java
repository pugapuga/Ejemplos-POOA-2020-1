package ecosistema;

public class Biotopo {

	private String name;
	private SistemaBiologico elSistemaBiologico;
	private Biosenosis laBiosenosis;

	public Biotopo(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SistemaBiologico getElSistemaBiologico() {
		return elSistemaBiologico;
	}

	public void setElSistemaBiologico(SistemaBiologico elSistemaBiologico) {
		this.elSistemaBiologico = elSistemaBiologico;
	}

	public Biosenosis getLaBiosenosis() {
		return laBiosenosis;
	}

	public void setLaBiosenosis(Biosenosis laBiosenosis) {
		this.laBiosenosis = laBiosenosis;
	}

	@Override
	public String toString() {
		return "Biotopo{" +
				"name='" + name + '\'' +
				'}';
	}
}