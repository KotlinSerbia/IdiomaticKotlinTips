#Data classes

* data classes are used when we want to create classes that hold data

* data class is defined by adding **data** modifier in front of class declaration
 
 >data class User(val name: String, val surname: String, val age: Int)
 
 Data class generates:
  * equals()/hashCode() methods
  * toString() method - "User(name=James, surname=Dean age=34)"
  * component1(), component2(),....componentN() used for declaration destructuring
 >val (name, surname, age) = User(name=James, surname=Dean age=34)
  * copy() - copies object 
  > val user = User(name=James, surname=Dean age=34)
  > val user1 = user.copy(age = 22)  //User(name=James, surname=Dean age=22) 
