import java.util.Date;
import java.lang.*;


/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 *
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	public int studentId;
	public String fullname;
	public Date birthdate;
	public double avgMark;

	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {

	    return students;

       		// Add your implementation here

	}

	@Override
	public void setStudents(Student[] students) {

      if (students == null) {
			throw new IllegalArgumentException("Students is null");
		}
		else{
                this.students = students;

        }


		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
	     if (students == null){
            throw new IllegalArgumentException("Students is null");
        }
       return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
	    if (students == null){
            throw new IllegalArgumentException("Students is null");
        }

        students[index] = student;


	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation hereint i=this.students.length;
		int i;
		for(int j=i;j>0;j--)
		this.students[j]=this.students[j-1];
		this.students[0]=student;
		this.students[i+1]=null;

	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
	     if (students == null){
            throw new IllegalArgumentException("Students is null");
        }


		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
int n;
	int l=this.students.length;
		int max=this.students[0].avgMark;
		for(int i=0;i<l;i++)
		 if(this.students[i].avgMark > max)
			max=this.students[i].avgMark;
           Students()
           {


			Student students1[]= new Student();
           }
			int k=0;
			for(int j=0;j<n;j++)
			{
                           if(this.students[i].avgMark == max)
				students1[k++]=this.students[i];
                         }
           }
		return students;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}


}
