public class University_Management {
    public static class Student {
        public int rollNumber;
        protected String name;
        private double CGPA;

        public Student(int rollNumber, String name, double CGPA) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.CGPA = CGPA;
        }

        public double getCGPA() {
            return CGPA;
        }

        public void setCGPA(double CGPA) {
            this.CGPA = CGPA;
        }
    }

    public static class PostgraduateStudent extends Student {
        private String thesisTitle;

        public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTitle) {
            super(rollNumber, name, CGPA);
            this.thesisTitle = thesisTitle;
        }

        public String getStudentName() {
            return name;
        }

        public String getThesisTitle() {
            return thesisTitle;
        }

        public void setThesisTitle(String thesisTitle) {
            this.thesisTitle = thesisTitle;
        }
    }
}
