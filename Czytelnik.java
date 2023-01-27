public class Czytelnik{
  String imie;
  String nazwisko;
  public Czytelnik(String imie,String nazwisko){
    this.imie=imie;
    this.nazwisko=nazwisko;
  }
  public String toString(){
    return "Nazywam się "+imie+" "+nazwisko;
  }
}