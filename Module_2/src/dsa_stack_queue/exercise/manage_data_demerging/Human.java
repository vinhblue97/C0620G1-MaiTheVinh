package dsa_stack_queue.exercise.manage_data_demerging;

class Human {
    private String gender;
    private String dateOfBirth;

    public Human(String gender, String dateOfBirth){
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
