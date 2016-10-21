
/**
 * Write a description of class TrainStation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EstacionDeTren
{
    private MaquinaDeTickets maquina1;
    private MaquinaDeTickets maquina2;
    private int totalMoney;

    public EstacionDeTren()
    {
        maquina1 = new MaquinaDeTickets(300);
        maquina2 = new MaquinaDeTickets(200);
        totalMoney = 0;
  }
  
  public void imprimirDineroTotal()
    {
        totalMoney = maquina1.getTotal();
        totalMoney = totalMoney + maquina2.getTotal();
        System.out.println(totalMoney);
    }
    /**
     * Conseguir que compre un billete en cada maquina y despues lo imprima
     */
    public void imprimirBilletes()
       {
        maquina1.insertarDinero(300);
        maquina2.insertarDinero(200);
        maquina1.imprimirTicket();
        maquina2.imprimirTicket();
    }
}
  
