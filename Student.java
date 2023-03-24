# Thursday-Practical-
class stud
{
   int id;
   String name;
   void setData(int id,String name)
   {
      this.id=id;
      this.name=name;
   }
   void getData()
   {
      System.out.println("Student id :"+id);
      System.out.println("Student Name :"+name);
   }
}

class Student
{
   public static void main(String args[])
   {
        Stud s=new Stud();
        s.setData(10,"Mueez");
        s.getData();
   }
   
}
