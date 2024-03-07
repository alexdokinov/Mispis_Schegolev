import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {
        Faculty csf = new Faculty("Computer Science Faculty");
        Institute vsu = new Institute("Voronezh State University", "University square, 1");
        Institute fi = new Institute("Forestry Institute", "Timeryazeva street, 8");
        csf.setInstitutes(new Institute[]{vsu, fi});

        ResearchStaff employee1 = new ResearchStaff(1, "Aleksey Popovich", "alpop@gmail.com", "economy");
        ResearchStaff employee2 = new ResearchStaff(2, "Dobryna Nikitich", "dobronik@gmail.com", "economy");
        ResearchStaff employee3 = new ResearchStaff(3, "Ilya Murometc", "ilyamurom@gmail.com", "finance");
        ResearchStaff employee4 = new ResearchStaff(4, "Svyztogor Velikiy", "bigmount@gmail.com", "finance");
        vsu.setEmployees(new ResearchStaff[]{employee1, employee3});
        fi.setEmployees(new ResearchStaff[]{employee2, employee4});

        Project project1 = new Project("Lizard strangling 101",
                new SimpleDateFormat( "dd.MM.yyyy" ).parse( "01.01.2023" ),
                new SimpleDateFormat( "dd.MM.yyyy" ).parse( "29.12.2023" ), new Participation(5));
        employee1.setProjects(new Project[]{project1});

        Course course1 = new Course("Baikal Water: Simple truths", 25, 60);
        Lecturer lecturer1 = new Lecturer(5, "Mihail Velikiy", "mishathegreat@gmail.com", "health");
        lecturer1.setCourses(new Course[]{course1});

        AdministrativeStaff administrativeStaff = new AdministrativeStaff(6,
                "Cave Jonson", "aperture@gmail.com", "admin");

        Institute[] institutes = csf.getInstitutes();
        System.out.println("Institutes on " + csf.getName() + ": \n");
        for (Institute institute : institutes) {
            System.out.println(institute.getName());
        }
        System.out.println();

        ResearchStaff[] researchEconomy = vsu.getEmployees();
        System.out.println("Research Associates of " + vsu.getName() + ":");
        for (ResearchStaff researchStaff : researchEconomy) {
            System.out.println(researchStaff.getName());
        }
        System.out.println();

        ResearchStaff[] researchFinance = fi.getEmployees();
        System.out.println("Research Staff of " + fi.getName() + ":");
        for (ResearchStaff researchStaff : researchFinance) {
            System.out.println(researchStaff.getName());
        }
        System.out.println();

        Project[] projects = employee1.getProjects();
        System.out.println("Projects of " + employee1.getName() + ":");
        for (Project project : projects) {
            System.out.println(project.getName());
        }
        System.out.println();

        Course[] courses = lecturer1.getCourses();
        System.out.println("Courses of " + lecturer1.getName() + ":");
        for (Course course : courses) {
            System.out.println(course.getName());
        }
        System.out.println();

        System.out.println("Administrator:");
        System.out.println(administrativeStaff.getName());
    }
}