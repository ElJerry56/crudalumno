package crud;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

public class DataAlumno {

	Connection cx;

	public Connection conectar() {

		try {

			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumno", "root", "");

			System.out.println("Conexion exitosa");

		} catch (SQLException e) {

			e.printStackTrace();

			System.out.println("ERRROR de conexion");

		}

		return cx;

	}

	public static void main(String[] args) {

		DataAlumno da = new DataAlumno();

		da.conectar();

	}

	public boolean insertarAlumno(Alumno a) {

		PreparedStatement ps = null;

		try {

			ps = conectar().prepareStatement("INSERT INTO basealumno VALUES (?,?,?,?,?,?,?,?,?)");

			ps.setInt(1, a.getId());

			ps.setString(2, a.getCurp());

			ps.setString(3, a.getNumcontrol());

			ps.setString(4, a.getNombre());

			ps.setString(5, a.getApellidopaterno());

			ps.setString(6, a.getApellidoMaterno());

			ps.setString(7, a.getMunicipio());

			ps.setString(8, a.getCarrera());

			ps.setString(9, a.getGrupo());

			ps.executeUpdate();

			return true;

		} catch (Exception e) {

			return false;

		}

	}

	public boolean CargarAlumno(Alumno a) {

		PreparedStatement ps = null;

		ResultSet rs = null;

		try {

			ps = conectar().prepareStatement("SELECT * from basealumno WHERE id=?");

			ps.setInt(1, a.getId());

			rs = ps.executeQuery();

			if (rs.next()) {

				a.setCurp(rs.getString(2));

				a.setNumcontrol(rs.getString(3));

				a.setNombre(rs.getString(4));

				a.setApellidopaterno(rs.getString(5));

				a.setApellidoMaterno(rs.getString(6));

				a.setMunicipio(rs.getString(7));

				a.setCarrera(rs.getString(8));

				a.setGrupo(rs.getString(9));

				return true;

			} else {

				return false;

			}

		} catch (Exception e) {

			return false;

		}

	}

	public boolean eliminarAlumno(int IdAlumno) {

		PreparedStatement ps = null;

		try {

			Alumno a = new Alumno();

			a.setId(IdAlumno);

			if (a.cargarAlumno()) {

				ps = conectar().prepareStatement("DELETE FROM basealumno WHERE Id=?");

				ps.setInt(1, IdAlumno);

				ps.executeUpdate();

				return true;

			} else {

				return false;

			}

		} catch (Exception e2) {

			return false;

		}

	}

	public boolean actualizarAlumno(Alumno a) {

		PreparedStatement ps = null;

		try {

			ps = conectar().prepareStatement(
					"UPDATE basealumno SET curp=?, numcontrol=?, nombre=?, apellidopaterno=?, apellidomaterno=?, municipio=?, carrera=?, grupo=? WHERE Id=?");

			ps.setString(1, a.getCurp());

			ps.setString(2, a.getNumcontrol());

			ps.setString(3, a.getNombre());

			ps.setString(4, a.getApellidopaterno());

			ps.setString(5, a.getApellidoMaterno());

			ps.setString(6, a.getMunicipio());

			ps.setString(7, a.getCarrera());

			ps.setString(8, a.getGrupo());

			ps.setInt(9, a.getId());

			int rowsAffected = ps.executeUpdate();

			if (rowsAffected == 0) {

				return false;

			}

			return true;

		} catch (Exception e) {



			return false;

		}

	}

}
