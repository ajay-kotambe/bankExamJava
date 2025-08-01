public class Validator {

    public boolean validateName(String name) {
        if (name.equals(" ") || name == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validateJobProfile(String jobProfile) {
        boolean indicator = false;
        String[] jobProfiles = { "Associate", "Clerk", "Executive", "Officer" };
        for (String string : jobProfiles) {
            if (jobProfile.toLowerCase().equals(string.toLowerCase())) {
                indicator = true;
            }
        }
        return indicator;
    }

    public boolean validateAge(int age) {

        if (age >= 18 && age <= 30) {
            return true;
        } else if (age == 0) {
            return false;
        }else{
            return false;
        }
    }

    public void validate(Applicant applicant)
            throws InvalidNameException, InvalidJobProfileException, InvalidAgeException {
        if (validateName(applicant.getName())) {
            if (validateJobProfile(applicant.getJobProfile())) {
                if (validateAge(applicant.getAge())) {

                } else {
                    throw new InvalidAgeException("Invalid age");
                }

            } else {
                throw new InvalidJobProfileException("Invalid job profile");
            }

        } else {
            throw new InvalidNameException("Invalid name");
        }
    }
}
