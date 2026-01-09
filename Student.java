public class Student 
{
  private String name;
  private Double currentGrade;
  private int gradeLevel;

  public Student(String name, double currentGrade, int gradeLevel)
  {
    this.name = name;
    this.currentGrade = currentGrade;
    this.gradeLevel = gradeLevel;
  }

  public String getName()
  {
    return name;
  }

  public double getCurrentGrade()
  {
    return currentGrade;
  }

  public int getGradeLevel()
  {
    return gradeLevel;
  }

  public String toString()
  {
    System.out.println("{");
    System.out.println("name: " + name + ",");
    System.out.println("current grade: " + currentGrade + ",");
    System.out.println("grade level: " + gradeLevel + "\n}")
  }

  
}
