##Data klase 

* data klase koristimo kada želimo da kreiramo klase koje nose podatke

* data klase se definišu dodavanjem **data** modifikatora ispred deklaracije klase
 
 >data class User(val name: String, val surname: String, val age: Int)
 
 Data klasa generiše:
  * equals()/hashCode() metode
  * toString() method - "User(name=James, surname=Dean age=34)"
  * component1(), component2(),....componentN() - koriste se za dekompoziciju deklaracija
 >val (name, surname, age) = User(name=James, surname=Dean age=34)
  * copy() - koristi se kada želimo da kopiramo neki objekat sa minimalnim izmenama
  > val user = User(name=James, surname=Dean age=34)
  > val user1 = user.copy(age = 22)  //User(name=James, surname=Dean age=22) 
