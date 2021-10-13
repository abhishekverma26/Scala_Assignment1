package Employee_Management

trait Employee {

  def consultant(id: String, fname: String, lname: String, Salary: Int): String
  def manager(id: String, fname: String, lname: String, Salary: Int): String
  def srManager(id: String, fname: String, lname: String, Salary: Int): String
  def president(id: String, fname: String, lname: String, Salary: Int): String

}

class Emp_Details extends Employee{

  private val prefix = Array("CONS","MANA","SRMA","POCT")
  var id: String = ""
  var fname: String=""
  var lname: String=""
  var salary: Int = 0

  def consultant(id: String, fname: String, lname: String, salary: Int): String ={
    this.id = prefix(0)+id
    this.fname = fname
    this.lname = lname
    this.salary = salary

    this.id
  }

  def manager(id: String, fname: String, lname: String, salary: Int): String ={
    this.id = prefix(1)+id
    this.fname = fname
    this.lname = lname
    this.salary = salary

    this.id
  }

  def srManager(id: String, fname: String, lname: String, salary: Int): String ={
    this.id = prefix(2)+id
    this.fname = fname
    this.lname = lname
    this.salary = salary

    this.id
  }

  def president(id: String, fname: String, lname: String, salary: Int): String ={
    this.id = prefix(3)+id
    this.fname = fname
    this.lname = lname
    this.salary = salary

    this.id
  }

}

class Attendance_Service {

  def attendance(emp: Emp_Details, start_time:String, end_time: String): String ={
    (emp.id+emp.fname+emp.lname+emp.salary+start_time+end_time)
  }

  def attendance(emp: Emp_Details): String = {
    val start_time = "9:45 AM"
    val end_time = "6:45 PM"
    (emp.id+emp.fname+emp.lname+emp.salary+start_time+end_time)

  }

}