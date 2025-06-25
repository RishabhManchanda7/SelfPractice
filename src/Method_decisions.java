public class Method_decisions {

    static void CheckAge (int age ){
        if (age < 18 ){

            System.out.println(" Not elegible ");
        }
        else {
            System.out.println(" Is elegible ");
        }
    }

    public static void main(String[] args) {
        CheckAge(10);
    }

}
