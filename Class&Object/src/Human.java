/**
 * Author: zhang
 * Time: 9/22/2017
 * Description:
 */
class InjuredException extends Exception{}
class FallDownException extends InjuredException{}

 class Human {
    public static void main(String[] args)throws Exception {
        new Human().doAction();
        System.out.println("Finished");
    }

    public void doAction() throws Exception{
        try{
            try{
                throw new FallDownException();
            }
            catch (InjuredException a){
                System.out.println("caught Injured Exception");
                throw a;
            }
        }
        catch (FallDownException s){
            System.out.println("cauaht falldown exception");
            return;
        }finally {
            System.out.println("Hello world");
        }
    }
}
