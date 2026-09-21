package ap5.repaso;

public class MyDate {
	
	private int dia;
	private int mes;
	private int year; //Suena muy mal en español
	
	public MyDate(int dia, int mes, int year) throws Exception{
		boolean diamuyalto = (dia > 30 && (mes%2==0) || (dia>28 && mes==2 && year%4 != 0) || (dia>29 && mes==2 && year%4 == 0));
		boolean mesmuyalto = (mes > 12);
		if(diamuyalto || mesmuyalto) {
			throw new Exception("Fecha no válida");
		}
		this.dia=dia;
		this.mes=mes;
		this.year=year;
		
		
	}
	
	public int getDay() {
		return dia;
	}
	
	public int getMonth() {
		return mes;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setDay(int dia) {
		this.dia=dia;
	}
	
	public void setMonth(int mes) {
		this.mes=mes;
	}
	
	public void setYear(int year) {
		this.year=year;
	}
	
	public String toString() {
		return "La fecha de hoy es: " + dia + "/" + mes + "/" + year + "."; //Nos ahorramos una línea
	}
	
}
