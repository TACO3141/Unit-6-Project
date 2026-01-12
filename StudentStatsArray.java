public class StudentStatsArray
{
  private final Student[] students;
  public StudentStatsArray(Student[] students)
  {
    this.students = students;
  }

  public double averageGrade()
  {
    double avg = 0.0;
    for (i = 0; i < students.length - 1; i++)
    {
      avg += students[i].getCurrentGrade();
    }
    avg /= 2;
    return avg;
  }

  public double getGradeRange()
  {
    double min = 0.0;
    double max = 0.0;
    //max:
    for (i = students.length - 1; i > 0; i--)
    {
      if (students[i].getCurrentGrade() > students[i - 1].getCurrentGrade())
      {
        max = students[i].getCurrentGrade();
      }
    }
    
    //min:
    for (i = students.length - 1; i > 0; i--)
    {
      if (students[i].getCurrentGrade() < students[i - 1].getCurrentGrade())
      {
        min = students[i].getCurrentGrade();
      }
    }
    return max - min;
  }

  public String getLongestName()
  {
    String name = "";
    for (i = students.length - 1; i > 0; i--)
    {
      if (students[i].getName().length() > students[i - 1].getName().length())
      {
        name = students[i].getName();
      }
    }
  }

  public int getGradeTens()
  {
    int gradeTens = 0;
    for (i = 0; i < students.length - 1; i++)
    {
      if (student[i].getGradeLevel() == 10)
      {
        gradeTens++;
      }
    }
    return gradeTens;
  }

  public int Search(String name)
  {
    int nameIndex = 0;
    for (i = 0; i < students.length - 1; i++)
    {
      if (students[i].getName().equals(name))
      {
        nameIndex = i;
        break;
      }
    }
  }
}
