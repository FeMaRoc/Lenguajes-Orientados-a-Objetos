using System;
class RelojTest {
  static void Main() {
      
      Reloj h1 = new Reloj();
      
      h1.Horas = 16;
      h1.Minutos = 27;
      h1.Segundos = 38;
      
      Console.WriteLine(h1.DarLaHora());
      Console.WriteLine(h1.AMoPM());
      Console.WriteLine(h1);
      
      Console.WriteLine("");
      
      Reloj h2 = new Reloj(23, 59, 59);
     
      Console.WriteLine(h2.DarLaHora());
      Console.WriteLine(h2.AMoPM());
      Console.WriteLine(h2);
  }
}