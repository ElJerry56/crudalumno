package crud;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

import javax.swing.JTextField;

import javax.swing.JButton;

import java.awt.event.KeyAdapter;

import java.awt.event.KeyEvent;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

public class PantallaAlumno extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	private JTextField txtId;

	private JTextField txtCurp;

	private JTextField txtNumcontrol;

	private JTextField txtNombre;

	private JTextField txtApellidoPaterno;

	private JTextField txtApellidoMaterno;

	private JTextField txtMunicipio;

	private JTextField txtCarrera;

	private JTextField txtGrupo;

	public JButton btnInsertar;

	public JButton btnCargar;

	public JButton btnEliminar;

	public JButton btnActualizar;

	/**
	 * 
	 * Launch the application.
	 * 
	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					PantallaAlumno frame = new PantallaAlumno();

					frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	}

	/**
	 * 
	 * Create the frame.
	 * 
	 */

	public PantallaAlumno() {

		setTitle("CRUD ALUMNO BY RENE");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 517, 410);

		contentPane = new JPanel();

		contentPane.setForeground(Color.WHITE);

		contentPane.setToolTipText("Id");

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		contentPane.setLayout(null);

		JLabel lblId = new JLabel("Id");

		lblId.setBounds(10, 19, 63, 19);

		contentPane.add(lblId);

		JLabel lblCurp = new JLabel("Curp");

		lblCurp.setBounds(10, 49, 46, 19);

		contentPane.add(lblCurp);

		JLabel lblNumcontrol = new JLabel("Numero de control");

		lblNumcontrol.setBounds(10, 79, 96, 26);

		contentPane.add(lblNumcontrol);

		JLabel lblNombre = new JLabel("Nombre");

		lblNombre.setBounds(10, 116, 63, 26);

		contentPane.add(lblNombre);

		JLabel lblApellidopaterno = new JLabel("Apellido Paterno");

		lblApellidopaterno.setBounds(10, 153, 96, 14);

		contentPane.add(lblApellidopaterno);

		JLabel lblApellidomaterno = new JLabel("Apellido Materno");

		lblApellidomaterno.setBounds(10, 181, 112, 14);

		contentPane.add(lblApellidomaterno);

		JLabel lblMunicipio = new JLabel("Municipio");

		lblMunicipio.setBounds(10, 224, 83, 14);

		contentPane.add(lblMunicipio);

		JLabel lblCarrera = new JLabel("Carrera");

		lblCarrera.setBounds(10, 260, 46, 14);

		contentPane.add(lblCarrera);

		JLabel lblGrupo = new JLabel("Grupo");

		lblGrupo.setBounds(10, 285, 63, 26);

		contentPane.add(lblGrupo);

		txtId = new JTextField();

		txtId.addKeyListener(new KeyAdapter() {

			@Override

			public void keyTyped(KeyEvent e) {

				if (txtId.getText().length() >= 5) {

					e.consume();

				}

			}

		});

		txtId.setBounds(172, 18, 86, 20);

		contentPane.add(txtId);

		txtId.setColumns(10);

		txtCurp = new JTextField();

		txtCurp.addKeyListener(new KeyAdapter() {

			@Override

			public void keyTyped(KeyEvent e) {

				if (txtCurp.getText().length() >= 18) {

					e.consume();

				}

			}

		});

		txtCurp.setColumns(10);

		txtCurp.setBounds(172, 48, 86, 20);

		contentPane.add(txtCurp);

		txtNumcontrol = new JTextField();

		txtNumcontrol.addKeyListener(new KeyAdapter() {

			@Override

			public void keyTyped(KeyEvent e) {

				if (txtNumcontrol.getText().length() >= 14) {

					e.consume();

				}

			}

		});

		txtNumcontrol.setColumns(10);

		txtNumcontrol.setBounds(172, 82, 86, 20);

		contentPane.add(txtNumcontrol);

		txtNombre = new JTextField();

		txtNombre.addKeyListener(new KeyAdapter() {

			@Override

			public void keyTyped(KeyEvent e) {

				if (txtNombre.getText().length() >= 50) {

					e.consume();

				}

			}

		});

		txtNombre.setColumns(10);

		txtNombre.setBounds(172, 119, 86, 20);

		contentPane.add(txtNombre);

		txtApellidoPaterno = new JTextField();

		txtApellidoPaterno.addKeyListener(new KeyAdapter() {

			@Override

			public void keyTyped(KeyEvent e) {

				if (txtApellidoPaterno.getText().length() >= 50) {

					e.consume();

				}

			}

		});

		txtApellidoPaterno.setColumns(10);

		txtApellidoPaterno.setBounds(172, 150, 86, 20);

		contentPane.add(txtApellidoPaterno);

		txtApellidoMaterno = new JTextField();

		txtApellidoMaterno.addKeyListener(new KeyAdapter() {

			@Override

			public void keyTyped(KeyEvent e) {

				if (txtApellidoMaterno.getText().length() >= 50) {

					e.consume();

				}

			}

		});

		txtApellidoMaterno.setColumns(10);

		txtApellidoMaterno.setBounds(172, 178, 86, 20);

		contentPane.add(txtApellidoMaterno);

		txtMunicipio = new JTextField();

		txtMunicipio.addKeyListener(new KeyAdapter() {

			@Override

			public void keyTyped(KeyEvent e) {

				if (txtMunicipio.getText().length() >= 40) {

					e.consume();

				}

			}

		});

		txtMunicipio.setColumns(10);

		txtMunicipio.setBounds(172, 221, 86, 20);

		contentPane.add(txtMunicipio);

		txtCarrera = new JTextField();

		txtCarrera.addKeyListener(new KeyAdapter() {

			@Override

			public void keyTyped(KeyEvent e) {

				if (txtCarrera.getText().length() >= 50) {

					e.consume();

				}

			}

		});

		txtCarrera.setColumns(10);

		txtCarrera.setBounds(172, 257, 86, 20);

		contentPane.add(txtCarrera);

		txtGrupo = new JTextField();

		txtGrupo.addKeyListener(new KeyAdapter() {

			@Override

			public void keyTyped(KeyEvent e) {

				if (txtGrupo.getText().length() >= 3) {

					e.consume();

				}

			}

		});

		txtGrupo.setColumns(10);

		txtGrupo.setBounds(172, 288, 86, 20);

		contentPane.add(txtGrupo);

		JButton btnInsertar = new JButton("Insertar");

		btnInsertar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {

					Alumno a = new Alumno();

					a.setId(Integer.parseInt(txtId.getText()));

					a.setCurp(txtCurp.getText());

					a.setNumcontrol(txtNumcontrol.getText());

					a.setNombre(txtNombre.getText());

					a.setApellidopaterno(txtApellidoPaterno.getText());

					a.setApellidoMaterno(txtApellidoMaterno.getText());

					a.setGrupo(txtGrupo.getText());

					a.setCarrera(txtCarrera.getText());

					a.setMunicipio(txtMunicipio.getText());

					if (a.insertarAlumno()) {

						JOptionPane.showInternalMessageDialog(null, "Alumno agregado");

						limpiar();

					} else {

						JOptionPane.showInternalMessageDialog(null, "ERROR");

					}

				} catch (Exception e2) {

					e2.printStackTrace();

					JOptionPane.showInternalMessageDialog(null, "ERROR");

				}

			}

		});

		btnInsertar.setBounds(31, 337, 91, 23);

		contentPane.add(btnInsertar);

		JButton btnCargar = new JButton("Cargar");

		btnCargar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {

					int IdAlumno = Integer.parseInt(JOptionPane.showInputDialog("Id a Cargar"));

					Alumno a = new Alumno();

					a.setId(IdAlumno);

					if (a.cargarAlumno()) {

						txtId.setText("" + a.getId());

						txtCurp.setText(a.getCurp());

						txtNumcontrol.setText(a.getNumcontrol());

						txtNombre.setText(a.getNombre());

						txtApellidoPaterno.setText(a.getApellidopaterno());

						txtApellidoMaterno.setText(a.getApellidoMaterno());

						txtMunicipio.setText(a.getMunicipio());

						txtCarrera.setText(a.getCarrera());

						txtGrupo.setText(a.getGrupo());

						JOptionPane.showMessageDialog(null, "Alumno cargado corectamente");

					} else {
						JOptionPane.showMessageDialog(null, "ERROR");

					}

				} catch (Exception e2) {

					JOptionPane.showMessageDialog(null, "ERROR");

				}

			}

		}

		);

		btnCargar.setBounds(157, 337, 91, 23);
		contentPane.add(btnCargar);
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					int IdAlumno = Integer.parseInt(JOptionPane.showInputDialog("ID a eliminar"));
					Alumno a = new Alumno();
					a.setId(IdAlumno);
					
					if (a.eliminarAlumno()) {
						JOptionPane.showMessageDialog(null, "Alumno eliminado correctamente");

					} else {
						JOptionPane.showMessageDialog(null, "ERROR");
					}

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");

				}
			}

		});

		btnEliminar.setBounds(279, 337, 91, 23);
		contentPane.add(btnEliminar);
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					Alumno a = new Alumno();
					a.setId(Integer.parseInt(txtId.getText()));
					a.setCurp(txtCurp.getText());
					a.setNumcontrol(txtNumcontrol.getText());
					a.setNombre(txtNombre.getText());
					a.setApellidopaterno(txtApellidoPaterno.getText());
					a.setApellidoMaterno(txtApellidoMaterno.getText());
					a.setGrupo(txtGrupo.getText());
					a.setCarrera(txtCarrera.getText());
					a.setMunicipio(txtMunicipio.getText());
					
					if (a.actualizarAlumno()) {
						JOptionPane.showMessageDialog(null, "Alumno actualizado correctamente");
						limpiar();

					} else {
						JOptionPane.showMessageDialog(null, "ERROR: El ID del alumno no existe");

					}

				} catch (Exception e2) {
			
					JOptionPane.showMessageDialog(null, "ERROR");

				}

			}

		});

		btnActualizar.setBounds(400, 337, 91, 23);
		contentPane.add(btnActualizar);
	}

	public void limpiar() {
		txtId.setText("");
		txtCurp.setText("");
		txtNumcontrol.setText("");
		txtNombre.setText("");
		txtApellidoPaterno.setText("");
		txtApellidoMaterno.setText("");
		txtMunicipio.setText("");
		txtCarrera.setText("");
		txtGrupo.setText("");

	}

}