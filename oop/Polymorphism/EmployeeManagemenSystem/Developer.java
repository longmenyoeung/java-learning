package LessonJava.oop.Polymorphism.EmployeeManagemenSystem;

class Developer extends Employee{
    private String programmingLanguage;
    private int experienceYears;

    public Developer(String programingLanguage, int experienceYears,int id, String name, String email , double baseSalary){
        super(id,name,email, baseSalary);
        this.programmingLanguage = programingLanguage;
        this.experienceYears = experienceYears;
    }

    public String getProgrammingLanguage(){
        return programmingLanguage;
    }
    public void setProgrammingLanguage(String programmingLanguage){
        this.programmingLanguage = programmingLanguage;
    }
    public int getExperienceYears(){
        return experienceYears;
    }
    public void setExperienceYears(int experienceYears){
        this.experienceYears = experienceYears;
    }


    @Override
    public double calculateSalary() {
        double bonusPercentage = 0.0;
        double base = getBaseSalary();

        // Fixed gaps: covers <=2, 3-4, and 5+ continuously
        if (this.experienceYears <= 2) {
            bonusPercentage = 0.0;
        } else if (this.experienceYears <= 4) {
            bonusPercentage = 0.10; // 2–4 years -> 10% bonus
        } else {
            bonusPercentage = 0.20; // More than 4 years (5+) -> 20% bonus
        }

        // Correct Math: Base Salary + (Base Salary * Bonus Percentage)
        double totalSalary = base + (base * bonusPercentage);
        return totalSalary;
    }




    public void display(){
        super.display();
        System.out.println("Programing Language : " +programmingLanguage);
        System.out.println("ExperienceYears : " +experienceYears);
        System.out.println("Final Salary: " + calculateSalary());
    }
}
