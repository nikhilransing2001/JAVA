package generation.finalproject;

public class Course {
   private final String code;
   private final String name;
   private final int credits;
   private final Module module;

   public Course(String code, String name, int credits, Module module) {
      this.code = code;
      this.name = name;
      this.credits = credits;
      this.module = module;
   }

   public String getCode() {
      return this.code;
   }

   public String getName() {
      return this.name;
   }

   public int getCredits() {
      return this.credits;
   }

   public Module getModule() {
      return this.module;
   }

   public String toString() {
      return "Course{code='" + this.code + '\'' + ", name='" + this.name + '\'' + ", credits=" + this.credits + ", module=" + this.module + '}';
   }
}
