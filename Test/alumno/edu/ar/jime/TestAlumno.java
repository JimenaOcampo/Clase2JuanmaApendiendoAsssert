package alumno.edu.ar.jime;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAlumno {

	@Test
	public void queSeGuardeCorrectamenteLaNotaDelParcial(){
		//fail("Not yet implemented");metodo preescrito
		//datos de entrada
		int notaPrimerParcial=7;
		Alumno actual;
		
		//ejecucion
		actual =new Alumno();
		actual.setNotaPrimerParcial(notaPrimerParcial);
		
		
		//validacion
		assertEquals(notaPrimerParcial,actual.getNotaPrimerParcial());
		
  
	
	}
	@Test
	public void queSiMeSaco7Y10YLasAsistenciasSonDe25HayaAprobado(){
	
		//datos de entrada
		final int NOTA_DE_PRIMER_PARCIAL=7;
		final int NOTA_DE_SEGUNDO_PARCIAL=10;
		final int ASISTENCIA=25;
		Alumno actual;
		
		//ejecucion
		actual =new Alumno();
		actual.setNotaPrimerParcial(NOTA_DE_PRIMER_PARCIAL);
		actual.setNotaSegundoParcial(NOTA_DE_SEGUNDO_PARCIAL);
		actual.setCantidadAsistencias(ASISTENCIA);
		//validacion
		assertTrue(actual.aprobo());
		
  
}
	@Test
	public void queSiMeSaco7Y10YLasAsistenciasSonDe15HayaAprobado(){
	
		//datos de entrada
		final int NOTA_DE_PRIMER_PARCIAL=7;
		final int NOTA_DE_SEGUNDO_PARCIAL=10;
		final int ASISTENCIA=15;
		Alumno actual;
		
		//ejecucion
		actual =new Alumno();
		actual.setNotaPrimerParcial(NOTA_DE_PRIMER_PARCIAL);
		actual.setNotaSegundoParcial(NOTA_DE_SEGUNDO_PARCIAL);
		actual.setCantidadAsistencias(ASISTENCIA);
		//validacion
		assertFalse(actual.aprobo());
	}
	@Test
	public void queSiNoLeAsignoValorAlNombreEsteVacio(){
	
		//datos de entrada
	
		Alumno actual;
		
		//ejecucion
		
		actual =new Alumno();
		//actual.setNombre(new String ("Jime"));//new String ("Jime")==="Jime"
	
		//validacion
		
		assertNotNull(actual); //no es nulo
	
		assertNull(actual.getNombre());//es nulo
	}
	@Test
	public void queElToStringDeAlumnoConcateneElDniMasElNombreConUnGuionEnMedio(){
		
		//datos de entrada
	final int DNI=40886574;
	final String NOMBRE="Pedro";
	String valorEsperado="40886574 - Pedro";
	Alumno actual;
		
		//ejecucion
	actual =new Alumno();
	actual.setDni(DNI);
	actual.setNombre(NOMBRE);
	
	
		//validacion
	assertEquals(valorEsperado,actual.toString());
	}
	@Test
	public void queSiMeSaco7Y10YLasAsistenciasSonDe25HayaPromocionado(){
	
		//datos de entrada
		final int NOTA_DE_PRIMER_PARCIAL=7;
		final int NOTA_DE_SEGUNDO_PARCIAL=10;
		final int ASISTENCIA=25;
		Alumno actual;
		
		//ejecucion
		actual =new Alumno();
		actual.setNotaPrimerParcial(NOTA_DE_PRIMER_PARCIAL);
		actual.setNotaSegundoParcial(NOTA_DE_SEGUNDO_PARCIAL);
		actual.setCantidadAsistencias(ASISTENCIA);
		//validacion
		assertFalse(actual.desaprobo());
		assertTrue(actual.aprobo());
		assertTrue(actual.promociono());
		
  
}
	//------{----------------------------------------------}----------
	
	
	@Test
	public void queSeGenereUnaExcepcion(){
		
		//datos de entrada
  Integer arrayDeEnteros[] =new Integer[100];
  
		
		//ejecucion
	System.out.println(arrayDeEnteros[100]);
	
	//si aca sucede una excepcion es un "error de ejecucion"
	//un faller es un error en un hacer 
		//validacion

	}
	
	//------{----------------------------------------------}----------
	
	@Test
	public void queAlInstanciarUnaPersonaLaEdadSea0Anios(){
		
		//datos de entrada
    Persona actual;
    final int EDAD_ESPERADA=0;
		
		//ejecucion
	actual =new Persona();
	
	
		//validacion
	assertEquals(EDAD_ESPERADA,actual.getEdad());
	}
	
	
	@Test
	public void queUnaPersonaDe12AñosEsMenorDeEdad(){
		
		//datos de entrada
    Persona actual;
    final int EDAD_ESPERADA=12;
    
		
		//ejecucion
	actual =new Persona();
	actual.setEdad(EDAD_ESPERADA);
	
	
		//validacion
	assertEquals(EDAD_ESPERADA,actual.getEdad());
	assertFalse(actual.esMayorDeEdad());
	
	}
	
	@Test
	public void queAlInstanciarUnaPersonaEstaSeEncuentreViva(){
		
		//datos de entrada
    Persona actual;

		//ejecucion
	actual =new Persona();
	
	
		//validacion
	assertTrue(actual.estaViva());
	}
}