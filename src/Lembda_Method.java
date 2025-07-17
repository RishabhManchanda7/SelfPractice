interface StrFun{

    String run(String str);
}


public class Lembda_Method {
    public static void main(String[] args) {

        StrFun exclaim = (s) -> s + " !!!";
        StrFun query = (s) -> s + "??";

        askquery("hello", exclaim);
        askquery("Are you there", query);

    }
        public static void askquery (String str, StrFun format){

            String result = format.run(str);
            System.out.println(result);
        }

}
