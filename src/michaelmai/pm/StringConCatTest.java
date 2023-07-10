package michaelmai.pm;

public class StringConCatTest {
    public static void main(String[] args){

        StringConCatTest test_anyway = new StringConCatTest();
        // 调用下面的方法
        String info = test_anyway.concat("-","Hello","World");
        System.out.println(info);

    }

    public String concat(String operator, String ... strs){
        String result = "";

        for (int i=0; i< strs.length; i++){
            if (i ==0){
                result += strs[i];
            }else {

                result += operator+strs[i];
            }

        }

        return result;
    }


}
