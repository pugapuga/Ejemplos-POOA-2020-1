package ecosistema;

import ecosistema.biosenosis.SerVivo;

import java.util.Vector;

public class Biosenosis {

	private String name;
	private SistemaBiologico elSistemaBiologico;
	private Biotopo elBiotopo;
	private Vector<SerVivo> losSeresVivos = new Vector<SerVivo>();

	public Biosenosis(String name) {
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

	public Biotopo getElBiotopo() {
		return elBiotopo;
	}

	public void setElBiotopo(Biotopo elBiotopo) {
		this.elBiotopo = elBiotopo;
	}

	public Vector<SerVivo> getLosSeresVivos() {
		return losSeresVivos;
	}

	public void setLosSeresVivos(Vector<SerVivo> losSeresVivos) {
		this.losSeresVivos = losSeresVivos;
	}

	@Override
	public String toString() {
		return "Biosenosis{" +
				"name='" + name + '\'' +
				", losSeresVivos=" + losSeresVivos +
				'}';
	}
}