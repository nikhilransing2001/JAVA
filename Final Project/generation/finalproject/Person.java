package generation.finalproject;

import java.util.Date;

public abstract class Person {
   private final String id;
   private final String name;
   private final String email;
   private final Date birthDate;

   protected Person(String id, String name, String email, Date birthDate) {
      this.id = id;
      this.name = name;
      this.email = email;
      this.birthDate = birthDate;
   }

   public String getId() {
      return this.id;
   }

   public String getName() {
      return this.name;
   }

   public String getEmail() {
      return this.email;
   }

   public Date getBirthDate() {
      return this.birthDate;
   }

   public String toString() {
      return this.id + '\'' + ", name='" + this.name + '\'' + ", email='" + this.email + '\'' + ", birthDate=" + this.birthDate;
   }
}

