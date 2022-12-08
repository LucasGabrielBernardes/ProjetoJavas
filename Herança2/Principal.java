package auala11;

public class Principal {
	public static void main(String[] args) {

		Aluno l1 = new Aluno();

		l1.setNome("lucas");
		l1.setMatricula(111);
		l1.setCurso("informatica");
		l1.setIdade(16);
		l1.setSexo("m");
		l1.pagarMensalidade();

		Bolsista b1 = new Bolsista();

		b1.setMatricula(1112);
		b1.setNome("gabigol");
		b1.setBolsa(12);
		b1.setSexo("M");
		b1.pagarMensalidade();

		Professor p1 = new Professor();
		p1.setIdade(22);
		p1.setNome("juju");
		p1.setSalario(1000);
		p1.setSexo("M");
		p1.setSpecialidade("matar pessoas");
		p1.receberAumaneto();
		System.out.println(p1.getSpecialidade());

	}
}
