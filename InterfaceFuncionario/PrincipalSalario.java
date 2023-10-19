package InterfaceFuncionario;

public class PrincipalSalario {

	public static void main(String[] args) {
		
		Jornada hora = new Jornada ();
		System.out.println(hora.calculaSalario(50, 12));
		
		Horista horista = new Horista ();
		System.out.println(horista.calculaSalario(80, 12));
		
		PessoaJuridica impostos = new PessoaJuridica();
		
		System.out.println(impostos.calculaSalario(60000, 2000));
		
		
	}
}
