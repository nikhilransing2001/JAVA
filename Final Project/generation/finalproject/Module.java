package generation.finalproject;

import java.util.HashMap;
import java.util.Map;

public class Module {
   private final String code;
   private final String name;
   private final String description;
   private final Map<String, Module> prerequisites = new HashMap();

   public Module(String code, String name, String description) {
      this.code = code;
      this.name = name;
      this.description = description;
   }

   public void addPrerequisite(Module module) {
      this.prerequisites.put(module.code, module);
   }

   public String getCode() {
      return this.code;
   }

   public String getName() {
      return this.name;
   }

   public String getDescription() {
      return this.description;
   }

   public Map<String, Module> getPrerequisites() {
      return this.prerequisites;
   }

   public String toString() {
      return "Module{name='" + this.name + '\'' + '}';
   }
}

