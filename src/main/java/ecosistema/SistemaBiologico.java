package ecosistema;

import java.util.*;

public class SistemaBiologico {

	private String name;
	private Vector<Biotopo> losBiotopos = new Vector<Biotopo>();
	private Vector<Biosenosis> lasBiosenosis = new Vector<Biosenosis>();

	public SistemaBiologico(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vector<Biotopo> getLosBiotopos() {
		return losBiotopos;
	}

	public void setLosBiotopos(Vector<Biotopo> losBiotopos) {
		this.losBiotopos = losBiotopos;
	}

	public Vector<Biosenosis> getLasBiosenosis() {
		return lasBiosenosis;
	}

	public void setLasBiosenosis(Vector<Biosenosis> lasBiosenosis) {
		this.lasBiosenosis = lasBiosenosis;
	}

	@Override
	public String toString() {
		return "SistemaBiologico{" +
				"name='" + name + '\'' +
				", losBiotopos=" + losBiotopos +
				", lasBiosenosis=" + lasBiosenosis +
				"}\n";
	}
}