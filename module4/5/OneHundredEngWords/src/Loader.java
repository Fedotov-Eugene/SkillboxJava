public class Loader {
    public static void main(String[] args) {
        String text = " In a recent study in the journal PLOS Computational Biology, Wise and colleagues discovered that people will give their attention to things they perceive as potentially dangerous, whether they know much about the subject in question or not. (Learn more about the science of fear.)\n" +
                "\n" +
                "In the study, 65 participants were shown two different images on a screen, one of which was consistently associated with the person receiving a mild electric shock, while the other image’s connection to an electric shock varied. By watching the subjects’ eye movements, researchers learned that they paid closer attention to the image definitely linked to the electric shock—showing that people will pay attention to something they already perceive as dangerous.\n" +
                "\n" +
                "These results may be explained by interpretation bias, or a tendency to perceive something as being better or worse than it really is. Someone with a negative interpretation bias, for example, is “interpreting what they’re seeing as a cougar because they tend to interpret things as being threatening if they’re not,” Wise notes.\n" +
                "\n" +
                "Conversely if a person has a positive information bias and see a cougar in what’s really a tabby, they might find the thought of seeing a cougar exciting, he says.\n" +
                "\n" +
                "Ramos falls into that camp. “There shouldn’t be fear,” she says of seeing a wildcat. “It should be a beautiful moment, and you should cherish it.” (Read about the intriguing social lives of cougars.)";

        String text2 = text.replaceAll("[^A-z’]", " ");
        String[] array = text2.replaceAll("\\s+", " ").trim().split(" ");

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
