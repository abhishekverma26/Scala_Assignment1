package Employee_Management

 import org.scalatest.flatspec.AnyFlatSpec

class EmployeeTest extends AnyFlatSpec {

 "Consultant Id" should "Start with CONS Prefix" in {
  val obj= new Emp_Details
  val Id = obj.consultant("101","Abhishek","Verma",35000)
  assert(Id=="CONS101")
 }

 "Manager id" should "start with MANA Prefix" in {
  val obj= new Emp_Details
  val Id = obj.manager("201","Akshay","Verma",50000)
  assert(Id=="MANA201")
 }

 "Sr Manager id" should "start with SRMA prefix" in {
  val obj = new Emp_Details
  val Id = obj.srManager("301","Ritika","Verma",65000)
  assert(Id=="SRMA301")
 }

 "President id" should "start with POCT prefix" in {
  val obj = new Emp_Details
  val Id = obj.president("401","Himanshu","Verma",90000)
  assert(Id=="POCT401")
 }

}
