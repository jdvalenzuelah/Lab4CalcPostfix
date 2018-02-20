
/**
 * Calculadora para realizar calculos postfix
 * @author David Valenzuela 171001
 * @author Fernando Hengstenberg 17699
 */
public class CalculadoraPostFix implements Calculadora {

	/**
	 * Se crea una instancia de si misma
	 */
	private static CalculadoraPostFix instance;
	
	/**
	 * Stack con el que se trabajara
	 */
	private AbstractStack<Integer> stack;
	
	/**
	 * Constructor es declarado privado para que no pueda ser accesado
	 */
	private CalculadoraPostFix() {
		super();
	}
	
	/**
	 * Metodo que se encarga que solo haya una instancia de la calculadora
	 * @return Referencia de la instancia de la calculadora postfix
	 */
	public static CalculadoraPostFix getInstance() {
		if(instance == null) {
			instance = new CalculadoraPostFix();
		}
		return instance;
	}
	
	/**
	 * Definir el tipo de stack a utilizar, caso predeterminado lo crea con un ArrayList
	 * @param tipoStack tipo de stack a implementar (arrayList, Vector, lista (simple, circular, doble))
	 */
	public void setStack(String tipoStack) {
		AbstractFactory<Integer> factory;
		tipoStack = tipoStack.toLowerCase();
		if(tipoStack.equals("arraylist")) {
			factory = new StackArrayListFactory<Integer>();
			this.stack = factory.crearStack("");
		}else if(tipoStack.equals("vector")) {
			factory = new StackVectorFactory<Integer>();
			this.stack = factory.crearStack("");
		}else if(tipoStack.equals("simple")) {
			factory = new StackListFactory<Integer>();
			this.stack = factory.crearStack(tipoStack);
		}else if(tipoStack.equals("doble")) {
			factory = new StackListFactory<Integer>();
			this.stack = factory.crearStack(tipoStack);
		}else if(tipoStack.equals("circular")) {
			factory = new StackListFactory<Integer>();
			this.stack = factory.crearStack(tipoStack);
		}else {
			factory = new StackArrayListFactory<Integer>();
			this.stack = factory.crearStack("");
		}
	}
	/* (non-Javadoc)
	 * @see Calculadora#calcular(java.lang.String)
	 */
	@Override
	public String calcular(String operacion) {
		String[] splitOperacion = operacion.split(" ");
		for( String charOperacion : splitOperacion) {
			try {
				stack.push(Integer.parseInt(charOperacion));
			}catch(Exception e){
				if(charOperacion.equals("+")) {//condicion 1
					Integer resul = this.stack.pop();
					resul += this.stack.pop();
					this.stack.push(resul);
				}else if(charOperacion.equals("-")) {//condicion 2
					Integer resul = this.stack.pop();
					resul -= this.stack.pop();
					this.stack.push(resul);
				}else if(charOperacion.equals("*")) {
					Integer resul = this.stack.pop();
					resul *= this.stack.pop();
					this.stack.push(resul);
				}else if(charOperacion.equals("/")) {
					try{
						Integer resul = this.stack.pop();
						resul /= this.stack.pop();
						this.stack.push(resul);
					}catch(ArithmeticException er){
						return("Error: "+ er.getMessage());
					}
				}else{
					return "Error: Caracter incorrecto";
				}
			}
		
		}
			
		return this.stack.peek().toString();
	}

}
