package tk.socialstu.objects;

import java.util.List;

public class Desktop extends Computer{
	private final String formFoctor;
	public Desktop(String model, List<Storage> storage , String formFactor) {
		super(model, storage);
		this.formFoctor = formFactor;
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((formFoctor == null) ? 0 : formFoctor.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Desktop other = (Desktop) obj;
		if (formFoctor == null) {
			if (other.formFoctor != null)
				return false;
		} else if (!formFoctor.equals(other.formFoctor))
			return false;
		return true;
	}
	public String getFormFoctor() {
		return formFoctor;
	}

}
