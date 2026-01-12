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
  
}
