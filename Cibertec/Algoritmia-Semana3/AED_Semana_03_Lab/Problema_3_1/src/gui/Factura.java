package gui;

public class Factura {
	private String ruc,empresa;
	private int unidades;
	private double precioUni;
	
	private static int cantidad;

	private static double totImporteFac;
	
	public static final String texto;
	
	static {
		cantidad=0;
		totImporteFac=0.0;
		texto="Sunat";
	}

	public Factura(String ruc, String empresa, int unidades, double precioUni) {
		//Inicializar todos	los atributos
		this.ruc = ruc;
		this.empresa = empresa;
		this.unidades = unidades;
		this.precioUni = precioUni;
		cantidad++;
		//acumulando el total facturado
		totImporteFac+=ImporteFacturado();
		
	}
	
	public Factura(String ruc, String empresa) {
		this(ruc,empresa,10,50.0);
	}
	public Factura() {
		this("10401381291", "os S.A.C");
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getPrecioUni() {
		return precioUni;
	}

	public void setPrecioUni(double precioUni) {
		this.precioUni = precioUni;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Factura.cantidad = cantidad;
	}

	public static double getTotImporteFac() {
		return totImporteFac;
	}

	public static void setTotImporteFac(double totImporteFac) {
		Factura.totImporteFac = totImporteFac;
	}

	public double ImporteFacturado() {
		return unidades*precioUni;
	}

}
