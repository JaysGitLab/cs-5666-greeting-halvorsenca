public class Hello {
    public Hello(){
    }
    public void sayHelloToMe() {
        System.out.println("Hello, Chad");
    }
    public void sayHelloToSomeone(String name) {
        String out = name.substring(0,1).toUpperCase() + name.substring(1);

        System.out.println("Hello, " + out);
    }
    public static void main(String[] args) {
        Hello hello = new Hello();
        if (args.length == 0 ) {
            hello.sayHelloToMe();
        }
        else if (args.length == 1) {
            hello.sayHelloToSomeone(args[0]);
        }
        else {
            System.out.println("you must have a name, right?");
        }
    }
}

