package crud;

public class Alumno {

	DataAlumno da = new DataAlumno();

	int Id;

	String Curp;

	String Numcontrol;

	String Nombre;

	String Apellidopaterno;

	String ApellidoMaterno;

	String Municipio;

	String Carrera;

	String Grupo;

	public DataAlumno getDa() {

		return da;

	}

	public void setDa(DataAlumno da) {

		this.da = da;

	}

	public boolean eliminarAlumno() {

		if (da.eliminarAlumno(this.getId())) {

			return true;

		} else {

			return false;

		}

	}

	public int getId() {

		return Id;

	}

	public void setId(int id) {

		Id = id;

	}

	public String getCurp() {

		return Curp;

	}

	public void setCurp(String curp) {

		Curp = curp;

	}

	public String getNumcontrol() {

		return Numcontrol;

	}

	public void setNumcontrol(String numcontrol) {

		Numcontrol = numcontrol;

	}

	public String getNombre() {

		return Nombre;

	}

	public void setNombre(String nombre) {

		Nombre = nombre;

	}

	public String getApellidopaterno() {

		return Apellidopaterno;

	}

	public void setApellidopaterno(String apellidopaterno) {

		Apellidopaterno = apellidopaterno;

	}

	public String getApellidoMaterno() {

		return ApellidoMaterno;

	}

	public void setApellidoMaterno(String apellidoMaterno) {

		ApellidoMaterno = apellidoMaterno;

	}

	public String getMunicipio() {

		return Municipio;

	}

	public void setMunicipio(String municipio) {

		Municipio = municipio;

	}

	public String getCarrera() {

		return Carrera;

	}

	public void setCarrera(String carrera) {

		Carrera = carrera;

	}

	public String getGrupo() {

		return Grupo;

	}

	public void setGrupo(String grupo) {

		Grupo = grupo;

	}

	public boolean insertarAlumno() {

		if (da.insertarAlumno(this)) {

			return true;

		} else {

			return false;

		}

	}

	public boolean cargarAlumno() {

		if (da.CargarAlumno(this)) {

			return true;

		} else {

			return false;

		}

	}

	public boolean actualizarAlumno() {

		DataAlumno da = new DataAlumno();

		return da.actualizarAlumno(this);

	}

}