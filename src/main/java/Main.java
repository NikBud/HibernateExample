import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

//        Course course = session.get(Course.class, 1);
//        System.out.println(course.getStudents());

//        Subscriptions subs = session.get(Subscriptions.class, 1);
//        System.out.println(subs.getStudent());



        // ************* Получение списка всех курсов на которые записан каждый студент (метод getSubscriptionsList())**********
//        Student student = session.get(Student.class, 1);
//        System.out.println(student.getName());
//        List<Subscriptions> list = student.getSubscriptionsList();
//        for (Subscriptions subs : list){
//            System.out.println(subs.getCourse().getName());
//        }



        //************** Получение списка всех студентов, которые записаны на каждый курс (метод getSubscriptionsList()) ***********
//        Course course = session.get(Course.class, 1);
//        System.out.println(course.getName());
//        List<Subscriptions> list1 = course.getSubscriptionsList();
//        for(Subscriptions s : list1){
//            System.out.println(s.getStudent().getName());
//        }



        //************** Получение списка всех предметов которые ведет один учитель ;;;;;;;;;;;;;;;;;;;;;;;
//        Teacher teacher = session.get(Teacher.class, 10);
//        System.out.println(teacher.getName());
//        List<Course> courses = teacher.getCourseList();
//        for (Course c : courses){
//            System.out.println(c.getName());
//        }



        // HQL
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<Course> query = builder.createQuery(Course.class);
//        Root<Course> root = query.from(Course.class);
//        query.select(root).where(builder.greaterThan(root.get("price"), 100000));

//        List<Course> courseList = session.createQuery(query).getResultList();
//        for (Course c : courseList){
//            System.out.println(c.getName() + " - " + c.getPrice());
//        }


        //session.createQuery("FROM Course WHERE price > 100000").getResultList().stream().forEach(System.out::println);


        session.close();
        sessionFactory.close();
    }
}
