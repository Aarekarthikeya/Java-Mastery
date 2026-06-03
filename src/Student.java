public class Student {
    private String name;
    private int id;
    public Student(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    public static void main(String[] args) {
        Student s1= new Student("virat",18);
        Student s2= new Student("virat",18);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s1));
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());

        s2=null;
        System.out.println(s1.equals(s2));

    }
    @Override
    public  String toString()
    {
        return " name : " + name +" id: "+id ;
    }
  @Override
    public boolean equals(Object obj)
  {
    if(this==obj)
    {
        return true;
    }
    if(obj==null)
    {
        return false;
    }
    if(getClass()!=obj.getClass())
    {
        return false;
    }
    Student other = (Student) obj;
    if(this.name==null)
    {
        return other.name==null&&this.id==other.id;
    }
    return this.id==other.id &&this.name.equals(other.name);

  }
  @Override
    public int hashCode()
  {
      int result=17;
      result=result*31+id;
      if(name!=null)
      {
          result+=name.hashCode();
      }
      return result;
  }
}
