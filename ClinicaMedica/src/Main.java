public class Main {

    public static void main(String[] args) {

        Medico Cesar = new Medico("Cesar", "Oftalmologista");
        Medico Jose = new Medico("Jose", "Dermatologista ");
        Medico Carol = new Medico("Carol", "Cardiologista ");

        Paciente p1 = new Paciente("Pedro", "12321", 42, "00000");
        Paciente p2 = new Paciente("Rafael", "32132", 12, "11111");
        Paciente p3 = new Paciente("Lucas", "63517", 33, "22222");
        Paciente p4 = new Paciente("Guilherme", "51512", 22, "33333");
        Paciente p5 = new Paciente("Bianca", "36364", 72, "44444");

        Agenda agenda1 = new Agenda(Cesar);
        agenda1.setData("22/04/2026");
        agenda1.adicionar(p1);
        agenda1.adicionar(p4);
        agenda1.apresentarListaDePacientes();

        Agenda agenda2 = new Agenda(Jose);
        agenda2.setData("14/02/2027");
        agenda2.adicionar(p3);
        agenda2.adicionar(p2);
        agenda2.apresentarListaDePacientes();

        Agenda agenda3 = new Agenda(Carol);
        agenda3.setData("08/12/2026");
        agenda3.adicionar(p5);
        agenda3.apresentarListaDePacientes();

        agenda2.remover("63517");
    }



}
