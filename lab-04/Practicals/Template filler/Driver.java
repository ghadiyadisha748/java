public class Driver {

    public static void main(String[] args) {

        String template = "Dear {name}, order {id} ships {date}.";

        String[] names = { "name", "id" };
        String[] values = { "Disha", "14" };

        String output = TemplateFiller.fillTemplate(template, names, values);

        System.out.println(output);
    }
}