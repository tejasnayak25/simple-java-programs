public class Training extends BePracticals implements JPracticals, TPracticals {
    @Override
    public void javaTraining() {
        System.out.println("Java Training");
    }

    @Override
    public void testingTraining() {
        System.out.println("Manual & Automation Training");
    }

    public static void main(String[] args) {
        Training t = new Training();
        t.training();
        t.javaTraining();
        t.testingTraining();
    }
}
