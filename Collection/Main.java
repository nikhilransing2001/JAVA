package collection_github;

public class Main
{
    public static void main( String[] args )
    {
        CourseService courseService = new CourseService();

        String courseId = "math_01";
        String studentId = "120120";
        System.out.println("\n========= All Data about Course & Student =========");
        courseService.displayCourseInformation( courseId );
        courseService.displayStudentInformation( studentId);

        System.out.println("\n========= Enrollement Data =========");
        courseService.enrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);

        System.out.println("\n========= Unenrollement Data =========");
        courseService.unEnrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);
    }


}