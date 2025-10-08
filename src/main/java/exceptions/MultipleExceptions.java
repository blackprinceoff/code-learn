package exceptions;

public class MultipleExceptions {
    public static void main(String[] args) {
        // one try, many catch
        try {
            int[] num = {1, 2, 3};
            System.out.println(num[10]);
            int res = 10/0;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array is too much");
        } catch (ArithmeticException e){
            System.out.println("we cannot divide by 0");
        } catch (Exception e ){
            System.out.println("just exeption");
        }

        //order matters
        /*try {
            int res = 10 / 0;
        } catch (Exception e){
            System.out.println("general error");// краще просто exception використовувати в кінці
        } catch (ArithmeticException e) {
            System.out.println("divide by 0");
        }*/

        //Multi-Catch
        try {
            int res = 10/0;
            int[] nums = {1,2,3};
            System.out.println(nums[10]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Math error and error array");
        }
    }
}
