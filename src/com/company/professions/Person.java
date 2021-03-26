package com.company.professions;

public class Person {
   private String fullName;
   private int age;

   public void setFullName(String fullName) {
      this.fullName = fullName;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getFullName() {
      return fullName;
   }

   public int getAge() {
      return age;
   }

   public Person(String fullName, int age) {
      this.fullName = fullName;
      this.age = age;
   }

   @Override
   public String toString() {
      return "fullName='" + fullName + '\'' +
              ", age=" + age +
              '}';
   }
}
